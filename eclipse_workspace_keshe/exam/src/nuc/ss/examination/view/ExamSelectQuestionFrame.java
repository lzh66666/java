package nuc.ss.examination.view;

import javax.swing.*;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.ISelectQuestionService;
import nuc.ss.examination.service.SelectQuestionServiceImpl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ExamSelectQuestionFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;
	
	private User user;
	ExamSelectQuestionFrame examSelectQuestionFrame;
	private int[] timeT= new int[3];
	public ExamSelectQuestionFrame() {
		this.init();
		examSelectQuestionFrame = this;
	}

	public ExamSelectQuestionFrame(String title,User user) {
		super(title);
		examSelectQuestionFrame = this;
		this.user = user;
		this.init();
	}

	private ISelectQuestionService selectQuestionService = new SelectQuestionServiceImpl();
	private ArrayList<SelectQuestion> paper = selectQuestionService.getSelectPaper(11);// ���������ӳ�����
	// ����һ�����ڴ洢ѧ��ѡ��Ĵ𰸵�����
	private String[] answers = new String[paper.size()];
	// ����һ�����ڴ洢ѧ��ѡ�� ��ѡ��ǰ�Ĵ�
	private String[] answersPrev = new String[paper.size()];

	private int nowNum = 0;
	private int total = paper.size() - 1;
	private int answeredCount = 0;
	private int noAnsweredCount = total;

	private int time = 10;
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
	private JButton aButton = new JButton("A");
	private JButton bButton = new JButton("B");
	private JButton cButton = new JButton("C");
	private JButton dButton = new JButton("D");
	private JButton prevButton = new JButton("��һ��");
	private JButton nextButton = new JButton("��һ��");
	private JButton submitButton = new JButton("�ύ�Ծ�");

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
		examArea.setFont(new Font("����", Font.BOLD, 34));
		examArea.setEditable(false);


		pictureLabel.setBounds(10, 10, 280, 230);
		pictureLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY));
		pictureLabel.setIcon(null);

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

		aButton.setBounds(40, 10, 120, 30);
		bButton.setBounds(190, 10, 120, 30);
		cButton.setBounds(340, 10, 120, 30);
		dButton.setBounds(490, 10, 120, 30);

		aButton.setFont(new Font("����", Font.PLAIN, 20));
		bButton.setFont(new Font("����", Font.PLAIN, 20));
		cButton.setFont(new Font("����", Font.PLAIN, 20));
		dButton.setFont(new Font("����", Font.PLAIN, 20));

		aButton.setFocusable(false);
		bButton.setFocusable(false);
		cButton.setFocusable(false);
		dButton.setFocusable(false);

		aButton.setBackground(Color.WHITE);
		bButton.setBackground(Color.WHITE);
		cButton.setBackground(Color.WHITE);
		dButton.setBackground(Color.WHITE);

		aButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		bButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		cButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		dButton.setBorder(BorderFactory.createLineBorder(Color.WHITE));

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

		buttonPanel.add(aButton);
		buttonPanel.add(bButton);
		buttonPanel.add(cButton);
		buttonPanel.add(dButton);
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
					value = JOptionPane.showConfirmDialog(ExamSelectQuestionFrame.this, "������δ�������,ȷ��������");
				} else {
					value = JOptionPane.showConfirmDialog(ExamSelectQuestionFrame.this, "ȷ��������");
				}
				if (value == 0) {
					// 2.����ʱʱ��ֹͣ---�߳̽���
					timeControlThread.stopTimeThread();
					// 3.���а�ťʧЧ
					setOptionButtonEnable(false);
					prevButton.setEnabled(false);
					nextButton.setEnabled(false);
					submitButton.setEnabled(false);
					// 4.�����ť����ɫ
					clearOptionButtonColor();
					SimpleDateFormat sdf = new SimpleDateFormat( "yyyy��MM��dd��HHʱmm��" ); 
			        String str = sdf.format(new Date());
					float score = checkPaper();
					selectQuestionService.save(score, str,user);
//					examArea.setText("����ѡ�������Ϊ" + score + "\n�����ύ��ť֮����д�������");					
					new ExamQuestionFrame("������",user,timeT);
					examSelectQuestionFrame.dispose();										
				}
			}
		});

		// ����һ�������� ������һ�ⰴť
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
					examArea.setText("ѡ����Ŀ�Ѿ��ش����\n�����·��ĺ�ɫ��ť�ύ");
					nextButton.setEnabled(false);
					setOptionButtonEnable(false);
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
				setOptionButtonEnable(true);
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
		
		ActionListener optionlistener = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				answersPrev[nowNum] = answers[nowNum];
				clearOptionButtonColor();
				JButton button = (JButton) e.getSource();
				button.setBackground(Color.green);
				button.setForeground(Color.white);
				answers[nowNum] = button.getText();
			}
		};

		aButton.addActionListener(optionlistener);
		bButton.addActionListener(optionlistener);
		cButton.addActionListener(optionlistener);
		dButton.addActionListener(optionlistener);

	}

	@Override
	protected void setFrameSelf() {
		this.setBounds(260, 80, 1000, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
		timeControlThread.start();
	}
	
	private boolean judge(int nowNum1) {
		if (answers[nowNum1] != null && answersPrev[nowNum1] == null) {
			answersPrev[nowNum1] = answers[nowNum1];
			return true;
		} else {
			return false;
		}
	}

	private float checkPaper() {
		float score = 0;
		int size = paper.size();
		for (int i = 0; i < size - 1; i++) {
			SelectQuestion selectquestion = paper.get(i);
			String realAnswer = selectquestion.getAnswer();
			if (answers[i] == null) {
				score += 0;
			} else if (answers[i].equals(realAnswer)) {
				score += (60 / (size - 1));
			}
		}
		return score;
	}

	private void restoreButton() {
		String answer = answers[nowNum];
		if (answer == null) {
			return;
		}
		switch (answer) {
		case "A":
			aButton.setBackground(Color.GREEN);
			aButton.setForeground(Color.white);
			break;
		case "B":
			bButton.setBackground(Color.GREEN);
			bButton.setForeground(Color.white);
			break;
		case "C":
			cButton.setBackground(Color.GREEN);
			cButton.setForeground(Color.white);
			break;
		case "D":
			dButton.setBackground(Color.GREEN);
			dButton.setForeground(Color.white);
			break;
		default:
			this.clearOptionButtonColor();
			break;
		}
	}

	// ���һ������ ����һ�����еİ�ť����ԭ����״̬
	private void clearOptionButtonColor() {

		aButton.setBackground(Color.WHITE);
		bButton.setBackground(Color.WHITE);
		cButton.setBackground(Color.WHITE);
		dButton.setBackground(Color.WHITE);

		aButton.setForeground(Color.black);
		bButton.setForeground(Color.black);
		cButton.setForeground(Color.black);
		dButton.setForeground(Color.black);

		aButton.setFocusable(false);
		bButton.setFocusable(false);
		cButton.setFocusable(false);
		dButton.setFocusable(false);
	}


	private void showQuestionAndPicture() {
		SelectQuestion question = paper.get(nowNum);

		String picture = question.getPicture();
		if (picture != null) {
			pictureLabel.setIcon(drawImage(picture));
		} else {
			pictureLabel.setIcon(null);
		}

		String title = question.getTitle().replace("<br>", "\n");
		examArea.setText((nowNum + 1) + "��" + title);
		examArea.setLineWrap(true);
	}


	private ImageIcon drawImage(String path) {
		ImageIcon imageIcon = new ImageIcon(DatabaseConfig.IMAGE + path);
		imageIcon.setImage(imageIcon.getImage());
		return imageIcon;
	}

	private void setOptionButtonEnable(boolean key) {
		aButton.setEnabled(key);
		bButton.setEnabled(key);
		cButton.setEnabled(key);
		dButton.setEnabled(key);
	}
	
	private class TimeControlThread extends Thread {
		private boolean flag = true;
		public void stopTimeThread() {
			this.flag = false;
		}

		@Override
		public void run() {
			int hour = time / 60;
			int minute = time % 60;
			int second = 0;
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
							setOptionButtonEnable(false);
							nextButton.setEnabled(false);
							prevButton.setEnabled(false);
							JOptionPane.showMessageDialog(ExamSelectQuestionFrame.this, "���Խ��������ύ");
							break;
						}
					}
				}
				timeT[0] = hour;
				timeT[1] = minute;
				timeT[2] = second;
			}
		}
	}
	
}
