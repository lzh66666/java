package nuc.ss.window;

import java.awt.Color;

import javax.swing.JFrame;

public class TestJFrame2 {
	public static void main(String[] args) {
		new MyWindow("ΞÒµΔ΄°Με2");
	}
}


class MyWindow extends JFrame{
	private static final long serialVersionUID = 1L;

	public MyWindow(String title) {
		super(title);
		this.setSize(500, 200);
		this.getContentPane().setBackground(Color.RED);
		this.setVisible(true);
	}
}