package nuc.ss.test2;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
/**
 * java书P199编程练习第2题
 * @author 卢泽华
 * @version 2019 11 14 22:30
 */
public class TestCalculator {
	public static void main(String[] args) {
		new Calculator("简易计算器");
	}
}

class Calculator extends JFrame implements ActionListener{
	JLabel lb;
	JTextField tf1,tf2;
	JRadioButton radio1,radio2,radio3,radio4;
	ButtonGroup group;
	JButton btn;
	
	public Calculator(String title) {
		super(title);
		setBounds(200, 200, 200, 300);
		setResizable(false);
		init();
		setVisible(true);
	}
	
	private void init() {
		setLayout(new GridLayout(6,3,5,5));
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		add(tf1);add(tf2);
		
		radio1 = new JRadioButton("+");
		radio2 = new JRadioButton("-");
		radio3 = new JRadioButton("*");
		radio4 = new JRadioButton("/");
		group = new ButtonGroup();
		group.add(radio1);
		group.add(radio2);
		group.add(radio3);
		group.add(radio4);		
		
		add(radio1);add(radio2);add(radio3);add(radio4);
		
		btn = new JButton("结果");
		add(btn);
		lb = new JLabel("");
		add(lb);
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		char opr;
		if(radio1.isSelected() == true) {
			opr = '+';
		}else if(radio2.isSelected() == true) {
			opr = '-';
		}else if(radio3.isSelected() == true) {
			opr = '*';
		}else {
			opr = '/';
		}
		float op1 = Float.parseFloat(tf1.getText().trim());
		float op2 = Float.parseFloat(tf2.getText().trim());
		switch (opr) {
		case '+' : lb.setText("" + (op1 + op2)); break;
		case '-' : lb.setText("" + (op1 - op2)); break;
		case '*' : lb.setText("" + (op1 * op2)); break;
		case '/' : lb.setText("" + (op1 / op2)); break;
	}
	}
}
