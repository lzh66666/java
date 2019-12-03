package nuc.ss.test.section8_2;

import java.awt.Color;

import javax.swing.JFrame;

public class TestJFrame2b {

	public static void main(String[] args) {
		MyWindow2 frame = new MyWindow2("ΞÒµΔ΄°Με2");
		frame.setSize(500, 200);
		frame.setLocation(300, 300);
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setVisible(true);
	}

}

class MyWindow2 extends JFrame {

	public MyWindow2(String title) {
		super(title);  
	}
}
