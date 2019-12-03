package nuc.ss.test.section8_8;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestDemo10_15WithMVC {

	public static void main(String[] args) {
	      WindowTriangle win = new WindowTriangle();
	      win.setTitle("使用MVC结构"); 
	      win.setBounds(100,100,420,260);
	}

}

class WindowTriangle extends JFrame implements ActionListener {
	   Triangle triangle;             //模型
	   JTextField textA,textB,textC;   //视图
	   JTextArea showArea;         //视图
	   JButton controlButton;        //控制器
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
	     controlButton=new JButton("计算面积");
	     JPanel pNorth=new JPanel();
	     pNorth.add(new JLabel("边A:"));
	     pNorth.add(textA);
	     pNorth.add(new JLabel("边B:"));
	     pNorth.add(textB);
	     pNorth.add(new JLabel("边C"));
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
	        triangle.setA(a) ;          //更新数据
	        triangle.setB(b);
	        triangle.setC(c);
	        String area = triangle.getArea();     
	        showArea.append("三角形"+a+","+b+","+c+"的面积:"); 
	        showArea.append(area+"\n");  //更新视图
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
	        return "无法计算面积";
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


