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
		setTitle("常用组件");
		setBounds(300,300,250,400);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());
		
		l1 = new Label(" 用户名  ");
		
		tf = new JTextField(15);
		add(l1);add(tf);
		
		l2 = new Label("    密码    ");
		password1 = new JPasswordField(15);
		add(l2);add(password1);
		
		l3 = new Label("确认密码");
		password2 = new JPasswordField(15);
		add(l3);add(password2);
		
		l4 = new Label("性             别");
		rb1 = new JRadioButton();
		rb2 = new JRadioButton();
		
		ButtonGroup bGroup = new ButtonGroup();
		bGroup.add(rb1);
		bGroup.add(rb2);
		add(l4);add(rb1);add(rb2);
		
		l5 = new Label("爱好");
		cb1 = new JCheckBox("音乐");
		cb2 = new JCheckBox("旅游");
		cb3 = new JCheckBox("篮球");
		cb4 = new JCheckBox("读书");
		cb5 = new JCheckBox("演讲");
		add(l5);add(cb1); add(cb2);add(cb3);add(cb4);add(cb5);
		
		l6 = new Label("专业方向");
		com = new JComboBox<String>();
		com.addItem("软件开发与测试");
		com.addItem("大数据");
		com.addItem("城乡建设");
		com.addItem("网页开发");
		com.addItem("人工智能");
		add(l6);add(com);
		
		l7 = new Label("个人描述");
		text = new JTextArea(8, 15);
		add(l7);add(new JScrollPane(text));
		
		button1 = new JButton("注册");
		button2 = new JButton("重置");
		add(button1);add(button2);
		
	}
}


