package nuc.ss.test.section8_2b;

import java.awt.Color;

import javax.swing.JFrame;

public class TestJFrame2 {
	public static void main(String[] args) {
		MyWindow frame = new MyWindow("ΞÒµΔ΄°Με2");
	}
}

class MyWindow extends JFrame {

	public MyWindow(String title) {
		super(title);  //setTitle(title);
		setSize(500, 200);
		setLocation(300, 300);
		getContentPane().setBackground(Color.ORANGE);
		setVisible(true);
	}
}
