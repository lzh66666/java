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
		setTitle("�������");
		setBounds(300,300,210,420);
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}
	private void init() {
      setLayout(new FlowLayout());
      label1 = new JLabel("�� �� ��:");         //��ǩ
      add(label1);
      username = new JTextField(10);            //�ı���
      add(username);
      label2_1 = new JLabel("��        ��:");         //��ǩ
      add(label2_1);
      password1 = new JPasswordField(10);     //�����
      add(password1);
      label2_2 = new JLabel("ȷ������:");         //��ǩ
      add(label2_2);
      password2 = new JPasswordField(10);     //�����
      add(password2);

      label3 = new JLabel("��          ��:");         //��ǩ
      add(label3);
      group = new ButtonGroup(); 
      radio1 = new JRadioButton("��");      //��ѡ��ť
      radio2 = new JRadioButton("Ů");
      radio1.setSelected(true);
      group.add(radio1); 
      group.add(radio2); 
      add(radio1);
      add(radio2);
      
      label4 = new JLabel("��        ��:");         //��ǩ
      add(label4);
      checkBox1 = new JCheckBox("����");  //ѡ���
      checkBox2 = new JCheckBox("����");
      checkBox3 = new JCheckBox("����");  
      checkBox4 = new JCheckBox("����");
      checkBox5 = new JCheckBox("�ݽ�"); 
      add(checkBox1);
      add(checkBox2);
      add(checkBox3);
      add(checkBox4);
      add(checkBox5);
      
      label5 = new JLabel("רҵ����:");      //��ǩ
      add(label5);
      comBox = new JComboBox<String>();     //�����б�
      comBox.addItem("������������"); 
      comBox.addItem("��Ϣ��ȫ");
      comBox.addItem("�˹�����"); 
      comBox.addItem("�ƶ����������");
      comBox.addItem("�����ݷ���");
      comBox.addItem("�ǻ۳���");
      add(comBox);
      
      label6 = new JLabel("��������:");      //��ǩ
      add(label6);
      area = new JTextArea(6,10);          //�ı���
      add(new JScrollPane(area));
      
      button1 = new JButton("ע��");           //��ť
      add(button1);
      button2 = new JButton("����");           //��ť
      add(button2);
      
      JLabel reginfo = new JLabel(" ");
      add(reginfo);
      
      button1.addActionListener(new ActionListener() {
    	  @Override
    	  public void actionPerformed(ActionEvent e) {
    		  StringBuilder sb = new StringBuilder();
    		  String name = username.getText();
    		  sb.append("�û���:" + name);
    		  String pwd1 = new String(password1.getPassword());
    		  String pwd2 = new String(password2.getPassword());
    		  sb.append(" ����1:" + pwd1);
    		  sb.append(" ����2:" + pwd2);
    		  if (radio1.isSelected()) {
    			  sb.append(" �Ա�:" + "��");
    		  } else {
    			  sb.append(" �Ա�:" + "Ů");
    		  }
    		  sb.append(" ����:");
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
    		  
    		  sb.append(" רҵ����:" + comBox.getSelectedItem().toString());

    		  sb.append(" ����������" + area.getText());
    		  
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

