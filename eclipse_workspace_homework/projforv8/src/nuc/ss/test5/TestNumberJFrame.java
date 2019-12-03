package nuc.ss.test5;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TestNumberJFrame {
	public static void main(String[] args) {
		new NumberJFrame("请输入10个整数");
	}
}

class NumberJFrame extends JFrame implements ActionListener{
	JTextField tf;
	JLabel lb;
	JButton button;
	
	public NumberJFrame(String title) {
		super(title);
		setBounds(200,200,300,300);
		setResizable(false);
		init();
		setVisible(true);
	}

	private void init() {
		setLayout(new GridLayout(5,1,2,2));
		tf = new JTextField(10);
		add(tf);
		
		button = new JButton("确定");
		add(button);
		
		lb = new JLabel();
		add(lb);
		
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int max,min;
			String a[] =((tf.getText().trim()).split(" "));
			int [] b = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				b[i] = Integer.parseInt(a[i]);
			}
			max = min = b[0];
			for (int i : b) {
				max = max < i ? i:max;
				min = min > i ? i:min;
			}
			lb.setText("最大值:" + max + "\n最小值:" + min);	
		} catch (NumberFormatException e2) {
			lb.setText("其中输入的有不是数字的");
		}
		
	}
}
