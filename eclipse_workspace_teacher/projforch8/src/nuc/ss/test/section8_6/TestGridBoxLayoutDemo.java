package nuc.ss.test.section8_6;

import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestGridBoxLayoutDemo extends JFrame {
	public TestGridBoxLayoutDemo() {
		
		setLayout(new GridLayout(2, 1));
		
		// 沿X轴放置
		JPanel pane1 = new JPanel();
		pane1.setLayout(new BoxLayout(pane1, BoxLayout.X_AXIS));
		pane1.add(new JButton("btn11"));
		pane1.add(new JButton("btn12"));
		pane1.add(new JButton("btn13"));
		pane1.add(new JButton("btn14"));
		add(pane1);
		
		// 沿y轴放置
		JPanel pane2 = new JPanel();
		pane2.setLayout(new BoxLayout(pane2, BoxLayout.Y_AXIS));
		pane2.add(new JButton("btn21"));
		pane2.add(new JButton("btn22"));
		pane2.add(new JButton("btn23"));
		pane2.add(new JButton("btn24"));
		add(pane2);
		
		//this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(this);
        this.pack();
		this.setVisible(true);
	}
	public static void main(String[] args) {
		TestGridBoxLayoutDemo b = new TestGridBoxLayoutDemo();
	}
}