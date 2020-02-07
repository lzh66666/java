package nuc.ss.examination.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Vector;

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
import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IStudentScoreService;
import nuc.ss.examination.service.StudentScoreServiceImpl;

public class TeacherExamFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	TeacherExamFrame teacherExamFrame;
	
	private User user;
	private String account;
	private int rowSelect = -1;
	private IStudentScoreService studentScoreService = new StudentScoreServiceImpl();
	private IUserDao userDao = new UserDaoImpl();
	private User studentUser;
	
	public TeacherExamFrame() {
		this.init();
	}

	public TeacherExamFrame(String title, User user) {
		super(title);
		this.user = user;
		teacherExamFrame = this;
		this.init();
	}
	
	public TeacherExamFrame getTeacherExamFrame(){
		return teacherExamFrame;
	}
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable table = new JTable();
	private final JPanel panel = new JPanel();
	private JButton backButton = new JButton("����");
	private JButton scoreButton = new JButton("���");

	@Override
	protected void setup() {
		panel.setLayout(null);
		panel.setBounds(0,380,700,100);
		backButton.setBounds(170,0,80,30);
		scoreButton.setBounds(370,0,80,30);
		// ����JTable�е�����
		Vector<String> columnNames = new Vector<>();
		columnNames.add("ѧ���˺�");
		columnNames.add("ѧ������");
		columnNames.add("��������");
		columnNames.add("ѡ�����");
		columnNames.add("�������");
		// ����JTable�ı������
		
		HashMap<String, Score> scores = studentScoreService.getAllScore();
		Iterator<Entry<String, Score>> iter = scores.entrySet().iterator();
		
		Vector<Vector<String>> tableValues = new Vector<>();
		Entry<String, Score> entry;
		
		
		for (int row = 0; row < scores.size(); row++) {
			Vector<String> rowV = new Vector<>();
			entry = iter.next();
			rowV.add(entry.getValue().getAccount());
			rowV.add(entry.getValue().getName());
			rowV.add(entry.getValue().getData());
			rowV.add(entry.getValue().getScore()+"");
			if(entry.getValue().getQuestionScore() != 0.0) {
				rowV.add(entry.getValue().getQuestionScore()+"");
			}else {
				rowV.add("δ��");
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
		panel.add(scoreButton);
		add(panel);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	protected void addListener() {

		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				rowSelect = table.getSelectedRow();
				account = (String)table.getValueAt(rowSelect, 0);
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
				TeacherFrame teacherFrame = new TeacherFrame(user.getName() + "��ʦ�������о�", user);
				teacherFrame.getTeacherFrame().setVisible(true);
				setVisible(false);
			}
		});

		scoreButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rowSelect != -1) {
					studentUser = userDao.selectOne(account);
					new TeacherExamScoreFrame("����ʦ" + user.getName() + "�����о�", studentUser,user);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(TeacherExamFrame.this, "û��ѡ����Ӧ��ѧ��");
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
