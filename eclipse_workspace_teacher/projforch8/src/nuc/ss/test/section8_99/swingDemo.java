package nuc.ss.test.section8_99;

import java.awt.*;
import javax.swing.*;
 
public class swingDemo {
    private static void addComponentsToPane(Container pane) {
        pane.setLayout(new BorderLayout()); // content pane默认是BorderLayout，因此这里可以省略
 
        JTextField text = new JTextField();
        pane.add(text, BorderLayout.NORTH);
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
        panel.add(new JButton("*"));
        panel.add(new JButton("="));

/*方法二：*/
/*        String str[]= {"7","8","9","-","4","5","6","+","1","2","3","/","0",".","*","="};  
        for(int i =0; i<str.length; i++){  
            JButton str1 = new JButton(str[i]);  
            panel.add(str1);  
            str1.setFont(new Font("宋体", Font.BOLD, 20));  
        }*/
    }
 
    public static void main(String[] args) {
        //Create and set up the window.
        JFrame frame = new JFrame("BorderLayout演示");
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
        frame.pack();
        //Display the window.
        frame.setVisible(true);
    }
}
