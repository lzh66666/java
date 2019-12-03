package nuc.ss.test.section8_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo10_15WithMVC {

	public static void main(String[] args) {
	      WindowTriangle win = new WindowTriangle();
	      win.setTitle("ʹ��MVC�ṹ"); 
	      win.setBounds(100,100,420,260);
	}

}

class WindowTriangle extends JFrame implements ActionListener {
	   Triangle triangle;             //ģ��
	   JTextField textA,textB,textC;   //��ͼ
	   JTextArea showArea;         //��ͼ
	   JButton controlButton;        //������
	   WindowTriangle() {
	      init();
	      setVisible(true);
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   }
	   void init() {
	     triangle = new Triangle();
	     textA = new JTextField(5);   
	     textB = new JTextField(5);
	     textC = new JTextField(5);
	     showArea = new JTextArea();    
	     controlButton=new JButton("�������");
	     JPanel pNorth=new JPanel();
	     pNorth.add(new JLabel("��A:"));
	     pNorth.add(textA);
	     pNorth.add(new JLabel("��B:"));
	     pNorth.add(textB);
	     pNorth.add(new JLabel("��C"));
	     pNorth.add(textC); 
	     pNorth.add(controlButton); 
	     controlButton.addActionListener(this);
	     add(pNorth,BorderLayout.NORTH);
	     add(new JScrollPane(showArea),BorderLayout.CENTER);
	   }
	   public void actionPerformed(ActionEvent e) {
	     try{  
	        double a = Double.parseDouble(textA.getText().trim());   
	        double b = Double.parseDouble(textB.getText().trim());      
	        double c = Double.parseDouble(textC.getText().trim()); 
	        triangle.setA(a) ;          //��������
	        triangle.setB(b);
	        triangle.setC(c);
	        String area = triangle.getArea();     
	        showArea.append("������"+a+","+b+","+c+"�����:"); 
	        showArea.append(area+"\n");  //������ͼ
	     } 
	     catch(Exception ex) {
	        showArea.append("\n"+ex+"\n");
	     }
	   }
}

class Triangle {
	   double sideA,sideB,sideC,area;
	   boolean isTriange;
	   public String getArea() {
	     if(isTriange) {
	        double p = (sideA+sideB+sideC)/2.0;
	        area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)) ;
	        return String.valueOf(area);
	     }
	     else { 
	        return "�޷��������";
	     }
	   } 
	   public void setA(double a) {
	     sideA = a;
	     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
	       isTriange = true;
	     else 
	       isTriange = false;
	   }
	   public void setB(double b) {
	     sideB = b;
	     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
	       isTriange = true;
	     else 
	       isTriange = false;
	   }
	   public void setC(double c) {
	     sideC = c;
	     if(sideA+sideB>sideC&&sideA+sideC>sideB&&sideC+sideB>sideA) 
	       isTriange = true;
	     else 
	       isTriange = false;
	   }
}


