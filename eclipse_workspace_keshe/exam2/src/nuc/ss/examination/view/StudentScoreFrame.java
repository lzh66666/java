package nuc.ss.examination.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IStudentScoreService;
import nuc.ss.examination.service.StudentScoreServiceImpl;

public class StudentScoreFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private User user;
	private IStudentScoreService studentScoreService = new StudentScoreServiceImpl();

	public StudentScoreFrame() {
		this.init();
	}
	
	public StudentScoreFrame(String title, User user) {
		super(title);
		this.user = user;
		this.init();
	}
	
	private final JScrollPane scrollPane = new JScrollPane();
	private JTable tblScore = new JTable();
	private final JPanel panel = new JPanel();
	private JButton backButton = new JButton("����");

	@Override
	protected void setup() {
		panel.setLayout(null);
		panel.setBounds(0,380,300,100);
		backButton.setBounds(200,0,80,30);
		// ����JTable�е�����
		Vector<String> columnNames = new Vector<>();
		columnNames.add("ѧ���˺�");
		columnNames.add("ѧ������");
		columnNames.add("��������");
		columnNames.add("ѡ�����");
		columnNames.add("�������");
		// ����JTable�ı������

		
		Vector<Vector<String>> tableValues = new Vector<>();
		List<Score> score = studentScoreService.scores();
		for (int row = 0; row < score.size(); row++) {
			Vector<String> rowV = new Vector<>();
			if(score.get(row).getAccount().equals(user.getAccount())) {
				rowV.add(score.get(row).getAccount());
				rowV.add(score.get(row).getName());
				rowV.add(score.get(row).getData());
				rowV.add(score.get(row).getScore()+"");
				if(score.get(row).getQuestionScore() != 0.0) {
					rowV.add(score.get(row).getQuestionScore()+"");
				}else {
					rowV.add("δ��");
				}
				tableValues.add(rowV);
			}
		}
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(tableValues, columnNames);
		// ����JTable�ı��ģ��
		tblScore.setModel(defaultTableModel);
		/*
		 * ��JTable��ӵ�JScrollPane�У�
		 */
		scrollPane.setViewportView(tblScore);

		tblScore.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// ������ʾ
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();
		r.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
		tblScore.setDefaultRenderer(Object.class, r);

	}

	@Override
	protected void addElement() {
		panel.add(backButton);
		add(panel);
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	protected void addListener() {
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				StudentFrame studentFrame = new StudentFrame("��ӭѧ��" + user.getName() + "��¼", user);
				studentFrame.getStudentFrame().setVisible(true);
				setVisible(false);
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		this.setSize(800, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
