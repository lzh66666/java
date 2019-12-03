package nuc.ss.test.section8_3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestMenuWindow {

	public static void main(String[] args) {
		new MyMenuWindow("�ɼ�����ϵͳ");

	}

}

class MyMenuWindow extends JFrame {

	public MyMenuWindow(String title) {
		super(title);  
		setSize(500, 200);
		setLocation(300, 300);
		getContentPane().setBackground(Color.ORANGE);
		init(); // ������ʼ������
		setVisible(true);
	}
	
	private void init() {
		JMenu userManager = new JMenu("�û�����");
		JMenuItem add = new JMenuItem("���");
		JMenuItem delete = new JMenuItem("ɾ��");
		JMenuItem modify = new JMenuItem("�޸�");
		userManager.add(add);
		userManager.add(delete);
		userManager.add(modify);
		
		JMenu scoreManager = new JMenu("�ɼ�����");
		JMenuItem input = new JMenuItem("¼��");
		JMenuItem search = new JMenuItem("��ѯ", new ImageIcon("f:\\search.jpg"));
		scoreManager.add(input);
		scoreManager.addSeparator(); // ���˵���ӷָ���
		scoreManager.add(search);

		JMenuBar mb = new JMenuBar();
		mb.add(userManager);
		mb.add(scoreManager);
		
		setJMenuBar(mb);
			
	}
}
