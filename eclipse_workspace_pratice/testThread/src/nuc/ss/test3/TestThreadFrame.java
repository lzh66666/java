package nuc.ss.test3;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class TestThreadFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThreadFrame mt = new MyThreadFrame();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		Thread t3 = new Thread(mt);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
		t1.start();
		t2.start();
		t3.start();		

	}

}
class MyThreadFrame  implements Runnable {
	private int ticket = 10;	
	public void run() {
		new TicketWindow();
	}
	class TicketWindow extends JFrame {
		private static final long serialVersionUID = 1L;
		
		JButton bt;		
		int g, r, b;
		JLabel l3, l4;
		public TicketWindow(){
			Random rand = new Random();
			g = rand.nextInt(255);
			r = rand.nextInt(255);
			b = rand.nextInt(255);
			setTitle("��Ʊ����");
			this.getContentPane().setBackground(new Color(g,r,b));			
			this.setSize(400,400);
			init();
			this.setResizable(false);
			this.setVisible(true);			
		}
		public void init(){
			
			this.setLayout(new GridLayout(3,1,2,2));		
			JPanel p1=new JPanel();
			//ImageIcon image = new ImageIcon("d:\\girl.jpg");	
			//ImageIcon image = new ImageIcon("girl.jpg");//ͼƬ�ڱ�������
			ImageIcon image = null;
			if (Thread.currentThread().getName() == "t1")
				image = new ImageIcon("src\\123.jpg");//ͼƬ��src��
			else if (Thread.currentThread().getName() == "t2")
				image = new ImageIcon("src\\789.jpg");//ͼƬ��src��
			else
				image = new ImageIcon("src\\girl.jpg");//ͼƬ��src��
			
			JLabel l1 = new JLabel(image);
			JLabel l2 = new JLabel("���ã�������Ҫ��Ʊ��");
			p1.add(l1);
			p1.add(l2);
			JPanel p2 = new JPanel();
			String str = "Ŀǰ��ʣƱ����" + ticket + "��";
			l3 = new JLabel(str, JLabel.CENTER);
			bt = new JButton("  ��Ʊ������    ");		
			p2.add(l3);
			p2.add(bt);
			l4 = new JLabel("", JLabel.CENTER);
			l4.setFont(new Font("����", Font.BOLD, 30));
			l4.setForeground(Color.white);
			add(p1);			
			add(p2);
			add(l4);
			bt.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					if(ticket > 0)
					{
						l4.setText("����Ʊ�ɹ�����λ���ǣ�" + ticket);
						ticket--;						
					}else{
						l4.setText("�ǳ���Ǹ����Ʊ������");
					}
					String str = "Ŀǰ��ʣƱ����" + ticket + "��";
					l3.setText(str);
				}
				
			});		
			
		}
	}
}

