package nuc.ss.test.section8_99;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo11_1 {

	public static void main(String[] args) {
	      MyWindow win=new MyWindow();
	      win.setTitle("���Ի���Ĵ���"); 
	}

}

class MyWindow extends JFrame implements ActionListener {
	   JTextArea text; 
	   JButton button; 
	   MyDialog dialog;
	   MyWindow() {
	      init();
	      setBounds(60,60,300,300); 
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   void init() {
	      text=new JTextArea(5,22); 
	      button=new JButton("�򿪶Ի���"); 
	      button.addActionListener(this);
	      setLayout(new FlowLayout());
	      add(button); 
	      add(text); 
	      dialog=new MyDialog(this,"���ǶԻ���",true);//�Ի���������MyWindow�����Ĵ���
	   }
	   public void actionPerformed(ActionEvent e) {
	      if(e.getSource()==button) {
	        int x=this.getBounds().x+this.getBounds().width;
	        int y=this.getBounds().y;
	        dialog.setLocation(x,y);
	        dialog.setVisible(true); //�Ի��򼤻�״̬ʱ,�����������䡣
	        //�Ի�����ʧ�������������ִ�У�
	        if(dialog.getMessage()==MyDialog.YES)   //��������˶Ի����yes��ť
	            text.append("\n�㵥���˶Ի����yes��ť");
	 
	        else if(dialog.getMessage()==MyDialog.NO) //��������˶Ի����no��ť
	            text.append("\n�㵥���˶Ի����No��ť");
	        else if(dialog.getMessage()==-1) 
	            text.append("\n�㵥���˶Ի���Ĺر�ͼ��");
	      }
	   }
}

class MyDialog extends JDialog implements ActionListener  { //�Ի�����
	   static final int YES=1,NO=0;
	   int message=-1; 
	   JButton yes,no;
	    MyDialog(JFrame f,String s,boolean b) { //���췽��	
	       super(f,s,b);
	       yes=new JButton("Yes"); 
	       yes.addActionListener(this);
	       no=new JButton("No");  
	       no.addActionListener(this);
	       setLayout(new FlowLayout());
	       add(yes); 
	       add(no);
	       setBounds(60,60,100,100);
	       addWindowListener(new WindowAdapter(){
	                           public void windowClosing(WindowEvent e){
	                              message=-1;
	                              setVisible(false);
	                           }
	                         });
	    }
	    public void actionPerformed(ActionEvent e) {
	       if(e.getSource()==yes) {
	           message=YES;
	           setVisible(false);
	       }
	       else if(e.getSource()==no) {
	           message=NO;
	           setVisible(false);
	       }
	    }
	    public int getMessage() {
	       return message;
	    }
}
