package nuc.ss.test.section8_99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo10_10 {

	public static void main(String[] args) {
	      WindowMouse win=new WindowMouse();
	      win.setTitle("处理鼠标事件"); 
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
	      button = new JButton("按钮"); 
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
	      area.append("\n鼠标按下,位置:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseReleased(MouseEvent e) {
	      area.append("\n鼠标释放,位置:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseEntered(MouseEvent e)  {
	      if(e.getSource() instanceof JButton)
	        area.append("\n鼠标进入按纽,位置:"+"("+e.getX()+","+e.getY()+")");
	      if(e.getSource() instanceof JTextField)
	        area.append("\n鼠标进入文本框,位置:"+"("+e.getX()+","+e.getY()+")");
	      if(e.getSource() instanceof JFrame)
	        area.append("\n鼠标进入窗口,位置:"+"("+e.getX()+","+e.getY()+")"); 
	   }
	   public void mouseExited(MouseEvent e) {
	      area.append("\n鼠标退出,位置:"+"("+e.getX()+","+e.getY()+")");
	   }
	   public void mouseClicked(MouseEvent e) {
	      if(e.getClickCount()>=2)
	         area.setText("鼠标连击，位置:"+"("+e.getX()+","+e.getY()+")");
	   }
}

