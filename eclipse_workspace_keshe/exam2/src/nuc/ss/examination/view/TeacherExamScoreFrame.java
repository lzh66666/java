package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.CompilerServiceImpl;
import nuc.ss.examination.service.ICompilerService;
import nuc.ss.examination.service.IQuestionService;
import nuc.ss.examination.service.QuestionServiceImpl;

public class TeacherExamScoreFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private User studentUser;
	private User teacherUser;

	public TeacherExamScoreFrame() {
		this.init();
	}

	public TeacherExamScoreFrame(String title, User studentUser,User teacherUser) {
		super(title);
		this.studentUser = studentUser;
		this.teacherUser = teacherUser;
		this.init();
	}

	private IQuestionService questionService = new QuestionServiceImpl();
	private ArrayList<Question> paper = questionService.getPaper(3);
	private ICompilerService compilerService = new CompilerServiceImpl();

	private String[] answers = new String[paper.size()];
	private String[] answersPrev = new String[paper.size()];

	private int nowNum = 0;
	private int total = paper.size() - 1;
	private int answeredCount = 0;
	private int noAnsweredCount = total;

	private JPanel selectPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	
	private JTextArea examArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(examArea);

	private JTextArea answerExamArea = new JTextArea();
	private JScrollPane scrollPane2 = new JScrollPane(answerExamArea);
	

	private JTextArea notifyText = new JTextArea("每次打完分记得保存，否则不能进行正常打分");
	private JLabel nowNumLabel = new JLabel("当前题号：");
	private JLabel totalCountLabel = new JLabel("题目总数：");
	private JLabel answerCountLabel = new JLabel("已判题数：");
	private JLabel unanswerCountLabel = new JLabel("未判题数：");
	private JTextField nowNumField = new JTextField("0");
	private JTextField totalCountField = new JTextField("0");
	private JTextField answerCountField = new JTextField("0");
	private JTextField unanswerCountField = new JTextField("0");

	private JButton prevButton = new JButton("上一题");
	private JTextField socreField = new JTextField();// 老师写分数
	private JButton nextButton = new JButton("下一题");
	private JButton saveButton = new JButton("保存");
	private JButton backButton = new JButton("返回");
	
	@Override
	protected void setup() {
		selectPanel.setLayout(null);
		selectPanel.setBackground(Color.LIGHT_GRAY);

		messagePanel.setLayout(null);
		messagePanel.setBounds(680, 10, 300, 550);
		messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		buttonPanel.setLayout(null);
		buttonPanel.setBounds(16, 470, 650, 90);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		scrollPane.setBounds(16, 10, 650, 200);
		examArea.setFont(new Font("黑体", Font.BOLD, 34));
		examArea.setLineWrap(true);
		examArea.setEditable(false);// 文本域中的文字不能编辑
		
		scrollPane2.setBounds(16, 210, 650, 240);
		answerExamArea.setFont(new Font("黑体", Font.BOLD, 16));
		answerExamArea.setEditable(false);
		answerExamArea.setLineWrap(true);
		answerExamArea.setBackground(Color.GRAY);
		answerExamArea.setForeground(Color.WHITE);
		
		notifyText.setBounds(10, 10, 280, 230);
		notifyText.setFont(new Font("楷体", Font.BOLD, 40));
		notifyText.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		notifyText.setEditable(false);
		notifyText.setLineWrap(true);

		nowNumLabel.setBounds(40, 270, 100, 30);
		nowNumLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		nowNumField.setBounds(150, 270, 100, 30);
		nowNumField.setFont(new Font("黑体", Font.BOLD, 20));
		nowNumField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		nowNumField.setEditable(false);
		nowNumField.setHorizontalAlignment(JTextField.CENTER);

		totalCountLabel.setBounds(40, 310, 100, 30);
		totalCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		totalCountField.setBounds(150, 310, 100, 30);
		totalCountField.setFont(new Font("黑体", Font.BOLD, 20));
		totalCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		totalCountField.setEditable(false);
		totalCountField.setHorizontalAlignment(JTextField.CENTER);

		answerCountLabel.setBounds(40, 350, 100, 30);
		answerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		answerCountField.setBounds(150, 350, 100, 30);
		answerCountField.setFont(new Font("黑体", Font.BOLD, 20));
		answerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		answerCountField.setEditable(false);
		answerCountField.setHorizontalAlignment(JTextField.CENTER);

		unanswerCountLabel.setBounds(40, 390, 100, 30);
		unanswerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		unanswerCountField.setBounds(150, 390, 100, 30);
		unanswerCountField.setFont(new Font("黑体", Font.BOLD, 20));
		unanswerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		unanswerCountField.setEditable(false);
		unanswerCountField.setHorizontalAlignment(JTextField.CENTER);

		saveButton.setBounds(40, 10, 100, 30);
		saveButton.setFont(new Font("宋体", Font.PLAIN, 20));
		saveButton.setFocusable(false);
		
		backButton.setBounds(510, 10, 100, 30);
		backButton.setFont(new Font("宋体", Font.PLAIN, 20));
		backButton.setFocusable(false);
		
		prevButton.setBounds(40, 50, 100, 30);
		prevButton.setFocusable(false);
		prevButton.setEnabled(false);

		nextButton.setBounds(510, 50, 100, 30);
		nextButton.setFocusable(false);

		socreField.setBounds(276, 50, 100, 30);
		socreField.requestFocus();

		showQuestionAndPicture();
		nowNumField.setText(nowNum + 1 + "");
		totalCountField.setText(total + "");
		answerCountField.setText(answeredCount + "");
		unanswerCountField.setText(noAnsweredCount + "");

		for (int i = 0; i < answersPrev.length; i++) {
			answersPrev[i] = "";
		}

	}

	@Override
	protected void addElement() {
		messagePanel.add(notifyText);
		messagePanel.add(nowNumLabel);
		messagePanel.add(nowNumField);
		messagePanel.add(totalCountLabel);
		messagePanel.add(totalCountField);
		messagePanel.add(answerCountLabel);
		messagePanel.add(answerCountField);
		messagePanel.add(unanswerCountLabel);
		messagePanel.add(unanswerCountField);

		buttonPanel.add(prevButton);
		buttonPanel.add(nextButton);
		buttonPanel.add(socreField);
		buttonPanel.add(saveButton);
		buttonPanel.add(backButton);

		selectPanel.add(scrollPane);
		selectPanel.add(scrollPane2);
		selectPanel.add(messagePanel);
		selectPanel.add(buttonPanel);
		add(selectPanel);
	}

	@Override
	protected void addListener() {
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prevButton.setEnabled(true);
				clearOptionText();
				if (judge()) {
					answeredCount++;
					noAnsweredCount--;
				}
				nowNum++;
				if (nowNum == total) {
					examArea.setText("题目已经回答完毕\n请点击保存按钮保存该学生的分数");
					scrollPane.setSize(650, 440);
					nextButton.setEnabled(false);
					socreField.setEnabled(false);
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				} else {
					showQuestionAndPicture();
					nowNumField.setText(nowNum + 1 + "");
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				}
				restoreText();
			}
		});

		prevButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				socreField.setEnabled(true);
				nextButton.setEnabled(true);
				if (judge()) {
					++answeredCount;
					--noAnsweredCount;
				}
				nowNum--;
				clearOptionText();
				if (nowNum == 0) {
					prevButton.setEnabled(false);
				}
				if(nowNum == total-1) {
					scrollPane.setSize(650, 200);
				}
				showQuestionAndPicture();
				nowNumField.setText(nowNum + 1 + "");

				answerCountField.setText(answeredCount + "");
				unanswerCountField.setText(noAnsweredCount + "");
				restoreText();
			}
		});

		saveButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (nowNum == total) {
					float scoreTotal;
					if(answers[0] != null && answers[1] != null) {
						scoreTotal = Float.parseFloat(answers[0])+Float.parseFloat(answers[1]);
						questionService.save(scoreTotal, studentUser);
					}
				} else {
					answersPrev[nowNum] = answers[nowNum];
					answers[nowNum] = socreField.getText();
				}

			}
		});
		
		backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				TeacherExamFrame teacherExamFrame = new TeacherExamFrame("欢迎老师" + teacherUser.getName() + "进入打分系统",teacherUser);
				teacherExamFrame.getTeacherExamFrame().setVisible(true);
				setVisible(false);
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		this.setBounds(260, 80, 1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}

	private void showQuestionAndPicture() {
		Question question = paper.get(nowNum);
		String title = question.getTitle().replace("<br>", "\n");
		examArea.setText((nowNum + 1) + "." + title);
		examArea.setLineWrap(true);
		answerExamArea.setText((nowNum + 1) + ".");
		compilerService.read(answerExamArea, studentUser, nowNum+1);
		answerExamArea.setLineWrap(true);
	}

	private boolean judge() {
		if (answers[nowNum] != null && answersPrev[nowNum] == null) {
			answersPrev[nowNum] = answers[nowNum];
			return true;
		} else {
			return false;
		}
	}

	private void restoreText() {
		String answer = answers[nowNum];
		if (answer == null) {
			return;
		} else {
			socreField.setText(answer);
		}
	}

	private void clearOptionText() {
		socreField.requestFocus();
		socreField.setText("");
	}
}
