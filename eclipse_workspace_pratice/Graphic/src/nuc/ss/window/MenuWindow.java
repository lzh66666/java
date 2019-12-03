package nuc.ss.window;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuWindow{
	public static void main(String[] args) {
		new MyMenuWindow("�ҵĴ���");
	}
}

class MyMenuWindow extends JFrame{
	private static final long serialVersionUID = 1L;

	public MyMenuWindow(String str) {
		super(str);
		setSize(500, 200);
		getContentPane().setBackground(Color.ORANGE);
		setLocation(300,100);
		init();
		setVisible(true);
	}
	
	public void init() {
		JMenuBar mb = new JMenuBar();
		
		JMenu usermanager = new JMenu("�û�����");
		JMenuItem add = new JMenuItem("����");
		JMenuItem delete = new JMenuItem("ɾ��");
		JMenuItem modify = new JMenuItem("�޸�");
		usermanager.add(add);
		usermanager.add(delete);
		usermanager.add(modify);
		mb.add(usermanager);
		
		JMenu scoremanager = new JMenu("�ɼ�����");
		JMenuItem input = new JMenuItem("¼��");
		JMenuItem search = new JMenuItem("��ѯ",new ImageIcon());
		scoremanager.add(input);
		scoremanager.addSeparator();
		scoremanager.add(search);
		mb.add(scoremanager);
		
		setJMenuBar(mb);
	}
}