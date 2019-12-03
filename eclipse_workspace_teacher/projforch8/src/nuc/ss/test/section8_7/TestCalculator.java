package nuc.ss.test.section8_7;

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
		new Calculator();
	}

}

class Calculator extends JFrame {
	JTextField t1, t2, t3, t4;
	JLabel l1, l2, l3, l4;
	JButton resetbtn, countbtn;
	
	public Calculator() {
		super("���׼�����");
		setSize(200, 260);
		setLocation(560, 240);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new GridLayout(5, 2, 5, 5));
		
		// ����4����ǩ����
		l1 = new JLabel("��������", JLabel.RIGHT);
		l2 = new JLabel("�������", JLabel.RIGHT);
		l3 = new JLabel("��������", JLabel.RIGHT);
		l4 = new JLabel("��������", JLabel.RIGHT);
		
		// ����4�������ı������
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		t4 = new JTextField(20);
		t4.setEditable(false);
		
		// ����2����ť�����ð�ť�Ϳ�ʼ���㰴ť
		resetbtn = new JButton("����");
		countbtn = new JButton("��ʼ����");
		 
		// �ڵ�ǰ���������Ӹ���������󣨱�ǩ�������ı��򡢰�ť��
		add(l1); add(t1);
		add(l2); add(t2);
		add(l3); add(t3);
		add(l4); add(t4);		 
		add(resetbtn); add(countbtn);
		 
		// Ϊ���ð�ťע���¼������������Լ�������Ӧ����������Ӧ�¼�
		resetbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		});
		 
		// Ϊ��ʼ���㰴ťע���¼������������Լ�������Ӧ����������Ӧ�¼�
		countbtn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				btnClick();			
			}
		});
	}
	
	private void btnClick(){
		float op1=Float.parseFloat(t1.getText().trim());
		float op2=Float.parseFloat(t3.getText().trim());
		char opr=(t2.getText().trim()).charAt(0);		
		switch(opr){
		    case '+': t4.setText(""+(op1+op2));break;
		    case '-': t4.setText(""+(op1-op2));break;
		    case '*': t4.setText(""+(op1*op2));break;
		    case '/': t4.setText(""+(op1/op2));break;
		    default: JOptionPane.showMessageDialog(t4, "����ʽ����", "������ʾ", 
		    		                               JOptionPane.WARNING_MESSAGE);
		}
	}
}