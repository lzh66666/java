package nuc.ss.window;

import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TestDemo {
	public static void main(String[] args) {
		new Table();
	}
}

class Table extends JFrame{
	private static final long serialVersionUID = 1L;
	Label l1,l2,l3,l4,l5,l6,l7;
	JTextField tf;
	JPasswordField password1,password2;
	JRadioButton rb1,rb2;
	JCheckBox cb1,cb2,cb3,cb4,cb5;
	JComboBox<String> com;
	JTextArea text;
	JButton button1,button2;
	
	public Table() {
		setTitle("�������");
		setBounds(300,300,250,400);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());
		
		l1 = new Label(" �û���  ");
		
		tf = new JTextField(15);
		add(l1);add(tf);
		
		l2 = new Label("    ����    ");
		password1 = new JPasswordField(15);
		add(l2);add(password1);
		
		l3 = new Label("ȷ������");
		password2 = new JPasswordField(15);
		add(l3);add(password2);
		
		l4 = new Label("��             ��");
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rb1);
		bGroup.add(rb2);
		add(l4);add(rb1);add(rb2);
		
		l5 = new Label("����");
		cb1 = new JCheckBox("����");
		cb2 = new JCheckBox("����");
		cb3 = new JCheckBox("����");
		cb4 = new JCheckBox("����");
		cb5 = new JCheckBox("�ݽ�");
		add(l5);add(cb1); add(cb2);add(cb3);add(cb4);add(cb5);
		
		l6 = new Label("רҵ����");
		com = new JComboBox<String>();
		com.addItem("������������");
		com.addItem("������");
		com.addItem("���罨��");
		com.addItem("��ҳ����");
		com.addItem("�˹�����");
		add(l6);add(com);
		
		l7 = new Label("��������");
		text = new JTextArea(8, 15);
		add(l7);add(new JScrollPane(text));
		
		button1 = new JButton("ע��");
		button2 = new JButton("����");
		add(button1);add(button2);
		
	}
}


