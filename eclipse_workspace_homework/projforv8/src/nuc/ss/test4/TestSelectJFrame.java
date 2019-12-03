package nuc.ss.test4;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

/**
 * java����P199�����ϰ��4��
 * @author ¬��
 * @version 2019 11 15 18:59
 * 
 */
public class TestSelectJFrame {
	public static void main(String[] args) {
		new SelectJFrame("��ѡ��");
	}
}

class SelectJFrame extends JFrame implements MouseListener{
	JCheckBox cb1,cb2;
	int count1 = 0;
	int count2 = 0;
	public SelectJFrame(String title) {
		super(title);
		setBounds(200,200,200,200);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());
		cb1 = new JCheckBox("ѧϰ");
		cb2 = new JCheckBox("��ˣ");
		add(cb1);add(cb2);
		cb1.addMouseListener(this);
		cb2.addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == cb1 && count1 == 0) {
			count1 = 1;
		}else if(e.getSource() == cb1 && count1 == 1) {
			count1 = 0;
		}else if(e.getSource() == cb2 && count2 == 0) {
			count2 = 1;
		}else if(e.getSource() == cb2 && count2 == 1) {
			count2 = 0;
		}
		
		if(count1 == 1 && count2 == 1) {
			setTitle("���ݽ��");
		}else if(count1 == 1 && count2 == 0) {
			setTitle("ѧϰ");
		}else if(count1 == 0 && count2 == 1) {
			setTitle("��ˣ");
		}else if(count1 == 0 && count2 == 0) {
			setTitle("��ѡ��");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}
}
