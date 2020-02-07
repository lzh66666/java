package nuc.ss.examination.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nuc.ss.examination.dao.IUserDao;
import nuc.ss.examination.dao.UserDaoImpl;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IUserService;
import nuc.ss.examination.service.UserServiceImpl;

public class AdminMessageFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private IUserDao userDao = new UserDaoImpl();
	private User user;
	private User deleteUser;
	private String account;
	private int rowSelect = -1;

	public AdminMessageFrame() {
		this.init();
	}

	public AdminMessageFrame(String title, User user) {
		super(title);
		this.user = user;
		this.init();
	}

	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();
	private final JPanel panel = new JPanel();
	private JButton backButton = new JButton("����");
	private JButton deleteButton = new JButton("ɾ��");

	@Override
	protected void setup() {
		panel.setLayout(null);
		panel.setBounds(0, 380, 700, 100);
		backButton.setBounds(170, 0, 80, 30);
		deleteButton.setBounds(370, 0, 80, 30);
		// ����JTable�е�����
		Vector<String> columnNames = new Vector<>();
		columnNames.add("����");
		columnNames.add("���");
		columnNames.add("�˺�");
		columnNames.add("��ɫ");
		// ����JTable�ı������
		Vector<Vector<String>> tableValues = new Vector<>();
		HashMap<String, User> users = userDao.getAllUser();
		Iterator<Entry<String, User>> iter = users.entrySet().iterator();
		Entry<String, User> entry;
		User judgeUser;
		
		for(int row = 0; row < users.size(); row++) {
			Vector<String> rowV = new Vector<>();
			entry = iter.next();
			judgeUser = userDao.selectOne(entry.getKey());
			if(!judgeUser.getType().equals(" �� �� Ա")) {
				rowV.add(entry.getValue().getName());
				rowV.add(entry.getValue().getId());
				rowV.add(entry.getValue().getAccount());
				rowV.add(entry.getValue().getType());
			}else {
				continue;
			}
			tableValues.add(rowV);
		}
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(tableValues, columnNames);
		// ����JTable�ı��ģ��
		table.setModel(defaultTableModel);
		/*
		 * ��JTable��ӵ�JScrollPane�У�
		 */
		scrollPane.setViewportView(table);

		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// ������ʾ
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		table.setDefaultRenderer(Object.class, r);
	}

	@Override
	protected void addElement() {
		panel.add(backButton);
		panel.add(deleteButton);
		add(panel);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	protected void addListener() {
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rowSelect = table.getSelectedRow();
				account = (String) table.getValueAt(rowSelect, 2);
			}
		});

		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rowSelect = -1;
				table.clearSelection();
			}
		});

		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AdminFrame adminFrame = new AdminFrame(user.getName() + "����Ա�����Ծ�����", user);
				adminFrame.getAdminFrame().setVisible(true);
				setVisible(false);
			}
		});
		deleteButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (rowSelect != -1) {
					//�޸��ļ�����Ϣ
					deleteUser = userDao.selectOne(account);
					IUserService userService = new UserServiceImpl();
					if(userService.remove(deleteUser) != null) {
						// �޸ı������
						DefaultTableModel dt = (DefaultTableModel)table.getModel();
						dt.removeRow(rowSelect);
						JOptionPane.showMessageDialog(AdminMessageFrame.this, "ɾ���ɹ�");
					}
					
				} else {
					JOptionPane.showMessageDialog(AdminMessageFrame.this, "û��ѡ����Ӧ���û�");
				}
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700, 450);
		// JFrame�������
		this.setLocationRelativeTo(null);
	}

}
