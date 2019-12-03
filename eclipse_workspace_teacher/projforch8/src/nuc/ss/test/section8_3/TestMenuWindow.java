package nuc.ss.test.section8_3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TestMenuWindow {

	public static void main(String[] args) {
		new MyMenuWindow("成绩管理系统");

	}

}

class MyMenuWindow extends JFrame {

	public MyMenuWindow(String title) {
		super(title);  
		setSize(500, 200);
		setLocation(300, 300);
		getContentPane().setBackground(Color.ORANGE);
		init(); // 新增初始化方法
		setVisible(true);
	}
	
	private void init() {
		JMenu userManager = new JMenu("用户管理");
		JMenuItem add = new JMenuItem("添加");
		JMenuItem delete = new JMenuItem("删除");
		JMenuItem modify = new JMenuItem("修改");
		userManager.add(add);
		userManager.add(delete);
		userManager.add(modify);
		
		JMenu scoreManager = new JMenu("成绩管理");
		JMenuItem input = new JMenuItem("录入");
		JMenuItem search = new JMenuItem("查询", new ImageIcon("f:\\search.jpg"));
		scoreManager.add(input);
		scoreManager.addSeparator(); // 给菜单添加分割线
		scoreManager.add(search);

		JMenuBar mb = new JMenuBar();
		mb.add(userManager);
		mb.add(scoreManager);
		
		setJMenuBar(mb);
			
	}
}
