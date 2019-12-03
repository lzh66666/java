package nuc.ss.test.section8_7c;

import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.*;
import java.util.*;

public class TestDocumentListener {

	public static void main(String[] args) {
	      WindowTextSort win=new WindowTextSort();
	      win.setTitle("����"); 
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
	      (text1.getDocument()).addDocumentListener(this);//���ĵ�ע�������
	   }
	   public void changedUpdate(DocumentEvent e) { //�ӿڷ���
	      String str=text1.getText(); 
	     //�ո����ֺͷ���(!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)��ɵ�������ʽ:
	      String regex="[\\s\\d\\p{Punct}]+"; 
	      String words[]=str.split(regex); 
	      Arrays.sort(words);      //���ֵ����С��������
	      text2.setText(null); 
	      for(String s:words)
	        text2.append(s+",");
	   }
	   public void removeUpdate(DocumentEvent e) { //�ӿڷ���
	      changedUpdate(e);
	   }
	   public void insertUpdate(DocumentEvent e) { //�ӿڷ���
	      changedUpdate(e);
	   }
}