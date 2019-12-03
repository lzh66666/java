package cn.game;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 卢泽华
 *
 */
public class MyGameFrame extends JFrame{
	/*
	 * 初始化窗口
	 */
	public void launchFrame() {
		this.setTitle("飞机项目");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(200, 200);
		
		this.addWindowListener(new WindowAdapter() {
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 