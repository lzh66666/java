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
	private JMenu personMenu = new JMenu("���˹���");
	private JMenuItem scoreMenuItem = new JMenuItem("�鿴�ɼ�");
	private JMenuItem messageMenuItem = new JMenuItem("������Ϣ");
	
	private JMenu examMenu = new JMenu("����ϵͳ");
	private JMenuItem examMenuItem = new JMenuItem("���뿼��");
	
	
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
		//���뿼��
		examMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new ExamSelectQuestionFrame(user.getName() + "���������",user);
				setVisible(false);
			}
		});
		//������ϵͳ
		scoreMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new StudentScoreFrame("��ӭ"+ user.getName() + "��¼���ϵͳ",user);
				setVisible(false);
			}
		});
		//������˹���---���޸�����
		messageMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MessageFrame("��ӭ" + user.getName() + "����",user);
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
