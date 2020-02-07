package nuc.ss.examination.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import nuc.ss.examination.entry.User;

public class StudentFrame extends BaseFrame{
	private static final long serialVersionUID = 1L;
	
	private User user;
	private StudentFrame studentFrame;
	public StudentFrame() {
		studentFrame = this;
		this.init();
	}
	
	public StudentFrame(String title,User user) {
		super(title);
		studentFrame = this;
		this.user = user;
		this.init();
	}
	
	public StudentFrame getStudentFrame() {
		return studentFrame;
	}
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu personMenu = new JMenu("个人管理");
	private JMenuItem scoreMenuItem = new JMenuItem("查看成绩");
	private JMenuItem messageMenuItem = new JMenuItem("个人信息");
	
	private JMenu examMenu = new JMenu("考试系统");
	private JMenuItem examMenuItem = new JMenuItem("进入考试");
	
	
	@Override
	protected void setup() {
		
	}
	
	@Override
	protected void addElement() {
		personMenu.add(scoreMenuItem);
		personMenu.add(messageMenuItem);
		examMenu.add(examMenuItem);
		menuBar.add(personMenu);
		menuBar.add(examMenu);
		
		setJMenuBar(menuBar);
	}

	@Override
	protected void addListener() {
		//进入考试
		examMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ExamSelectQuestionFrame(user.getName() + "请认真答题",user);
				setVisible(false);
			}
		});
		//进入查分系统
		scoreMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StudentScoreFrame("欢迎"+ user.getName() + "登录查分系统",user);
				setVisible(false);
			}
		});
		//进入个人管理---如修改密码
		messageMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MessageFrame("欢迎" + user.getName() + "到来",user);
				setVisible(false);
			}
		});
		
	}

	@Override
	protected void setFrameSelf() {
		this.setVisible(true);
		this.setBounds(240,200,400,300);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
