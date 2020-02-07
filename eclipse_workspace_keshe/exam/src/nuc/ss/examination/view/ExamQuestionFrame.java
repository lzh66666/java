package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IQuestionService;
import nuc.ss.examination.service.QuestionServiceImpl;

public class ExamQuestionFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private int[] time = new int[3];
	private User user;
	public ExamQuestionFrame() {
		this.init();
	}

	public ExamQuestionFrame(String title,User user,int[] time) {
		super(title);
		this.time = time;
		this.user = user;
		this.init();
	}
	
	private IQuestionService questionService = new QuestionServiceImpl();
	private ArrayList<Question> paper = questionService.getPaper(3);

	private String[] answers = new String[paper.size()];
	private String[] answersPrev = new String[paper.size()];

	private int nowNum = 0;
	private int total = paper.size()-1;
	private int answeredCount = 0;
	private int noAnsweredCount = total;

	private TimeControlThread timeControlThread = new TimeControlThread();

	private JPanel selectPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();

	private JTextArea examArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(examArea);

	private JLabel pictureLabel = new JLabel();
	private JLabel nowNumLabel = new JLabel("当前题号：");
	private JLabel totalCountLabel = new JLabel("题目总数：");
	private JLabel answerCountLabel = new JLabel("已答题数：");
	private JLabel unanswerCountLabel = new JLabel("未答题数：");
	private JTextField nowNumField = new JTextField("0");
	private JTextField totalCountField = new JTextField("0");
	private JTextField answerCountField = new JTextField("0");
	private JTextField unanswerCountField = new JTextField("0");
	private JLabel timeLabel = new JLabel("剩余答题时间");
	private JLabel realTimeLabel = new JLabel("00:00:00");

	private JButton answerButton = new JButton("答题");
	private JButton homeButton = new JButton("退出");
	private JButton prevButton = new JButton("上一题");
	private JButton nextButton = new JButton("下一题");
	private JButton submitButton = new JButton("提交试卷");

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

		scrollPane.setBounds(16, 10, 650, 450);
		examArea.setFont(new Font("黑体", Font.BOLD, 34));
		examArea.setEditable(false);

		pictureLabel.setBounds(10, 10, 280, 230);
		pictureLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		pictureLabel.setIcon(null);

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

		timeLabel.setBounds(90, 460, 150, 30);
		timeLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		timeLabel.setForeground(Color.BLUE);
		realTimeLabel.setBounds(108, 490, 150, 30);
		realTimeLabel.setFont(new Font("黑体", Font.BOLD, 20));
		realTimeLabel.setForeground(Color.BLUE);

		answerButton.setBounds(40, 10, 120, 30);
		answerButton.setFont(new Font("宋体", Font.PLAIN, 20));
		answerButton.setFocusable(false);
		answerButton.setBackground(Color.WHITE);
		answerButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		homeButton.setBounds(180, 10, 120, 30);
		homeButton.setFont(new Font("宋体", Font.PLAIN, 20));
		homeButton.setFocusable(false);
		
		prevButton.setBounds(40, 50, 100, 30);
		prevButton.setFocusable(false);
		prevButton.setEnabled(false);

		nextButton.setBounds(510, 50, 100, 30);
		nextButton.setFocusable(false);
		
		submitButton.setBounds(276, 50, 100, 30);
		submitButton.setBackground(Color.RED);
		submitButton.setForeground(Color.WHITE);
		submitButton.setFocusable(false);
		submitButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		submitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		showQuestionAndPicture();

		nowNumField.setText(nowNum + 1 + "");
		totalCountField.setText(total + "");
		answerCountField.setText(answeredCount + "");
		unanswerCountField.setText(noAnsweredCount + "");
		realTimeLabel.setText(time + "");
		
		for (int i = 0; i < answersPrev.length; i++) {
			answersPrev[i] = "";
		}

	}

	@Override
	protected void addElement() {
		messagePanel.add(pictureLabel);
		messagePanel.add(nowNumLabel);
		messagePanel.add(nowNumField);
		messagePanel.add(totalCountLabel);
		messagePanel.add(totalCountField);
		messagePanel.add(answerCountLabel);
		messagePanel.add(answerCountField);
		messagePanel.add(unanswerCountLabel);
		messagePanel.add(unanswerCountField);
		messagePanel.add(timeLabel);
		messagePanel.add(realTimeLabel);

		buttonPanel.add(answerButton);
		buttonPanel.add(homeButton);
		buttonPanel.add(prevButton);
		buttonPanel.add(nextButton);
		buttonPanel.add(submitButton);

		selectPanel.add(scrollPane);
		selectPanel.add(messagePanel);
		selectPanel.add(buttonPanel);
		add(selectPanel);
	}

	@Override
	protected void addListener() {
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value;
				if (noAnsweredCount != 0) {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "您还有未答完的题,确定交卷吗？");
				} else {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "确定交卷吗？");
				}

				if (value == 0) {
					timeControlThread.stopTimeThread();
					answerButton.setEnabled(false);
					prevButton.setEnabled(false);
					nextButton.setEnabled(false);
					submitButton.setEnabled(false);
					clearOptionButtonColor();
					examArea.setText("您的所有题目已经做完,请耐心等待成绩");
				}
			}
		});
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				prevButton.setEnabled(true);
				clearOptionButtonColor();
				if (judge(nowNum)) {
					answeredCount++;
					noAnsweredCount--;
				}
				nowNum++;
				if (nowNum == total) {
					examArea.setText("题目已经回答完毕\n请点击下方的红色按钮提交");
					nextButton.setEnabled(false);
					answerButton.setEnabled(false);
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				} else {
					showQuestionAndPicture();
					nowNumField.setText(nowNum + 1 + "");
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				}
				restoreButton();
			}
		});

		prevButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				answerButton.setEnabled(true);
				nextButton.setEnabled(true);
				clearOptionButtonColor();
				nowNum--;
				if (nowNum == 0) {
					prevButton.setEnabled(false);
				}
				restoreButton();
				showQuestionAndPicture();
				nowNumField.setText(nowNum + 1 + "");
				if (judge(nowNum + 1)) {
					++answeredCount;
					--noAnsweredCount;
				}
				answerCountField.setText(answeredCount + "");
				unanswerCountField.setText(noAnsweredCount + "");
			}
		});

		answerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				answersPrev[nowNum] = answers[nowNum];
				clearOptionButtonColor();
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.green);
				button.setForeground(Color.white);
				answers[nowNum] = button.getText();
				new CompilerFrame(user,nowNum+1);
			}
		});
		
		homeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginFrame loginFrame = new LoginFrame("我为您服务");
				loginFrame.getLoginFrame().setVisible(true);
				setVisible(false);
			}
		});
	}

	private boolean judge(int nowNum1) {
		if (answers[nowNum1] != null && answersPrev[nowNum1] == null) {
			answersPrev[nowNum1] = answers[nowNum1];
			return true;
		} else {
			return false;
		}
	}

	private void restoreButton() {
		String answer = answers[nowNum];
		if (answer == null) {
			return;
		} else {
			answerButton.setBackground(Color.GREEN);
			answerButton.setForeground(Color.white);
		}
	}

	private void clearOptionButtonColor() {
		answerButton.setBackground(Color.WHITE);
		answerButton.setForeground(Color.black);
		answerButton.setFocusable(false);
	}

	private void showQuestionAndPicture() {
		Question question = paper.get(nowNum);
		String title = question.getTitle().replace("<br>", "\n");
		examArea.setText((nowNum + 1) + "." + title);
		examArea.setLineWrap(true);
	}

	@Override
	protected void setFrameSelf() {
		this.setBounds(260, 80, 1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		timeControlThread.start();
	}

	private class TimeControlThread extends Thread {

		private boolean flag = true;

		public void stopTimeThread() {
			this.flag = false;
		}

		@Override
		public void run() {
			int hour = time[0];
			int minute = time[1];
			int second = time[2];
			while (flag) {
				StringBuilder builder = new StringBuilder();
				if (hour >= 0 && hour < 10) {
					builder.append("0");
				}
				builder.append(hour);
				builder.append(":");
				if (minute >= 0 && minute < 10) {
					builder.append("0");
				}
				builder.append(minute);
				builder.append(":");
				if (second >= 0 && second < 10) {
					builder.append("0");
				}
				builder.append(second);

				realTimeLabel.setText(builder.toString());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				if (second > 0) {
					second--;
				} else {
					if (minute > 0) {
						minute--;
						second = 59;
					} else {
						if (hour > 0) {
							hour--;
							minute = 59;
							second = 59;
						} else {
							realTimeLabel.setForeground(Color.red);
							answerButton.setEnabled(false);
							nextButton.setEnabled(false);
							prevButton.setEnabled(false);
							JOptionPane.showMessageDialog(ExamQuestionFrame.this, "考试结束，请提交");
							break;
						}
					}
				}
			}
		}
	}
}
