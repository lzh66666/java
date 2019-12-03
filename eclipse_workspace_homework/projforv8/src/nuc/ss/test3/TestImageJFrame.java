package nuc.ss.test3;

import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * java书上P199编程练习第3题
 * @author 卢泽华
 * @version 2019 11 15 18:25
 */
public class TestImageJFrame {
	public static void main(String[] args) {
		new ImageJFrame("不同的区域对应的图片");
	}
}

class ImageJFrame extends JFrame implements MouseListener{
	JLabel lb1,lb2,lb3,lb4;
	
	public ImageJFrame(String title) {
		super(title);
		setBounds(200, 200, 400, 400);
		setResizable(false);
		init();
		setVisible(true);
	}
	
	private void init() {
		setLayout(new GridLayout(2,2,2,2));
		lb1 = new JLabel();
		lb2 = new JLabel();
		lb3 = new JLabel();
		lb4 = new JLabel();
		add(lb1);add(lb2);add(lb3);add(lb4);
		lb1.addMouseListener(this);
		lb2.addMouseListener(this);
		lb3.addMouseListener(this);
		lb4.addMouseListener(this);
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		if(e.getSource() == lb1) {
			lb1.setIcon(new ImageIcon("F://image//1.jpg"));
		}else if(e.getSource() == lb2) {
			lb2.setIcon(new ImageIcon("F://image//2.jpg"));
		}else if(e.getSource() == lb3) {
			lb3.setIcon(new ImageIcon("F://image//3.jpg"));
		}else if(e.getSource() == lb4) {
			lb4.setIcon(new ImageIcon("F://image//4.jpg"));
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource() == lb1) {
			lb1.setIcon(null);
		}else if(e.getSource() == lb2) {
			lb2.setIcon(null);
		}else if(e.getSource() == lb3) {
			lb3.setIcon(null);
		}else if(e.getSource() == lb4) {
			lb4.setIcon(null);
		}
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}
}
