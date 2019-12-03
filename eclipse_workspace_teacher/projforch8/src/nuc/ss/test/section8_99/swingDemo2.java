package nuc.ss.test.section8_99;

import java.awt.*;
import javax.swing.*;
 
public class swingDemo2 {
    private static void addComponentsToPane(Container pane) {
        pane.setLayout(new BorderLayout()); // content pane默认是BorderLayout，因此这里可以省略
        //构造函数BorderLayout(int horizontalGap, int verticalGap)
        //pane.setLayout(new BorderLayout(10, 10));//水平间隔 竖直间隔
        //JButton button = new JButton("Button 1 (PAGE_START)");
        //pane.add(button, BorderLayout.PAGE_START);
 
        JTextField text = new JTextField();
        pane.add(text,BorderLayout.NORTH);
        JPanel panel = new JPanel();
        pane.add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(4,4,2,2));//参数依次为： 行数 列数 水平距离 竖直距离
 
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9"));
        panel.add(new JButton("-"));
 
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("+"));
 
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("/"));
 
        panel.add(new JButton("0"));
        panel.add(new JButton("."));
        panel.add(new JButton(" "));
        panel.add(new JButton("="));

/*方法二：*/
/*        String str[]= {"7","8","9","-","4","5","6","+","1","2","3","/","0","."," ","="};  
        for(int i =0;i<str.length;i++){  
            JButton str1=new JButton(str[i]);  
            p1.add(str1);  
            str1.setFont(new Font("宋体",Font.BOLD,20));  
        }*/
    }
    
    private static void createAndShowGUI() {
    	 
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        //Display the window.
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
 
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
