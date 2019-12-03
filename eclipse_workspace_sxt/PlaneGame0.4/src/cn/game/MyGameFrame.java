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
 * �ɻ���Ϸ��������
 * @author ¬��
 *
 */
public class MyGameFrame extends JFrame{
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg,250,250);
	@Override
	public void paint(Graphics g) {//�Զ������ã�g�൱��һ֧����
		
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);//���ɻ�
	}
	
	
//	�������Ƿ������ػ�����
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
	//������̼���
	class KeyMontor extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyCode());
		}

		@Override
		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyCode());
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
		
		new paintThread().start();//�����ػ����ڵ��߳�
		addKeyListener(new KeyMontor());//���������Ӽ��̵ļ���
	}
	
	public static void main(String[] args) 
	{
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
}
 