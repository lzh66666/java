package nuc.ss.test.section8_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame2 {

	public static void main(String[] args) {
		Frame frame = new Frame("我的框架");
		//frame.setSize(new Dimension(500, 200));
		frame.setSize(500, 200);
		//frame.setBackground(new Color(0, 0, 255)); //红绿蓝三原色的颜色值（0-255）
		frame.setBackground(Color.BLUE);
		frame.setResizable(false); //框架大小不可调整。默认为可以调整大小。
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true); // 设置框架可见
	}

}
