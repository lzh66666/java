package nuc.ss.test.section8_5;
import java.awt.*;
import javax.swing.*;

public class TestUserReg {
	public static void main(String args[]) {
		new ComponentInWindow();
		
	}
}

class ComponentInWindow extends JFrame {
	JLabel label1, label2_1, label2_2, label3, label4, label5, label6; 
	JTextField text;
	JPasswordField password1, password2; 
	JButton button1, button2;
	JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
	JRadioButton radio1, radio2;
	ButtonGroup group;
	JComboBox<String> comBox; 
	JTextArea area;
	
	public ComponentInWindow() {
		setTitle("�������"); // super("�������");
		//setLocation(300, 300);
		//setSize(210, 420);
		setBounds(300, 300, 210, 420);
		setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();//�߽粼�ַ�ʽ BorderLayout
		
		setVisible(true);
	}
	private void init() {
      setLayout(new FlowLayout()); // ��ʽ���ֹ�����
      label1 = new JLabel("�� �� ��:");         //��ǩ
      add(label1);
      text = new JTextField(10);              //�ı���
      add(text);
      label2_1 = new JLabel("��        ��:");     //��ǩ
      add(label2_1);
      password1 = new JPasswordField(10);     //�����
      add(password1);
      label2_2 = new JLabel("ȷ������:");      //��ǩ
      add(label2_2);
      password2 = new JPasswordField(10);     //�����
      add(password2);

      label3 = new JLabel("��          ��:");         //��ǩ
      add(label3);
      radio1 = new JRadioButton("��");           //��ѡ��ť
      radio2 = new JRadioButton("Ů");
      radio1.setSelected(true);
      group = new ButtonGroup(); 
      group.add(radio1); 
      group.add(radio2); 
      add(radio1);
      add(radio2);
      
      label4 = new JLabel("��        ��:");        //��ǩ
      add(label4);
      checkBox1 = new JCheckBox("����");       //��ѡ��
      checkBox2 = new JCheckBox("����");
      checkBox3 = new JCheckBox("����");  
      checkBox4 = new JCheckBox("����");
      checkBox5 = new JCheckBox("�ݽ�"); 
      add(checkBox1);
      add(checkBox2);
      add(checkBox3);
      add(checkBox4);
      add(checkBox5);

      label5 = new JLabel("רҵ����:");          //��ǩ
      add(label5);
      comBox = new JComboBox<String>();         //�����б� 
      comBox.addItem("������������"); 
      comBox.addItem("��Ϣ��ȫ");
      comBox.addItem("�˹�����"); 
      comBox.addItem("�ƶ����������");
      comBox.addItem("�����ݷ���");
      comBox.addItem("�ǻ۳���");
      add(comBox);
      
      label6 = new JLabel("��������:");          //��ǩ
      add(label6);
      area = new JTextArea(6,10);               //�ı���
      add(new JScrollPane(area));
      
      button1 = new JButton("�ύ");             //��ť
      add(button1);
      button2 = new JButton("����");             //��ť
      add(button2);

   }
}

