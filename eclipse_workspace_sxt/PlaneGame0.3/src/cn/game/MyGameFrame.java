package cn.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author ¬��
 *
 */
public class MyGameFrame extends JFrame{
	Image plane = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	int planeX=250,planeY=250;
	
	
	@Override
	public void paint(Graphics g) {//�Զ������ã�g�൱��һ֧����
		
		g.drawImage(bg, 0, 0, null);
		g.drawImage(plane, planeX, planeY, null);
		planeX++;
	}
	
	
//	�������Ƿ������ػ�����,�ڲ���
	class paintThread extends Thread{
		@Override
		public void run() 
		{
			while(true) 
			{
				repaint();//�ػ�����
				try {
					Thread.sleep(40);//40ms
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	

//	��ʼ������
	public void launchFrame() 
	{
		this.setTitle("�ɻ���Ŀ");
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
 