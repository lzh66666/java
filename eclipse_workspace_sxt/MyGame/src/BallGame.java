import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x=100;//小球的横坐标
	double y=100;//小球的纵坐标
	boolean right=true;//方向
	
	//画窗口的方法
	public void paint(Graphics g) {
		System.out.println("窗口被画了一次");
		g.drawImage(desk, 0, 10, null);
		g.drawImage(ball, (int)x, (int)y, null);
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>860-40-30) {//860是窗口的宽度，40是边框的宽度，30是小球的直径
			right=false;
		}
		if(x<0+40) {//40是边框的宽度
			right=true;
		}
	}
	
	//窗口加载
	void launchFrame(){
		setSize(860,460);//窗口的大小
		setLocation(50,50);//窗口的位置
		setVisible(true);
	
		//重画窗口,每秒画25次
			while(true) {
				repaint();
				try {
					Thread.sleep(40);//40ms 1秒=1000毫秒，大约一秒画25次窗口
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	}

	//main方法是程序执行的入口
	public static void main(String[] args) {
		BallGame game=new BallGame();
		game.launchFrame();
	}
}
