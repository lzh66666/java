package nuc.ss.test6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/**
 * java书P199编程练习第6题
 * @author 卢泽华
 * @version 2019 11 15 23:20
 */
public class TestTextEditJFrame {
	public static void main(String[] args) {
		new TextEditJFrame();
	}
}

class TextEditJFrame extends JFrame implements ActionListener{
	JTextArea tArea;
	JButton btn1,btn2,btn3;
	JPanel jPanel;
	BufferedReader in = null;
	FileWriter fWriter;
	File file;
	
	public TextEditJFrame() {
		setTitle("文本编辑器");
		setBounds(200,200,400,200);
		setResizable(false);
		init();
		setVisible(true);
	}
	private void init() {
		setLayout(new FlowLayout());
		tArea = new JTextArea(6,38);	
		add(new JScrollPane(tArea));
		
		try {
			file = new File("myText.txt");
			if (!file.exists()) {
				file.createNewFile();
			} 
			in = new BufferedReader(new FileReader(file));
			String str = in.readLine();
			while (str != null) {   
                tArea.append(str + "\n");   
                str = in.readLine();   
	       } 
		} catch (IOException e) {
			e.printStackTrace();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    jPanel = new JPanel(new GridLayout(1,3,5,1));
		
		btn1 = new JButton("保存");
		btn2 = new JButton("取消");
		btn3 = new JButton("退出");
		jPanel.add(btn1);jPanel.add(btn2);jPanel.add(btn3);
		add(jPanel);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btn1) {
			try {
				fWriter = new FileWriter(file);
				fWriter.write(tArea.getText());
				fWriter.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource() == btn2) {
			tArea.setText("");
		}else{
//			System.exit(0);
			dispose();
		}
		
	}
}
