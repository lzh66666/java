package nuc.ss.test.section8_5;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.List;

import javax.swing.JFrame;

public class TestOtherComponents {
	public static void main(String args[]) {
		OtherComponentsInWindow win = new OtherComponentsInWindow();
	}
}


class OtherComponentsInWindow extends JFrame {
	public OtherComponentsInWindow() {
		setTitle("ListDemo");
		setBounds(300,300,210,420);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}     
    private void init() {
    	setLayout(new FlowLayout());
    	List list = new List(4, true); // 第二个参数为true表示允许多选。
    	list.add("Mercury");
    	list.add("Venus");
    	list.add("Earth");
    	list.add("JavaSoft");
    	list.add("Mars");
    	list.add("Jupiter");
    	list.add("Saturn");
    	list.add("Uranus");
    	list.add("Neptune");
    	list.add("Pluto");
        add(list);
        
        Choice ColorChooser = new Choice();
        ColorChooser.add("Green");
        ColorChooser.add("Red");
        ColorChooser.add("Blue");
        add(ColorChooser);
	}
}
