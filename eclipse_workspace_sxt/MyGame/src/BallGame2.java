import java.awt.*;
import javax.swing.*;
public class BallGame2 extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x=100;//С��ĺ�����
	double y=100;//С���������
	
	double degree=3.14/3;//60��
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 10, null);
		g.drawImage(ball, (int)x, (int)y, null);
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		if(y>460-40-30||y<10+40) {//һ��40�����ӱ߿���һ���Ǳ������߶�
			degree=-degree;
		}
		if(x>860-40-30||x<40) {
			degree=3.14-degree;
		}
	}
	
	//���ڼ���
	void launchFrame(){
		setSize(860,460);//���ڵĴ�С
		setLocation(50,50);//���ڵ�λ��
		setVisible(true);
	
		//�ػ�����,ÿ�뻭25��
			while(true) {
				repaint();
				try {
					Thread.sleep(40);//40ms 1��=1000���룬��Լһ�뻭25�δ���
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
	}

	//main�����ǳ���ִ�е����
	public static void main(String[] args) {
		BallGame2 game=new BallGame2();
		game.launchFrame();
	}
}
