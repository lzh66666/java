package cn.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 卢泽华
 *
 */
public class MyGameFrame extends JFrame{
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg,250,250);
	Shell shell = new Shell();
	@Override
	public void paint(Graphics g) {//自动被调用，g相当于一支画笔
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);//画飞机
		
		shell.draw(g);
	}
	
	
//	帮助我们反复的重画窗口
	class paintThread extends Thread{
		@Override
		public void run() 
		{
			while(true) 
			{
				repaint();//重画窗口
				try {
					Thread.sleep(40);//40ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	//定义键盘监听
	class KeyMontor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
		
	}

//	初始化窗口
	public void launchFrame() 
	{
		this.setTitle("飞机项目");
		this.setVisible(true);
		this.setSize(Constant.GAME_WIDTH, Constant.GAME_WIDTH);
		this.setLocation(200, 200);
		
		this.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new paintThread().start();//启动重画窗口的线程
		addKeyListener(new KeyMontor());//给窗口增加键盘的监听
	}
	
	public static void main(String[] args) 
	{
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 