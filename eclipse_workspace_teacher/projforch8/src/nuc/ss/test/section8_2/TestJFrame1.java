package nuc.ss.test.section8_2;

import java.awt.Color;

import javax.swing.JFrame;

public class TestJFrame1 {

	public static void main(String[] args) {
		JFrame frame = new JFrame("�ҵĴ���");
		frame.setSize(500, 200);
		frame.setBackground(Color.RED);
		//frame.getContentPane().setBackground(Color.RED);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Ĭ������ΪJFrame.EXIT_ON_CLOSE
		//frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.setVisible(true);

	}

}
