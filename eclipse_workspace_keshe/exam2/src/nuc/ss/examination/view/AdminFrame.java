package nuc.ss.examination.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import nuc.ss.examination.entry.User;

public class AdminFrame extends BaseFrame{
	private static final long serialVersionUID = 1L;
	
	private User user;
	private AdminFrame adminFrame;
	public AdminFrame() {
		adminFrame = this;
		this.init();
	}
	public AdminFrame(String title,User user) {
		super(title);
		adminFrame = this;
		this.user = user;
		this.init();
	}
	
	public AdminFrame getAdminFrame() {
		return adminFrame;
	}
	
	private JMenuBar menuBar = new JMenuBar();
	private JMenu personMenu = new JMenu("管理人员");
	private JMenuItem messageMenuItem = new JMenuItem("用户信息");
	
	private JMenu examMenu = new JMenu("管理考试");
	private JMenuItem selectQuestionMenuItem = new JMenuItem("增加选择题目");
	private JMenuItem questionMenuItem = new JMenuItem("增加大题题目");
	
	@Override
	protected void setup() {
		
		
	}

	@Override
	protected void addElement() {
		personMenu.add(messageMenuItem);
		examMenu.add(selectQuestionMenuItem);
		examMenu.add(questionMenuItem);
		menuBar.add(personMenu);
		menuBar.add(examMenu);

		setJMenuBar(menuBar);
		
	}

	@Override
	protected void addListener() {
		messageMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminMessageFrame("管理用户信息界面", user);
				setVisible(false);
			}
		});
		
		selectQuestionMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminAddSelectQuestionFrame("欢迎管理员" +user.getName() + "增加选择题页面",user);
				setVisible(false);
			}
		});		
		
		questionMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminAddQuestionFrame("欢迎管理员" +user.getName() + "增加大题页面",user);
				setVisible(false);
			}
		});
	}
	
	@Override
	protected void setFrameSelf() {
		this.setVisible(true);
		this.setBounds(240, 200, 400, 300);
		this.setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}
