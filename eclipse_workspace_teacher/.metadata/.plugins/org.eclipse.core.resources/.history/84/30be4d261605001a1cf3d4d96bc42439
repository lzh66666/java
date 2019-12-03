package nuc.ss.test.section8_7;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class TestDemo10_3 {
	public static void main(String args[]) {
		ComponentInWindow win = new ComponentInWindow();
	}
}


class ComponentInWindow extends JFrame {
	JLabel label1, label2_1, label2_2, label3, label4, label5, label6; 
	JTextField username;
	JPasswordField password1, password2; 
	JButton button1, button2;
	JCheckBox checkBox1,checkBox2,checkBox3,checkBox4,checkBox5;
	JRadioButton radio1,radio2;
	ButtonGroup group;
	JComboBox<String> comBox; 
	JTextArea area;
	public ComponentInWindow() {
		setTitle("常用组件");
		setBounds(300,300,210,420);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}
	private void init() {
      setLayout(new FlowLayout());
      label1 = new JLabel("用 户 名:");         //标签
      add(label1);
      username = new JTextField(10);            //文本框
      add(username);
      label2_1 = new JLabel("密        码:");         //标签
      add(label2_1);
      password1 = new JPasswordField(10);     //密码框
      add(password1);
      label2_2 = new JLabel("确认密码:");         //标签
      add(label2_2);
      password2 = new JPasswordField(10);     //密码框
      add(password2);

      label3 = new JLabel("性          别:");         //标签
      add(label3);
      group = new ButtonGroup(); 
      radio1 = new JRadioButton("男");      //单选按钮
      radio2 = new JRadioButton("女");
      radio1.setSelected(true);
      group.add(radio1); 
      group.add(radio2); 
      add(radio1);
      add(radio2);
      
      label4 = new JLabel("爱        好:");         //标签
      add(label4);
      checkBox1 = new JCheckBox("音乐");  //选择框
      checkBox2 = new JCheckBox("旅游");
      checkBox3 = new JCheckBox("篮球");  
      checkBox4 = new JCheckBox("读书");
      checkBox5 = new JCheckBox("演讲"); 
      add(checkBox1);
      add(checkBox2);
      add(checkBox3);
      add(checkBox4);
      add(checkBox5);
      
      label5 = new JLabel("专业方向:");      //标签
      add(label5);
      comBox = new JComboBox<String>();     //下拉列表
      comBox.addItem("软件开发与测试"); 
      comBox.addItem("信息安全");
      comBox.addItem("人工智能"); 
      comBox.addItem("移动互联网软件");
      comBox.addItem("大数据分析");
      comBox.addItem("智慧城市");
      add(comBox);
      
      label6 = new JLabel("个人描述:");      //标签
      add(label6);
      area = new JTextArea(6,10);          //文本区
      add(new JScrollPane(area));
      
      button1 = new JButton("注册");           //按钮
      add(button1);
      button2 = new JButton("重置");           //按钮
      add(button2);
      
      JLabel reginfo = new JLabel(" ");
      add(reginfo);
      
      button1.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  StringBuilder sb = new StringBuilder();
    		  String name = username.getText();
    		  sb.append("用户名:" + name);
    		  String pwd1 = new String(password1.getPassword());
    		  String pwd2 = new String(password2.getPassword());
    		  sb.append(" 密码1:" + pwd1);
    		  sb.append(" 密码2:" + pwd2);
    		  if (radio1.isSelected()) {
    			  sb.append(" 性别:" + "男");
    		  } else {
    			  sb.append(" 性别:" + "女");
    		  }
    		  sb.append(" 爱好:");
    		  if (checkBox1.isSelected()) {
    			  sb.append(checkBox1.getText());
    		  }
    		  if (checkBox2.isSelected()) {
    			  sb.append(checkBox2.getText());
    		  }
    		  if (checkBox3.isSelected()) {
    			  sb.append(checkBox3.getText());
    		  }
    		  if (checkBox4.isSelected()) {
    			  sb.append(checkBox4.getText());
    		  }
    		  if (checkBox5.isSelected()) {
    			  sb.append(checkBox5.getText());
    		  }
    		  
    		  sb.append(" 专业方向:" + comBox.getSelectedItem().toString());

    		  sb.append(" 个人描述：" + area.getText());
    		  
    		  reginfo.setText(sb.toString());
    	  }
      });
      
      button2.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			username.setText("");
			password1.setText("");
			password2.setText("");
			radio1.setSelected(true);
			radio2.setSelected(false);
			checkBox1.setSelected(false);
			checkBox2.setSelected(false);
			checkBox3.setSelected(false);
			checkBox4.setSelected(false);
			checkBox5.setSelected(false);
			comBox.setSelectedItem(0);
			area.setText("");
			reginfo.setText("");
			username.requestFocus();
		}
      });
   }
}

