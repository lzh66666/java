package nuc.ss.test.section8_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame2 {

	public static void main(String[] args) {
		Frame frame = new Frame("�ҵĿ��");
		//frame.setSize(new Dimension(500, 200));
		frame.setSize(500, 200);
		//frame.setBackground(new Color(0, 0, 255)); //��������ԭɫ����ɫֵ��0-255��
		frame.setBackground(Color.BLUE);
		frame.setResizable(false); //��ܴ�С���ɵ�����Ĭ��Ϊ���Ե�����С��
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		frame.setVisible(true); // ���ÿ�ܿɼ�
	}

}
