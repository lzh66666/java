package nuc.ss.test.section8_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo10_13 {

	public static void main(String[] args) {
        new MyFrame("����");

	}

}

class MyFrame extends JFrame {
    Boy police;
    MyFrame(String s) {
        super(s);
        police = new Boy();
        setBounds(100,100,200,300);
        setVisible(true);
        addWindowListener(police);   //�򴰿�ע�������
        validate();
    } 
}
class Boy extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
       System.exit(0);
    }
}