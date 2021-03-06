package nuc.ss.window;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuWindow{
	public static void main(String[] args) {
		new MyMenuWindow("我的窗口");
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
		
		JMenu usermanager = new JMenu("用户管理");
		JMenuItem add = new JMenuItem("添加");
		JMenuItem delete = new JMenuItem("删除");
		JMenuItem modify = new JMenuItem("修改");
		usermanager.add(add);
		usermanager.add(delete);
		usermanager.add(modify);
		mb.add(usermanager);
		
		JMenu scoremanager = new JMenu("成绩管理");
		JMenuItem input = new JMenuItem("录入");
		JMenuItem search = new JMenuItem("查询",new ImageIcon());
		scoremanager.add(input);
		scoremanager.addSeparator();
		scoremanager.add(search);
		mb.add(scoremanager);
		
		setJMenuBar(mb);
	}
}
