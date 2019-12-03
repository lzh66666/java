package nuc.ss.window;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class TestCalculator {
	public static void main(String[] args) {
		new Calculator();
	}
}

class Calculator extends JFrame{
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3,l4;
	JTextField tf1,tf2,tf3,tf4;
	JButton button1,button2;
	
	public Calculator() {
		setTitle("���׼�����");
		setBounds(560,240,200,260);
		setResizable(false);
		Init();
		setVisible(true);
		
	}

	private void Init() {
		setLayout(new GridLayout(5,2,5,5));
		
		l1 = new JLabel("������: ",JLabel.RIGHT);
		l2 = new JLabel("�����: ",JLabel.RIGHT);
		l3 = new JLabel("������: ",JLabel.RIGHT);
		l4 = new JLabel("������: ",JLabel.RIGHT);
		
		tf1 = new JTextField(20);
		tf2 = new JTextField(20);
		tf3 = new JTextField(20);
		tf4 = new JTextField(20);
		tf4.setEditable(false);
		
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(l3);add(tf3);
		add(l4);add(tf4);
		
		button1 = new JButton("����");
		button2 = new JButton("���");
		
		add(button1);
		add(button2);

	}
}
