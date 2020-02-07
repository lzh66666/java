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

	// ����һ�����ڴ洢ѧ��ѡ��Ĵ𰸵�����
	private String[] answers = new String[paper.size()];
	// ����һ�����ڴ洢ѧ��ѡ�� ��ѡ��ǰ�Ĵ�
	private String[] answersPrev = new String[paper.size()];

	private int nowNum = 0;
	private int total = paper.size()-1;
	private int answeredCount = 0;
	private int noAnsweredCount = total;

	// ����һ���̶߳��� ����ʱ��ı仯
	private TimeControlThread timeControlThread = new TimeControlThread();

	// �������panel ����ķָ�
	private JPanel selectPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();
	// �����Ҫ��������
	private JTextArea examArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(examArea);
	// ����Ҳ���Ϣ�����
	private JLabel pictureLabel = new JLabel();
	private JLabel nowNumLabel = new JLabel("��ǰ��ţ�");
	private JLabel totalCountLabel = new JLabel("��Ŀ������");
	private JLabel answerCountLabel = new JLabel("�Ѵ�������");
	private JLabel unanswerCountLabel = new JLabel("δ��������");
	private JTextField nowNumField = new JTextField("0");
	private JTextField totalCountField = new JTextField("0");
	private JTextField answerCountField = new JTextField("0");
	private JTextField unanswerCountField = new JTextField("0");
	private JLabel timeLabel = new JLabel("ʣ�����ʱ��");
	private JLabel realTimeLabel = new JLabel("00:00:00");
	// ����·���ť�����
	private JButton answerButton = new JButton("����");
	private JButton homeButton = new JButton("�˳�");
	private JButton prevButton = new JButton("��һ��");
	private JButton nextButton = new JButton("��һ��");
	private JButton submitButton = new JButton("�ύ�Ծ�");

	@Override
	protected void setup() {
		// ����panel���ֹ���---->�Զ���
		selectPanel.setLayout(null);
		selectPanel.setBackground(Color.LIGHT_GRAY);
		// ����message�����λ��
		messagePanel.setLayout(null);
		messagePanel.setBounds(680, 10, 300, 550);
		messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		// ����button�����λ��
		buttonPanel.setLayout(null);
		buttonPanel.setBounds(16, 470, 650, 90);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		// �ֶ�����ÿһ�������λ�� ���� ����
		scrollPane.setBounds(16, 10, 650, 450);
		examArea.setFont(new Font("����", Font.BOLD, 34));
		examArea.setEditable(false);// �ı����е����ֲ��ܱ༭

		// ����message�����е�ÿһ�����λ�� ��С ��ɫ
		pictureLabel.setBounds(10, 10, 280, 230);
		pictureLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		pictureLabel.setIcon(null);// չʾͼƬ��Ϣ

		// �����������
		nowNumLabel.setBounds(40, 270, 100, 30);
		nowNumLabel.setFont(new Font("����", Font.PLAIN, 20));
		nowNumField.setBounds(150, 270, 100, 30);
		nowNumField.setFont(new Font("����", Font.BOLD, 20));
		nowNumField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		nowNumField.setEditable(false);
		nowNumField.setHorizontalAlignment(JTextField.CENTER);

		// ������
		totalCountLabel.setBounds(40, 310, 100, 30);
		totalCountLabel.setFont(new Font("����", Font.PLAIN, 20));
		totalCountField.setBounds(150, 310, 100, 30);
		totalCountField.setFont(new Font("����", Font.BOLD, 20));
		totalCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		totalCountField.setEditable(false);
		totalCountField.setHorizontalAlignment(JTextField.CENTER);

		// �Ѵ�����
		answerCountLabel.setBounds(40, 350, 100, 30);
		answerCountLabel.setFont(new Font("����", Font.PLAIN, 20));
		answerCountField.setBounds(150, 350, 100, 30);
		answerCountField.setFont(new Font("����", Font.BOLD, 20));
		answerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		answerCountField.setEditable(false);
		answerCountField.setHorizontalAlignment(JTextField.CENTER);

		// δ������
		unanswerCountLabel.setBounds(40, 390, 100, 30);
		unanswerCountLabel.setFont(new Font("����", Font.PLAIN, 20));
		unanswerCountField.setBounds(150, 390, 100, 30);
		unanswerCountField.setFont(new Font("����", Font.BOLD, 20));
		unanswerCountField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		unanswerCountField.setEditable(false);
		unanswerCountField.setHorizontalAlignment(JTextField.CENTER);

		// ʣ��ʱ��
		timeLabel.setBounds(90, 460, 150, 30);
		timeLabel.setFont(new Font("����", Font.PLAIN, 20));
		timeLabel.setForeground(Color.BLUE);
		realTimeLabel.setBounds(108, 490, 150, 30);
		realTimeLabel.setFont(new Font("����", Font.BOLD, 20));
		realTimeLabel.setForeground(Color.BLUE);

		

		// ��ť
		answerButton.setBounds(40, 10, 120, 30);
		answerButton.setFont(new Font("����", Font.PLAIN, 20));
		// ѡ������۽�������
		answerButton.setFocusable(false);
		answerButton.setBackground(Color.WHITE);
		answerButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		homeButton.setBounds(180, 10, 120, 30);
		homeButton.setFont(new Font("����", Font.PLAIN, 20));
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
		// չʾ��Ŀ
		showQuestionAndPicture();
		// ���ô����Ҳ��е�����ĳ�ʼֵ
		nowNumField.setText(nowNum + 1 + "");
		totalCountField.setText(total + "");
		answerCountField.setText(answeredCount + "");
		unanswerCountField.setText(noAnsweredCount + "");
		realTimeLabel.setText(time + "");
		
		// -------------------------------------------------------------------
		// ��ʼ��ѡ ѡ��֮ǰ�Ĵ����� ��Ϊ��,���ں���ѡ�ť���ж�
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
		// ����һ�������� �����ύ��ť
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int value;
				if (noAnsweredCount != 0) {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "������δ�������,ȷ��������");
				} else {
					value = JOptionPane.showConfirmDialog(ExamQuestionFrame.this, "ȷ��������");
				}
				// 1.ȷ�Ͽ� ȷ���ύ��
				// ����ֵ 0--�� 1--�� 2--ȡ��
				if (value == 0) {
					// 2.����ʱʱ��ֹͣ---�߳̽���
					timeControlThread.stopTimeThread();
					// 3.���а�ťʧЧ
					answerButton.setEnabled(false);
					prevButton.setEnabled(false);
					nextButton.setEnabled(false);
					submitButton.setEnabled(false);
					// 4.�����ť����ɫ
					clearOptionButtonColor();
					examArea.setText("����������Ŀ�Ѿ�����,�����ĵȴ��ɼ�");
				}
			}
		});
		// ����һ�������� ������һ�ⰴť
		nextButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ԭ��һ�ⰴť�Ŀ���״̬
				prevButton.setEnabled(true);
				// �������а�ť����ԭ��״̬
				clearOptionButtonColor();
				// �жϵ�ǰ�Ѵ����δ������Ŀ
				if (judge(nowNum)) {
					// �Ѵ�������һ����δ����������һ��
					answeredCount++;
					noAnsweredCount--;
				}
				// ��ǰ��Ŀ�������һ��
				nowNum++;

				// �ж���Ŀ�Ƿ񵽴����
				if (nowNum == total) {
					examArea.setText("��Ŀ�Ѿ��ش����\n�����·��ĺ�ɫ��ť�ύ");
					// ����һ����ťʧЧ
					nextButton.setEnabled(false);
					// ���ĸ�ѡ�ťʧЧ
					answerButton.setEnabled(false);
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				} else {
					// �����Լ���װ�ķ�����ʾ��һ����Ŀ�Ϳ����е�ͼƬ
					showQuestionAndPicture();
					// �޸��Ҳ�ĵ�ǰ��š��Ѵ�������δ������
					nowNumField.setText(nowNum + 1 + "");
					answerCountField.setText(answeredCount + "");
					unanswerCountField.setText(noAnsweredCount + "");
				}
				// ��ԭ֮ǰ�����ѡ���ѡ��
				restoreButton();
			}
		});

		// ����һ�������� ������һ�ⰴť
		prevButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ԭ�ĸ�ѡ�ť�Ŀ���״̬
				answerButton.setEnabled(true);
				// ������һ�ⰴť��״̬ ��Ϊ����
				nextButton.setEnabled(true);
				// �������а�ť����ԭʼ״̬
				clearOptionButtonColor();
				// ��ǰ��Ŀ��ż���һ��
				nowNum--;
				// �ж���Ŀ�Ƿ񵽴��һ��
				if (nowNum == 0) {
					// ����һ����ťʧЧ
					prevButton.setEnabled(false);
				}
				// ��ԭ֮ǰ�����ѡ���ѡ��
				restoreButton();
				// ��ʾ��Ŀ
				showQuestionAndPicture();
				// �޸��Ҳ����
				nowNumField.setText(nowNum + 1 + "");

				// �޸��Ҳ��Ѵ��⡢δ����
				if (judge(nowNum + 1)) {
					++answeredCount;
					--noAnsweredCount;
				}
				answerCountField.setText(answeredCount + "");
				unanswerCountField.setText(noAnsweredCount + "");
			}
		});

		// ����һ������������ ���ڻش�ѡ�ť
		answerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				answersPrev[nowNum] = answers[nowNum];
				// ���֮ǰ����ѡ�ť����ɫ
				clearOptionButtonColor();
				// �ñ����еİ�ť��ɫ�仯һ��
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.green);
				button.setForeground(Color.white);
				// ����ǰ��ť��ѡ��洢��answers������
				answers[nowNum] = button.getText();
				
				new CompilerFrame(user,nowNum+1);
			}
		});
		
		homeButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginFrame loginFrame = new LoginFrame("��Ϊ������");
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

	// ���һ������ ����ԭ��һ���ѡ��(����ɫ���������ɫ)
	private void restoreButton() {
		// ��ȡ��ǰ��Ŀ�Ĵ𰸣�ѧ���Ѿ�ѡ���˵ģ�
		String answer = answers[nowNum];
		if (answer == null) {
			return;
		} else {
			answerButton.setBackground(Color.GREEN);
			answerButton.setForeground(Color.white);
		}
	}

	// ���һ������ ����һ�����еİ�ť����ԭ����״̬
	private void clearOptionButtonColor() {
		// ����������ɫ
		answerButton.setBackground(Color.WHITE);
		// ����������ɫ
		answerButton.setForeground(Color.black);
		// ʹ���������ߵľ۽�
		answerButton.setFocusable(false);
	}

	// ���һ������ ����չʾһ����Ŀ
	private void showQuestionAndPicture() {
		// ��paper�л�ȡһ����Ŀ
		Question question = paper.get(nowNum);// �������� ��ɡ��𰸡�ͼƬ·��������Ϊnull��
		// ������Ŀ�еı��<br> ��ʾ����
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
		timeControlThread.start();// �����Լ�������̣߳��������״̬�����ж�ʱ��Ĵ���
	}

	// ���һ���ڲ��� ����ʱ�䵹��ʱ����
	private class TimeControlThread extends Thread {

		private boolean flag = true;

		public void stopTimeThread() {
			this.flag = false;
		}

		@Override
		public void run() {
			// time���и�ʽת�� Сʱ�����ӣ���
			int hour = time[0];
			int minute = time[1];
			int second = time[2];
			while (flag) {
				// ��ʱ���֡������ƴ��
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

				// �ı�
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
							// ʱ����ʾΪ��ɫ
							realTimeLabel.setForeground(Color.red);
							// ���а�ťʧЧ
							answerButton.setEnabled(false);
							nextButton.setEnabled(false);
							prevButton.setEnabled(false);
							// ����һ����Ϣ�� ���߿��Խ��� ���ύ
							JOptionPane.showMessageDialog(ExamQuestionFrame.this, "���Խ��������ύ");
							break;// �߳�ֹͣ
						}
					}
				}
			}
		}
	}
}
