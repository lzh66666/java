package nuc.ss.test.section8_99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo10_10 {

	public static void main(String[] args) {
	      WindowMouse win=new WindowMouse();
	      win.setTitle("��������¼�"); 
	      win.setBounds(10,10,460,360);

	}

}

class WindowMouse extends JFrame {
	   JTextField text; 
	   JButton button;
	   JTextArea textArea;
	   MousePolice police; 
	   WindowMouse() {
	      init();
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	   }
	   void init() {
	      setLayout(new FlowLayout());
	      text = new JTextField(8);
	      textArea = new JTextArea(5,28);
	      police = new MousePolice();
	      police.setJTextArea(textArea); 
	      text.addMouseListener(police);
	      button = new JButton("��ť"); 
	      button.addMouseListener(police);
	      addMouseListener(police);
	      add(button);
	      add(text);
	      add(new JScrollPane(textArea));
	   }
}

class MousePolice implements MouseListener {
	   JTextArea area;
	   public void setJTextArea(JTextArea area) {
	      this.area = area;
	   }
	   public void mousePressed(MouseEvent e) {
	      area.append("\n��갴��,λ��:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseReleased(MouseEvent e) {
	      area.append("\n����ͷ�,λ��:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseEntered(MouseEvent e)  {
	      if(e.getSource() instanceof JButton)
	        area.append("\n�����밴Ŧ,λ��:"+"("+e.getX()+","+e.getY()+")");
	      if(e.getSource() instanceof JTextField)
	        area.append("\n�������ı���,λ��:"+"("+e.getX()+","+e.getY()+")");
	      if(e.getSource() instanceof JFrame)
	        area.append("\n�����봰��,λ��:"+"("+e.getX()+","+e.getY()+")"); 
	   }
	   public void mouseExited(MouseEvent e) {
	      area.append("\n����˳�,λ��:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseClicked(MouseEvent e) {
	      if(e.getClickCount()>=2)
	         area.setText("���������λ��:"+"("+e.getX()+","+e.getY()+")");
	   }
}

