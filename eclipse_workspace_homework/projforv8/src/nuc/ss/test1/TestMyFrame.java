package nuc.ss.test1;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * java����P199�����ϰ��1��
 * @author ¬��
 * @version 2019 11 14 21:15
 */
public class TestMyFrame {
	public static void main(String[] args) {
		new MyFrame("��ʾ��ť����Ϣ");
	}
}

class MyFrame extends Frame implements ActionListener{
	Button btn1,btn2;
	TextField textField;
	public MyFrame(String title){
		super(title);
		setBounds(200, 200, 300, 300);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new FlowLayout());
		btn1 = new Button("��ť1");
		btn2 = new Button("��ť2");
		add(btn1);add(btn2);
		textField = new TextField(20);
		add(textField);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(btn1)) {
			textField.setText("���ǰ�ť1");
		}else if(e.getSource().equals(btn2)) {
			textField.setText("���ǰ�ť2");
		}
	}

	
	
	
}