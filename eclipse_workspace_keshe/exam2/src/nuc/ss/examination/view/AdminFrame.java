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
	private JMenu personMenu = new JMenu("������Ա");
	private JMenuItem messageMenuItem = new JMenuItem("�û���Ϣ");
	
	private JMenu examMenu = new JMenu("������");
	private JMenuItem selectQuestionMenuItem = new JMenuItem("����ѡ����Ŀ");
	private JMenuItem questionMenuItem = new JMenuItem("���Ӵ�����Ŀ");
	
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
				new AdminMessageFrame("�����û���Ϣ����", user);
				setVisible(false);
			}
		});
		
		selectQuestionMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminAddSelectQuestionFrame("��ӭ����Ա" +user.getName() + "����ѡ����ҳ��",user);
				setVisible(false);
			}
		});		
		
		questionMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new AdminAddQuestionFrame("��ӭ����Ա" +user.getName() + "���Ӵ���ҳ��",user);
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
