package nuc.ss.test.section8_7ex2b;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TestCalculator {
	public static void main(String[] args) {
		Calculator calculator = new Calculator("���׼�����");

	}
}

class Calculator extends JFrame {
	JLabel lb1, lb2, lb3, lb4;
	JTextField tf1, tf2, tf3, tf4;
	JButton btn1, btn2;
	
	public Calculator(String title) {
		super(title);
		setSize(200, 260);
		this.setLocation(560, 240);
		this.setResizable(false);
		init();
		this.setVisible(true);

	}

	private void init() {
		this.setLayout(new GridLayout(5, 2, 5, 5));
		
		lb1 = new JLabel("��������", JLabel.RIGHT);
		lb2 = new JLabel("�������", JLabel.RIGHT);
		lb3 = new JLabel("��������", JLabel.RIGHT);
		lb4 = new JLabel("��������", JLabel.RIGHT);
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf4.setEditable(false);
		
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(lb3); add(tf3);
		add(lb4); add(tf4);
		
		btn1 = new JButton("��ʼ����");
		btn2 = new JButton("����");
		add(btn1); add(btn2);
		
		Button2Listener btn2Listener = new Button2Listener();
		btn2Listener.setTf1(tf1);
		btn2Listener.setTf2(tf2);
		btn2Listener.setTf3(tf3);
		btn2Listener.setTf4(tf4);
		btn2.addActionListener(btn2Listener);
		
		Button1Listener btn1Listener = new Button1Listener();		
		btn1Listener.setTf1(tf1);
		btn1Listener.setTf2(tf2);
		btn1Listener.setTf3(tf3);
		btn1Listener.setTf4(tf4);
		btn1.addActionListener(btn1Listener);
		
	};
	
}

class Button2Listener implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	
	public void setTf1(JTextField tf1) {
		this.tf1 = tf1;
	}

	public void setTf2(JTextField tf2) {
		this.tf2 = tf2;
	}

	public void setTf3(JTextField tf3) {
		this.tf3 = tf3;
	}

	public void setTf4(JTextField tf4) {
		this.tf4 = tf4;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		
	}
	
}

class Button1Listener implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	
	public void setTf1(JTextField tf1) {
		this.tf1 = tf1;
	}

	public void setTf2(JTextField tf2) {
		this.tf2 = tf2;
	}

	public void setTf3(JTextField tf3) {
		this.tf3 = tf3;
	}

	public void setTf4(JTextField tf4) {
		this.tf4 = tf4;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(tf1.getText().trim().equals("") || tf2.getText().trim().equals("") ||
					tf3.getText().trim().equals("")) {
				JOptionPane.showMessageDialog(null, "�������������Ϊ�գ�", "������Ϣ", JOptionPane.WARNING_MESSAGE);
				return;
			}
			float op1 = Float.parseFloat(tf1.getText().trim());
			float op2 = Float.parseFloat(tf3.getText().trim());
			char opr = (tf2.getText().trim()).charAt(0);
			switch (opr) {
			case '+' : tf4.setText("" + (op1 + op2)); break;
			case '-' : tf4.setText("" + (op1 - op2)); break;
			case '*' : tf4.setText("" + (op1 * op2)); break;
			case '/' : tf4.setText("" + (op1 / op2)); break;
			default: JOptionPane.showMessageDialog(null, "������Ƿ���", "������Ϣ", JOptionPane.WARNING_MESSAGE);
			}
		} catch (NumberFormatException ex) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "�������Ƿ���", "������Ϣ", JOptionPane.WARNING_MESSAGE);
		} 
		
	}
	
}
