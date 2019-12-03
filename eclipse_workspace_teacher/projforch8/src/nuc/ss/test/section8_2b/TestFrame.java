package nuc.ss.test.section8_2b;

import java.awt.Color;
import java.awt.Frame;

public class TestFrame {

	public static void main(String[] args) {
		Frame frame = new Frame("我的第一个窗口");
		frame.setSize(500, 200);
		frame.setBackground(new Color(255, 0, 0));
		frame.setVisible(true);
	}

}
