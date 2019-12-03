package nuc.ss.test.section8_5;

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

class Calculator extends JFrame {
	JTextField t1, t2, t3, t4;
	JLabel l1, l2, l3, l4;
	JButton resetbtn, countbtn;
	
	public Calculator() {
		super("简易计算器");
		setSize(200, 260);
		setLocation(560, 240);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new GridLayout(5, 2, 5, 5));
		
		l1 = new JLabel("操作数：", JLabel.RIGHT);
		l2 = new JLabel("运算符：", JLabel.RIGHT);
		l3 = new JLabel("操作数：", JLabel.RIGHT);
		l4 = new JLabel("运算结果：", JLabel.RIGHT);
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		//t4.setEditable(false);
		
		 resetbtn = new JButton("重置");
		 countbtn = new JButton("开始计算");
		 
		 add(l1); add(t1);
		 add(l2); add(t2);
		 add(l3); add(t3);
		 add(l4); add(t4);		 
		 add(resetbtn); add(countbtn);
	}	 

}
