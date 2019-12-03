package cn.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * 飞机游戏的主窗口
 * @author 卢泽华
 *
 */
public class MyGameFrame extends JFrame{
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX=250,planeY=250;
	
	
	@Override
	public void paint(Graphics g) {//自动被调用，g相当于一支画笔
		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}
	
	
//	帮助我们反复的重画窗口,内部类
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
	

//	初始化窗口
	public void launchFrame() 
	{
		this.setTitle("飞机项目");
		this.setVisible(true);
		this.setSize(500, 500);
		this.setLocation(200, 200);
		
		this.addWindowListener(new WindowAdapter() 
		{
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		new paintThread().start();
	}
	
	public static void main(String[] args) 
	{
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 