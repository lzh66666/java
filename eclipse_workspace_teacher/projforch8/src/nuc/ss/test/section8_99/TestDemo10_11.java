package nuc.ss.test.section8_99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class TestDemo10_11 {

	public static void main(String[] args) {
	      WindowMove win=new WindowMove();
	      win.setTitle("处理鼠标拖动事件"); 
	      win.setBounds(10,10,460,360);
	}

}

class WindowMove extends JFrame { 
	   LP layeredPane;
	   WindowMove() {
	      layeredPane = new LP();
	      add(layeredPane,BorderLayout.CENTER);
	      setVisible(true);
	      setBounds(12,12,300,300);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
}

class LP extends JLayeredPane implements MouseListener,MouseMotionListener {
	   JButton button;
	   int x,y,a,b,x0,y0;
	   LP() {
	      button=new JButton("用鼠标拖动我"); 
	      button.addMouseListener(this);
	      button.addMouseMotionListener(this);
	      setLayout(new FlowLayout());
	      add(button,JLayeredPane.DEFAULT_LAYER);
	  }
	  public void mousePressed(MouseEvent e) {
	      JComponent com = null;
	      com = (JComponent)e.getSource(); 
	      setLayer(com,JLayeredPane.DRAG_LAYER);
	      a = com.getBounds().x;
	      b = com.getBounds().y;
	      x0 = e.getX();     //获取鼠标在事件源中的位置坐标
	      y0 = e.getY();
	  }
	  public void mouseReleased(MouseEvent e) {
	      JComponent com = null;
	      com = (JComponent)e.getSource(); 
	      setLayer(com,JLayeredPane.DEFAULT_LAYER);
	  }
	  public void mouseEntered(MouseEvent e)  {}
	    public void mouseExited(MouseEvent e) {}
	    public void mouseClicked(MouseEvent e){}
	    public void mouseMoved(MouseEvent e){} 
	    public void mouseDragged(MouseEvent e) {
	      Component com = null;
	      if(e.getSource() instanceof Component) {
	         com = (Component)e.getSource(); 
	         a = com.getBounds().x; 
	         b = com.getBounds().y;
	         x = e.getX();     //获取鼠标在事件源中的位置坐标
	         y = e.getY();
	         a = a+x;
	         b = b+y;
	         com.setLocation(a-x0, b-y0);
	      }
	    }
}
