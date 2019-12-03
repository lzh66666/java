package nuc.ss.test.section8_7c;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;

public class TestDocumentListener {

	public static void main(String[] args) {
	      WindowTextSort win=new WindowTextSort();
	      win.setTitle("窗口"); 
	}

}

class WindowTextSort extends JFrame implements DocumentListener { 
	   JTextArea text1,text2;
	   WindowTextSort() { 
	      init();
	      setLayout(new FlowLayout());
	      setBounds(120,100,260,270);
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	   }
	   void init() {
	      text1=new JTextArea(3,15);
	      text2=new JTextArea(3,15);
	      add(new JScrollPane(text1));
	      add(new JScrollPane(text2));
	      text1.setLineWrap(true);
	      text2.setLineWrap(true); 
	      text2.setEditable(false);
	      (text1.getDocument()).addDocumentListener(this);//向文档注册监视器
	   }
	   public void changedUpdate(DocumentEvent e) { //接口方法
	      String str=text1.getText(); 
	     //空格、数字和符号(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)组成的正则表达式:
	      String regex="[\\s\\d\\p{Punct}]+"; 
	      String words[]=str.split(regex); 
	      Arrays.sort(words);      //按字典序从小到大排序
	      text2.setText(null); 
	      for(String s:words)
	        text2.append(s+",");
	   }
	   public void removeUpdate(DocumentEvent e) { //接口方法
	      changedUpdate(e);
	   }
	   public void insertUpdate(DocumentEvent e) { //接口方法
	      changedUpdate(e);
	   }
}