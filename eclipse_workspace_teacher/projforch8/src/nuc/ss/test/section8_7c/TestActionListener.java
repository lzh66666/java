package nuc.ss.test.section8_7c;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class TestActionListener {

	public static void main(String[] args) {
	      WindowOperation win=new WindowOperation();
	      win.setBounds(100,100,390,360);
	      win.setTitle("�򵥼�����");
	}

}

class WindowOperation extends JFrame {
	   JTextField inputNumberOne,inputNumberTwo; 
	   JComboBox<String> choiceFuhao;
	   JTextArea textShow;
	   JButton button;
	   OperatorListener operator;    //����ItemEvent�¼��ļ�����
	   ComputerListener computer;  //����ActionEvent�¼��ļ�����
	   public WindowOperation() {
	      init();
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   void init() {
	      setLayout(new FlowLayout());
	      inputNumberOne = new JTextField(5);
	      inputNumberTwo = new JTextField(5);
	      choiceFuhao = new JComboBox<String>();
	      button = new JButton("����"); 
	      choiceFuhao.addItem("ѡ���������:");
	      String [] a = {"+","-","*","/"};
	      for(int i=0;i<a.length;i++) {
	          choiceFuhao.addItem(a[i]);
	      }
	      textShow = new JTextArea(9,30);
	      operator = new OperatorListener();
	      computer = new ComputerListener();
	      operator.setJComboBox(choiceFuhao);
	      operator.setWorkTogether(computer);
	      computer.setJTextFieldOne(inputNumberOne);
	      computer.setJTextFieldTwo(inputNumberTwo);
	      computer.setJTextArea(textShow);
	      choiceFuhao.addItemListener(operator);   //choiceFuhao���¼�Դ,operator�Ǽ�����
	      button.addActionListener(computer);     //button���¼�Դ,computer�Ǽ�����
	      add(inputNumberOne);
	      add(choiceFuhao);
	      add(inputNumberTwo);
	      add(button);
	      add(new JScrollPane(textShow));
	   }
}

class ComputerListener implements ActionListener {
	   JTextField inputNumberOne,inputNumberTwo; 
	   JTextArea textShow;
	   String fuhao;
	   public void setJTextFieldOne(JTextField t) {
	       inputNumberOne = t;
	   }
	   public void setJTextFieldTwo(JTextField t) {
	       inputNumberTwo = t;
	   }
	   public void setJTextArea(JTextArea area) {
	       textShow = area;
	   }
	   public void setFuhao(String s) {
	       fuhao = s;
	   }
	   public void actionPerformed(ActionEvent e) {
	      try {
	            double number1 = Double.parseDouble(inputNumberOne.getText());
	            double number2 = Double.parseDouble(inputNumberTwo.getText());
	            double result = 0;
	            if(fuhao.equals("+")) {
	                result = number1+number2;
	            }
	            else if(fuhao.equals("-")) {
	                result = number1-number2;
	            }
	            else if(fuhao.equals("*")) {
	                result = number1*number2;
	            }
	            else if(fuhao.equals("/")) {
	                result = number1/number2;
	            }
	            textShow.append(number1+" "+fuhao+" "+number2+" = "+result+"\n");
	      }
	      catch(Exception exp) {
	             textShow.append("\n�����������ַ�\n");
	      }
	  }
}

class OperatorListener implements ItemListener {
	   JComboBox<String> choice;
	   ComputerListener workTogether;
	   public void setJComboBox(JComboBox<String> box) {
	      choice = box;
	   }
	   public void setWorkTogether(ComputerListener computer) {
	      workTogether = computer;
	   }
	   public void itemStateChanged(ItemEvent e)  {
	      String fuhao = choice.getSelectedItem().toString();
	      workTogether.setFuhao(fuhao);
	   }
}



