package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.ISelectQuestionService;
import nuc.ss.examination.service.SelectQuestionServiceImpl;

public class AdminAddSelectQuestionFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;

	private User user;
	private boolean judge = false;
	private String pictureSrc;
	private ISelectQuestionService selectQuestionService;

	public AdminAddSelectQuestionFrame() {
		this.init();
	}

	public AdminAddSelectQuestionFrame(String title, User user) {
		super(title);
		this.user = user;
		this.init();
	}

	private JPanel selectPanel = new JPanel();
	private JPanel messagePanel = new JPanel();
	private JPanel buttonPanel = new JPanel();

	private JLabel titleLable = new JLabel("题目：");
	private JLabel aLable = new JLabel("A：");
	private JLabel bLable = new JLabel("B：");
	private JLabel cLable = new JLabel("C：");
	private JLabel dLable = new JLabel("D：");

	private JTextArea selectTitleText = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(selectTitleText);

	private JTextField aText = new JTextField();
	private JTextField bText = new JTextField();
	private JTextField cText = new JTextField();
	private JTextField dText = new JTextField();

	private JButton backButton = new JButton("返回");
	private JButton imageButton = new JButton("图片");
	private JButton saveButton = new JButton("上传题目");

	private JLabel answerLabel = new JLabel("答案：");
	private JTextField answerText = new JTextField();

	@Override
	protected void setup() {
		selectPanel.setLayout(null);
		selectPanel.setBackground(Color.LIGHT_GRAY);

		messagePanel.setLayout(null);
		messagePanel.setBounds(10, 10, 565, 300);
		messagePanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		buttonPanel.setLayout(null);
		buttonPanel.setBounds(10, 320, 565, 60);
		buttonPanel.setBorder(BorderFactory.createLineBorder(Color.GRAY));

		titleLable.setBounds(10, 10, 30, 60);
		titleLable.setFont(new Font("黑体", Font.PLAIN, 10));
		aLable.setBounds(10, 80, 30, 40);
		aLable.setFont(new Font("宋体", Font.PLAIN, 15));
		bLable.setBounds(10, 130, 30, 40);
		bLable.setFont(new Font("宋体", Font.PLAIN, 15));
		cLable.setBounds(10, 180, 30, 40);
		cLable.setFont(new Font("宋体", Font.PLAIN, 15));
		dLable.setBounds(10, 230, 30, 40);
		dLable.setFont(new Font("宋体", Font.PLAIN, 15));

		scrollPane.setBounds(60, 10, 500, 60);
		selectTitleText.setLineWrap(true);
		selectTitleText.setFont(new Font("宋体", Font.PLAIN, 15));
		aText.setBounds(60, 80, 500, 40);
		aText.setFont(new Font("宋体", Font.PLAIN, 15));
		bText.setBounds(60, 130, 500, 40);
		bText.setFont(new Font("宋体", Font.PLAIN, 15));
		cText.setBounds(60, 180, 500, 40);
		cText.setFont(new Font("宋体", Font.PLAIN, 15));
		dText.setBounds(60, 230, 500, 40);
		dText.setFont(new Font("宋体", Font.PLAIN, 15));

		answerLabel.setBounds(70, 10, 50, 40);
		answerLabel.setFont(new Font("宋体", Font.PLAIN, 15));
		answerText.setBounds(110, 10, 40, 40);
		answerText.setFont(new Font("宋体", Font.PLAIN, 15));

		saveButton.setBounds(260, 10, 120, 40);
		saveButton.setFont(new Font("宋体", Font.PLAIN, 15));
		saveButton.setFocusable(false);
		imageButton.setBounds(170, 10, 80, 40);
		imageButton.setFont(new Font("宋体", Font.PLAIN, 15));
		imageButton.setFocusable(false);
		backButton.setBounds(400, 10, 80, 40);
		backButton.setFont(new Font("宋体", Font.PLAIN, 15));
		backButton.setFocusable(false);

	}

	@Override
	protected void addElement() {
		messagePanel.add(scrollPane);
		messagePanel.add(titleLable);
		messagePanel.add(aLable);
		messagePanel.add(bLable);
		messagePanel.add(cLable);
		messagePanel.add(dLable);
		messagePanel.add(aText);
		messagePanel.add(bText);
		messagePanel.add(cText);
		messagePanel.add(dText);

		buttonPanel.add(backButton);
		buttonPanel.add(saveButton);
		buttonPanel.add(imageButton);
		buttonPanel.add(answerLabel);
		buttonPanel.add(answerText);

		selectPanel.add(messagePanel);
		selectPanel.add(buttonPanel);
		add(selectPanel);
	}

	@Override
	protected void addListener() {
		saveButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String selectTitleString = selectTitleText.getText();
				String aString = aText.getText();
				String bString = bText.getText();
				String cString = cText.getText();
				String dString = dText.getText();
				String answerString = answerText.getText();
				String titleString = selectTitleString + "?<br> A、" + aString + "<br> B、" + bString + "<br> C、"
						+ cString + "<br> D、" + dString;
				SelectQuestion selectQuestion;
				if(judge) {
					selectQuestion = new SelectQuestion(titleString, answerString,pictureSrc);
					judge = false;
				}else {
					selectQuestion = new SelectQuestion(titleString, answerString);
				}
				if (selectQuestion != null) {
					selectQuestionService = new SelectQuestionServiceImpl();
					selectQuestionService.addSelectQuestion(selectQuestion);
					JOptionPane.showMessageDialog(AdminAddSelectQuestionFrame.this, "上传题目成功");
				}
			}
		});

		backButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				AdminFrame adminFrame = new AdminFrame(user.getName() + "进行试卷整合", user);
				adminFrame.getAdminFrame().setVisible(true);
				setVisible(false);
			}
		});

		imageButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser jfc = new JFileChooser();
				if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
					File file = jfc.getSelectedFile();
					pictureSrc = file.getName();
					File file2 = null;
					byte[] b = new byte[(int) file.length()];
					FileInputStream in = null;
					FileOutputStream out = null;
					try {
						in = new FileInputStream(file);
						file2 = new File(DatabaseConfig.IMAGE + pictureSrc);
						if (!file2.exists()) {
							file2.createNewFile();
						}
						out = new FileOutputStream(file2);

						while (in.read(b) != -1) {
							out.write(b);
						}
						out.flush();
						in.close();
						out.close();
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				}
				judge = true;
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

	public static void main(String[] args) {
		new AdminAddSelectQuestionFrame();
	}
}
