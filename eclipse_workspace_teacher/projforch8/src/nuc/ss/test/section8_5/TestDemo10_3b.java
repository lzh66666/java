package nuc.ss.test.section8_5;
import java.awt.*;
import javax.swing.*;

public class TestDemo10_3b {
	public static void main(String args[]) {
		new ComponentInWindow2().setVisible(true);
	}
}

class ComponentInWindow2 extends JFrame {
	JLabel label1, label2, label3, label4, label5, label6, label7; 
	JTextField username;
	JPasswordField password1, password2; 
	JButton button1, button2;
	JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
	JRadioButton radio1,radio2;
	ButtonGroup group;
	JComboBox<String> comBox; 
	JTextArea area;
	
	Box baseBox, boxV1, boxV2, boxH1, boxH2, boxHforRadio, boxHforCheckBox;
	
	public ComponentInWindow2() {
		setTitle("常用组件");
		setBounds(300,300,400,380);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}
	private void init() {
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        
		boxV1 = Box.createVerticalBox();
		label1 = new JLabel("用户名:");
		boxV1.add(label1);      			//标签
		boxV1.add(Box.createVerticalStrut(6));
		label2 = new JLabel("密码:");   		//标签
		boxV1.add(label2);
		boxV1.add(Box.createVerticalStrut(6));
        label3 = new JLabel("确认密码:"); 	//标签
		boxV1.add(label3);
		boxV1.add(Box.createVerticalStrut(6));
		label4 = new JLabel("性别:"); 		//标签
		boxV1.add(label4);
		boxV1.add(Box.createVerticalStrut(6));
		label5 = new JLabel("爱 好:");   	//标签
		boxV1.add(label5);
		boxV1.add(Box.createVerticalStrut(6));
		label6 = new JLabel("专业方向:"); 	//标签
		boxV1.add(label6);
		boxV1.add(Box.createVerticalStrut(6));
		label7 = new JLabel("个人描述:"); 	//标签
		boxV1.add(label7);
		boxV1.add(Box.createVerticalStrut(12));
		
		boxV2 = Box.createVerticalBox();
		boxV2.setAlignmentX(TOP_ALIGNMENT);
		username = new JTextField(10);     		//文本框
		boxV2.add(username);
		boxV2.add(Box.createVerticalStrut(8));
		password1 = new JPasswordField(10);     //密码框
		boxV2.add(password1);
		boxV2.add(Box.createVerticalStrut(8));
		password2 = new JPasswordField(10);     //密码框
		boxV2.add(password2);
		boxV2.add(Box.createVerticalStrut(8));
        group = new ButtonGroup(); 
        radio1 = new JRadioButton("男");      //单选按钮
        radio2 = new JRadioButton("女");
        group.add(radio1); 
        group.add(radio2); 
        boxHforRadio = Box.createHorizontalBox();
        boxHforRadio.add(radio1);
        boxHforRadio.add(Box.createHorizontalStrut(5));
        boxHforRadio.add(radio2);
		boxV2.add(boxHforRadio);
		boxV2.add(Box.createVerticalStrut(8));
        checkBox1 = new JCheckBox("音乐");  //选择框
        checkBox2 = new JCheckBox("旅游");
        checkBox3 = new JCheckBox("篮球");  
        checkBox4 = new JCheckBox("读书");
        checkBox5 = new JCheckBox("演讲"); 
        boxHforCheckBox = Box.createHorizontalBox();
        boxHforCheckBox.add(checkBox1);
        boxHforCheckBox.add(Box.createHorizontalStrut(5));
        boxHforCheckBox.add(checkBox2);
        boxHforCheckBox.add(Box.createHorizontalStrut(5));
        boxHforCheckBox.add(checkBox3);
        boxHforCheckBox.add(Box.createHorizontalStrut(5));
        boxHforCheckBox.add(checkBox4);
        boxHforCheckBox.add(Box.createHorizontalStrut(5));
        boxHforCheckBox.add(checkBox5);
        boxHforCheckBox.add(Box.createHorizontalStrut(5));
        boxV2.add(boxHforCheckBox);
        boxV2.add(Box.createVerticalStrut(16));
        comBox = new JComboBox<String>();     //下拉列表
      	comBox.addItem("软件开发与测试"); 
      	comBox.addItem("信息安全");
      	comBox.addItem("人工智能"); 
      	comBox.addItem("移动互联网软件");
      	comBox.addItem("大数据分析");
      	comBox.addItem("智慧城市");
      	boxV2.add(comBox);
      	area = new JTextArea(6, 10);          //文本区
      	boxV2.add(new JScrollPane(area));
		
		boxH1 = Box.createHorizontalBox();
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(5));
		boxH1.add(boxV2);
		
		boxH2 = Box.createHorizontalBox();
      	button1 = new JButton("提交");           //按钮
      	button2 = new JButton("重置");           //按钮
      	boxH2.add(button1);
      	boxH2.add(Box.createHorizontalStrut(5));
      	boxH2.add(button2);
		
		baseBox = Box.createVerticalBox();
		baseBox.add(boxH1);
		baseBox.add(Box.createHorizontalStrut(5));
		baseBox.add(boxH2); 
		
		panel.add(baseBox);
   }
}

