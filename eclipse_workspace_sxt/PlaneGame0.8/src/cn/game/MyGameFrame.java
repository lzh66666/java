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
 * 飞机游戏的主窗口
 * @author 卢泽华
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
	int period;   //游戏持续时间
	
	Shell[] shells = new Shell[50];
	
	@Override
	public void paint(Graphics g) {//自动被调用，g相当于一支画笔
		Color   c =  g.getColor();
		g.drawImage(bg, 0, 0, null);
		
		plane.drawSelf(g);//画飞机
		
		//画出所有的炮弹
		for (int i = 0; i < shells.length; i++) {
			shells[i].draw(g);
			
			boolean peng = shells[i].getRect().intersects(plane.getRect());
//			飞机与炮弹的碰撞检测
			if(peng) {
				plane.live = false;
				
				
				if(bao == null) {
					bao = new Explode(plane.x, plane.y);
					endTime = new Date();
					period = (int)((endTime.getTime()-startTime.getTime())/1000);
					
				}
				bao.draw(g);
			}
			
//			计时功能
			if(!plane.live) {
				g.setColor(Color.red);
				Font f = new Font("宋体",Font.BOLD,50);
				g.setFont(f);
				g.drawString("时间:"+period+"秒",(int)plane.x,(int)plane.y);
			}
		}
		g.setColor(c);
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
		
		//初始化50个炮弹
		for (int i = 0; i < shells.length; i++) {
			shells[i] = new Shell();
			
		}
	}
	
	public static void main(String[] args){
		
		MyGameFrame f = new MyGameFrame();
		f.launchFrame();
	}
//	双缓冲
	private Image offScreenImage = null;
	 
	public void update(Graphics g) {
	    if(offScreenImage == null)
	        offScreenImage = this.createImage(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);//这是游戏窗口的宽度和高度
	     
	    Graphics gOff = offScreenImage.getGraphics();
	    paint(gOff);
	    g.drawImage(offScreenImage, 0, 0, null);
	}
}
 