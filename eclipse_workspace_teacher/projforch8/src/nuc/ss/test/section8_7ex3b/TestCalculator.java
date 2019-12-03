package nuc.ss.test.section8_7ex3b;

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
		Calculator calculator = new Calculator("简易计算器");

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
		
		lb1 = new JLabel("操作数：", JLabel.RIGHT);
		lb2 = new JLabel("运算符：", JLabel.RIGHT);
		lb3 = new JLabel("操作数：", JLabel.RIGHT);
		lb4 = new JLabel("运算结果：", JLabel.RIGHT);
		
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf4.setEditable(false);
		
		add(lb1); add(tf1);
		add(lb2); add(tf2);
		add(lb3); add(tf3);
		add(lb4); add(tf4);
		
		btn1 = new JButton("开始计算");
		btn2 = new JButton("重置");
		add(btn1); add(btn2);
		
		ButtonListener btnListener = new ButtonListener();
		btnListener.setTf1(tf1);
		btnListener.setTf2(tf2);
		btnListener.setTf3(tf3);
		btnListener.setTf4(tf4);
		btnListener.setBtn1(btn1);
		btnListener.setBtn2(btn2);
		
		btn2.addActionListener(btnListener);
		btn1.addActionListener(btnListener);
		
	};
	
}

class ButtonListener implements ActionListener {
	JTextField tf1, tf2, tf3, tf4;
	JButton btn1, btn2;
	
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

	public void setBtn1(JButton btn1) {
		this.btn1 = btn1;
	}

	public void setBtn2(JButton btn2) {
		this.btn2 = btn2;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(btn2)) {
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
			tf4.setText("");		
		} else if (e.getSource().equals(btn1)){
			try {
				if(tf1.getText().trim().equals("") || tf2.getText().trim().equals("") ||
						tf3.getText().trim().equals("")) {
					JOptionPane.showMessageDialog(null, "操作数或运算符为空！", "错误信息", JOptionPane.WARNING_MESSAGE);
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
				default: JOptionPane.showMessageDialog(null, "运算符非法！", "错误信息", JOptionPane.WARNING_MESSAGE);
				}
			} catch (NumberFormatException ex) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, "操作数非法！", "错误信息", JOptionPane.WARNING_MESSAGE);
			}		
		}
		
	}
	
}
