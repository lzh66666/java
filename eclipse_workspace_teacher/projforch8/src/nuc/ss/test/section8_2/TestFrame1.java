package nuc.ss.test.section8_2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;

public class TestFrame1 {

	public static void main(String[] args) {
		Frame frame = new Frame("�ҵĿ��");
		//frame.setSize(new Dimension(500, 200));
		frame.setSize(500, 200);
		//frame.setBackground(new Color(0, 0, 255)); //��������ԭɫ����ɫֵ��0-255��
		frame.setBackground(Color.BLUE);
		//frame.setResizable(false); //��ܴ�С���ɵ�����Ĭ��Ϊ���Ե�����С��
		
		frame.setVisible(true); // ���ÿ�ܿɼ�
	}

}
