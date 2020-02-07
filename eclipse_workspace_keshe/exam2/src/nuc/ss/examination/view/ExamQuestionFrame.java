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

	// 创建一个用于存储学生选择的答案的数组
	private String[] answers = new String[paper.size()];
	// 创建一个用于存储学生选择 新选项前的答案
	private String[] answersPrev = new String[paper.size()];

	private int nowNum = 0;
	private int total = paper.size()-1;
	private int answeredCount = 0;
	private int noAnsweredCount = total;

	// 创建一个线程对象 控制时间的变化
	private TimeControlThread timeControlThread = new TimeControlThread();

	// 添加三个panel 区域的分割
	private JPanel selectPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	// 添加主要答题的组件
	private JTextArea examArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(examArea);
	// 添加右侧信息的组件
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
	// 添加下方按钮的组件
	private JButton answerButton = new JButton("答题");
	private JButton homeButton = new JButton("退出");
	private JButton prevButton = new JButton("上一题");
	private JButton nextButton = new JButton("下一题");
	private JButton submitButton = new JButton("提交试卷");

	@Override
	protected void setup() {
		// 设置panel布局管理---->自定义
		selectPanel.setLayout(null);
		selectPanel.setBackground(Color.LIGHT_GRAY);
		// 设置message区域的位置
		messagePanel.setLayout(null);
		messagePanel.setBounds(680, 10, 300, 550);
		messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		// 设置button区域的位置
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(16, 470, 650, 90);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		// 手动设置每一个组件的位置 字体 背景
		scrollPane.setBounds(16, 10, 650, 450);
		examArea.setFont(new Font("黑体", Font.BOLD, 34));
		examArea.setEditable(false);// 文本域中的文字不能编辑

		// 设置message区域中的每一个组件位置 大小 颜色
		pictureLabel.setBounds(10, 10, 280, 230);
		pictureLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		pictureLabel.setIcon(null);// 展示图片信息

		// 现在所在题号
		nowNumLabel.setBounds(40, 270, 100, 30);
		nowNumLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		nowNumField.setBounds(150, 270, 100, 30);
		nowNumField.setFont(new Font("黑体", Font.BOLD, 20));
		nowNumField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		nowNumField.setEditable(false);
		nowNumField.setHorizontalAlignment(JTextField.CENTER);

		// 总题数
		totalCountLabel.setBounds(40, 310, 100, 30);
		totalCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		totalCountField.setBounds(150, 310, 100, 30);
		totalCountField.setFont(new Font("黑体", Font.BOLD, 20));
		totalCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		totalCountField.setEditable(false);
		totalCountField.setHorizontalAlignment(JTextField.CENTER);

		// 已答题数
		answerCountLabel.setBounds(40, 350, 100, 30);
		answerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		answerCountField.setBounds(150, 350, 100, 30);
		answerCountField.setFont(new Font("黑体", Font.BOLD, 20));
		answerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		answerCountField.setEditable(false);
		answerCountField.setHorizontalAlignment(JTextField.CENTER);

		// 未答题数
		unanswerCountLabel.setBounds(40, 390, 100, 30);
		unanswerCountLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		unanswerCountField.setBounds(150, 390, 100, 30);
		unanswerCountField.setFont(new Font("黑体", Font.BOLD, 20));
		unanswerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		unanswerCountField.setEditable(false);
		unanswerCountField.setHorizontalAlignment(JTextField.CENTER);

		// 剩余时间
		timeLabel.setBounds(90, 460, 150, 30);
		timeLabel.setFont(new Font("黑体", Font.PLAIN, 20));
		timeLabel.setForeground(Color.BLUE);
		realTimeLabel.setBounds(108, 490, 150, 30);
		realTimeLabel.setFont(new Font("黑体", Font.BOLD, 20));
		realTimeLabel.setForeground(Color.BLUE);

		

		// 按钮
		answerButton.setBounds(40, 10, 120, 30);
		answerButton.setFont(new Font("宋体", Font.PLAIN, 20));
		// 选项字体聚焦无虚线
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

		// --------------------------------------------------------------------
		// 展示题目
		showQuestionAndPicture();
		// 设置窗口右侧中的组件的初始值
		nowNumField.setText(nowNum + 1 + "");
		totalCountField.setText(total + "");
		answerCountField.setText(answeredCount + "");
		unanswerCountField.setText(noAnsweredCount + "");
		realTimeLabel.setText(time + "");
		
		// -------------------------------------------------------------------
		// 初始化选 选项之前的答案数组 不为空,便于后面选项按钮的判断
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
		// 创建一个监听器 用于提交按钮
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value;
				if (noAnsweredCount != 0) {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "您还有未答完的题,确定交卷吗？");
				} else {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "确定交卷吗？");
				}
				// 1.确认框 确定提交吗
				// 返回值 0--是 1--否 2--取消
				if (value == 0) {
					// 2.倒计时时间停止---线程结束
					timeControlThread.stopTimeThread();
					// 3.所有按钮失效
					answerButton.setEnabled(false);
					prevButton.setEnabled(false);
					nextButton.setEnabled(false);
					submitButton.setEnabled(false);
					// 4.清除按钮的颜色
					clearOptionButtonColor();
					examArea.setText("您的所有题目已经做完,请耐心等待成绩");
				}
			}
		});
		// 创建一个监听器 用于下一题按钮
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 还原上一题按钮的可用状态
				prevButton.setEnabled(true);
				// 先让所有按钮保持原有状态
				clearOptionButtonColor();
				// 判断当前已答题和未答题数目
				if (judge(nowNum)) {
					// 已答题数加一个，未答题数减少一个
					answeredCount++;
					noAnsweredCount--;
				}
				// 当前题目序号增加一个
				nowNum++;

				// 判断题目是否到达最后
				if (nowNum == total) {
					examArea.setText("题目已经回答完毕\n请点击下方的红色按钮提交");
					// 让下一个按钮失效
					nextButton.setEnabled(false);
					// 让四个选项按钮失效
					answerButton.setEnabled(false);
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				} else {
					// 调用自己封装的方法显示下一个题目和可能有的图片
					showQuestionAndPicture();
					// 修改右侧的当前题号、已答题数、未答题数
					nowNumField.setText(nowNum + 1 + "");
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				}
				// 还原之前这道题选择的选项
				restoreButton();
			}
		});

		// 创建一个监听器 用于上一题按钮
		prevButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 还原四个选项按钮的可用状态
				answerButton.setEnabled(true);
				// 设置下一题按钮的状态 变为可用
				nextButton.setEnabled(true);
				// 先让所有按钮保留原始状态
				clearOptionButtonColor();
				// 当前题目序号减少一个
				nowNum--;
				// 判断题目是否到达第一个
				if (nowNum == 0) {
					// 让上一个按钮失效
					prevButton.setEnabled(false);
				}
				// 还原之前这道题选择的选项
				restoreButton();
				// 显示题目
				showQuestionAndPicture();
				// 修改右侧题号
				nowNumField.setText(nowNum + 1 + "");

				// 修改右侧已答题、未答题
				if (judge(nowNum + 1)) {
					++answeredCount;
					--noAnsweredCount;
				}
				answerCountField.setText(answeredCount + "");
				unanswerCountField.setText(noAnsweredCount + "");
			}
		});

		// 创建一个监听器对象 用于回答选项按钮
		answerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				answersPrev[nowNum] = answers[nowNum];
				// 清除之前所有选项按钮的颜色
				clearOptionButtonColor();
				// 让被点中的按钮颜色变化一下
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.green);
				button.setForeground(Color.white);
				// 将当前按钮的选项存储在answers数组中
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

	// 设计一个方法 负责还原上一题的选项(背景色和字体的颜色)
	private void restoreButton() {
		// 获取当前题目的答案（学生已经选择了的）
		String answer = answers[nowNum];
		if (answer == null) {
			return;
		} else {
			answerButton.setBackground(Color.GREEN);
			answerButton.setForeground(Color.white);
		}
	}

	// 设计一个方法 让下一题所有的按钮保留原来的状态
	private void clearOptionButtonColor() {
		// 保留背景颜色
		answerButton.setBackground(Color.WHITE);
		// 保留字体颜色
		answerButton.setForeground(Color.black);
		// 使字体无虚线的聚焦
		answerButton.setFocusable(false);
	}

	// 设计一个方法 用来展示一道题目
	private void showQuestionAndPicture() {
		// 从paper中获取一道题目
		Question question = paper.get(nowNum);// 三个属性 题干、答案、图片路径（可能为null）
		// 处理题目中的标记<br> 表示换行
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
		timeControlThread.start();// 启动自己定义的线程，进入就绪状态，进行对时间的处理
	}

	// 设计一个内部类 处理时间倒计时问题
	private class TimeControlThread extends Thread {

		private boolean flag = true;

		public void stopTimeThread() {
			this.flag = false;
		}

		@Override
		public void run() {
			// time进行格式转化 小时：分钟：秒
			int hour = time[0];
			int minute = time[1];
			int second = time[2];
			while (flag) {
				// 对时、分、秒进行拼串
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

				// 改变
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
							// 时间显示为红色
							realTimeLabel.setForeground(Color.red);
							// 所有按钮失效
							answerButton.setEnabled(false);
							nextButton.setEnabled(false);
							prevButton.setEnabled(false);
							// 弹出一个消息框 告诉考试结束 请提交
							JOptionPane.showMessageDialog(ExamQuestionFrame.this, "考试结束，请提交");
							break;// 线程停止
						}
					}
				}
			}
		}
	}
}
