import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
	Image ball=Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk=Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	double x=100;//С��ĺ�����
	double y=100;//С���������
	boolean right=true;//����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk, 0, 10, null);
		g.drawImage(ball, (int)x, (int)y, null);
		if(right) {
			x=x+10;
		}else {
			x=x-10;
		}
		if(x>860-40-30) {//860�Ǵ��ڵĿ�ȣ�40�Ǳ߿�Ŀ�ȣ�30��С���ֱ��
			right=false;
		}
		if(x<0+40) {//40�Ǳ߿�Ŀ��
			right=true;
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
		BallGame game=new BallGame();
		game.launchFrame();
	}
}
