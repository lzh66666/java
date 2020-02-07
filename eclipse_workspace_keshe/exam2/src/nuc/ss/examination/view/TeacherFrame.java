package nuc.ss.examination.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import nuc.ss.examination.entry.User;

public class TeacherFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;
	
	private User user;
	private TeacherFrame teacherFrame;

	public TeacherFrame() {
		teacherFrame = this;
		this.init();
	}

	public TeacherFrame(String title, User user) {
		super(title);
		this.user = user;
		teacherFrame = this;
		this.init();
	}

	public TeacherFrame getTeacherFrame() {
		return teacherFrame;
	}

	private JMenuBar menuBar = new JMenuBar();
	private JMenu personMenu = new JMenu("���˹���");
	private JMenuItem messageMenuItem = new JMenuItem("������Ϣ");

	private JMenu examMenu = new JMenu("����ϵͳ");
	private JMenuItem examMenuItem = new JMenuItem("�����о�ϵͳ");

	@Override
	protected void setup() {

	}

	@Override
	protected void addElement() {
		personMenu.add(messageMenuItem);
		examMenu.add(examMenuItem);
		menuBar.add(personMenu);
		menuBar.add(examMenu);

		setJMenuBar(menuBar);

	}

	@Override
	protected void addListener() {
		// ������˹���---���޸�����
		messageMenuItem.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MessageFrame("��ӭ��ʦ" + user.getName() + "����", user);
				setVisible(false);
			}
		});
		
		examMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new TeacherExamFrame("��ӭ��ʦ" + user.getName() + "������ϵͳ",user);
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
