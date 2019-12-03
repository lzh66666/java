package cn.game;


import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Date;

import javax.swing.JFrame;

/**
 * �ɻ���Ϸ��������
 * @author ¬��
 *
 */
public class MyGameFrame extends Frame{
	Image planeImg = GameUtil.getImage("images/plane.png");
	Image bg = GameUtil.getImage("images/bg.jpg");
	
	Plane plane = new Plane(planeImg,250,250);
	Shell shell = new Shell();
	
	Explode bao;
	
	Date startTime = new Date();
	Date endTime;
	int period;   //��Ϸ����ʱ��
	
	Shell[] shells = new Shell[50];
	
	@Override
	public void paint(Graphics g) {//�Զ������ã�g�൱��һ֧����
		Color   c =  g.getColor();
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);//���ɻ�
		
		//�������е��ڵ�
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			
			boolean peng = shells[i].getRect().intersects(plane.getRect());
//			�ɻ����ڵ�����ײ���
			if(peng) {
				plane.live = false;
				
				
				if(bao == null) {
					bao = new Explode(plane.x, plane.y);
					endTime = new Date();
					period = (int)((endTime.getTime()-startTime.getTime())/1000);
					
				}
				bao.draw(g);
			}
			
//			��ʱ����
			if(!plane.live) {
				g.setColor(Color.red);
				Font f = new Font("����",Font.BOLD,50);
				g.setFont(f);
				g.drawString("ʱ��:"+period+"��",(int)plane.x,(int)plane.y);
			}
		}
		g.setColor(c);
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
			plane.addDirection(e);
		}

		@Override
		public void keyReleased(KeyEvent e) {
			plane.minusDirection(e);
		}
		
		
	}

//	��ʼ������
	public void launchFrame() 
	{
		this.setTitle("�ɻ���Ŀ");
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
		
		new paintThread().start();//�����ػ����ڵ��߳�
		addKeyListener(new KeyMontor());//���������Ӽ��̵ļ���
		
		//��ʼ��50���ڵ�
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
			
		}
	}
	
	public static void main(String[] args){
		
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
//	˫����
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//������Ϸ���ڵĿ�Ⱥ͸߶�
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}
}
 