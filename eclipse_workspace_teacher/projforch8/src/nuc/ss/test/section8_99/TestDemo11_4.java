package nuc.ss.test.section8_99;

import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;

public class TestDemo11_4 {

	public static void main(String[] args) {
	      WindowInput win=new WindowInput();
	      win.setTitle("������Ի���Ĵ���"); 
	}

}

class WindowInput extends JFrame implements ActionListener {
	   int m;
	   JButton openInput;
	   WindowInput() {
	       openInput=new JButton("��������Ի���");
	       add(openInput,BorderLayout.NORTH);
	       openInput.addActionListener(this); 
	       setBounds(60,60,300,300);        
	       setVisible(true);
	       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   public void actionPerformed(ActionEvent e) { 
	      String str=JOptionPane.showInputDialog(this,"����������","����Ի���",
	                                              JOptionPane.PLAIN_MESSAGE);
	      if(str!=null) {
	        
	try {
	              m=Integer.parseInt(str);
	              setSize(m,m);
	         }
	         catch(Exception exp){} 
	      }
	     
	   }
}

