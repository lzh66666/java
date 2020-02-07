package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IQuestionService;
import nuc.ss.examination.service.QuestionServiceImpl;

public class AdminAddQuestionFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private User user;
	private IQuestionService questionService = new QuestionServiceImpl();

	public AdminAddQuestionFrame() {
		this.init();
	}

	public AdminAddQuestionFrame(String title, User user) {
		super(title);
		this.user = user;
		this.init();
	}

	private JPanel questionPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();

	private JTextArea questionTitleText = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(questionTitleText);

	private JButton backButton = new JButton("返回");
	private JButton lineButton = new JButton("加行");
	private JButton saveButton = new JButton("上传题目");

	@Override
	protected void setup() {
		questionPanel.setLayout(null);
		questionPanel.setBackground(Color.LIGHT_GRAY);

		messagePanel.setLayout(null);
		messagePanel.setBounds(10, 10, 565, 300);
		messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		buttonPanel.setLayout(null);
		buttonPanel.setBounds(10, 320, 565, 60);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		scrollPane.setBounds(10, 10, 550, 280);
		questionTitleText.setLineWrap(true);
		questionTitleText.setFont(new Font("宋体", Font.PLAIN, 15));

		saveButton.setBounds(80, 10, 120, 40);
		saveButton.setFont(new Font("宋体", Font.PLAIN, 15));
		saveButton.setFocusable(false);
		lineButton.setBounds(250, 10, 80, 40);
		lineButton.setFont(new Font("宋体", Font.PLAIN, 15));
		lineButton.setFocusable(false);
		backButton.setBounds(380, 10, 80, 40);
		backButton.setFont(new Font("宋体", Font.PLAIN, 15));
		backButton.setFocusable(false);
	}

	@Override
	protected void addElement() {
		messagePanel.add(scrollPane);

		buttonPanel.add(backButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(lineButton);
		
		questionPanel.add(messagePanel);
		questionPanel.add(buttonPanel);
		add(questionPanel);
	}

	@Override
	protected void addListener() {
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				AdminFrame adminFrame = new AdminFrame(user.getName() + "进行试卷整合", user);
				adminFrame.getAdminFrame().setVisible(true);
				setVisible(false);
			}
		});
		
		saveButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String title = questionTitleText.getText();
				Question question = new Question(title);
				if(question != null) {
					questionService.addQuestion(question);
					JOptionPane.showMessageDialog(AdminAddQuestionFrame.this, "上传题目成功");
				}
			}
		});
		
		lineButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				questionTitleText.append("<br>");
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		this.setVisible(true);
		this.setSize(600, 425);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
}
