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
	private JButton backButton = new JButton("返回");

	@Override
	protected void setup() {
		panel.setLayout(null);
		panel.setBounds(0,380,300,100);
		backButton.setBounds(200,0,80,30);
		// 设置JTable中的列名
		Vector<String> columnNames = new Vector<>();
		columnNames.add("学生账号");
		columnNames.add("学生姓名");
		columnNames.add("大题日期");
		columnNames.add("选择分数");
		columnNames.add("大题分数");
		// 设置JTable的表格数据

		
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
					rowV.add("未判");
				}
				tableValues.add(rowV);
			}
		}
		
		DefaultTableModel defaultTableModel = new DefaultTableModel(tableValues, columnNames);
		// 设置JTable的表格模型
		tblScore.setModel(defaultTableModel);
		/*
		 * 将JTable添加到JScrollPane中，
		 */
		scrollPane.setViewportView(tblScore);

		tblScore.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		// 居中显示
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
				StudentFrame studentFrame = new StudentFrame("欢迎学生" + user.getName() + "登录", user);
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
