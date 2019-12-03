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
		setTitle("�������");
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
		label1 = new JLabel("�û���:");
		boxV1.add(label1);      			//��ǩ
		boxV1.add(Box.createVerticalStrut(6));
		label2 = new JLabel("����:");   		//��ǩ
		boxV1.add(label2);
		boxV1.add(Box.createVerticalStrut(6));
        label3 = new JLabel("ȷ������:"); 	//��ǩ
		boxV1.add(label3);
		boxV1.add(Box.createVerticalStrut(6));
		label4 = new JLabel("�Ա�:"); 		//��ǩ
		boxV1.add(label4);
		boxV1.add(Box.createVerticalStrut(6));
		label5 = new JLabel("�� ��:");   	//��ǩ
		boxV1.add(label5);
		boxV1.add(Box.createVerticalStrut(6));
		label6 = new JLabel("רҵ����:"); 	//��ǩ
		boxV1.add(label6);
		boxV1.add(Box.createVerticalStrut(6));
		label7 = new JLabel("��������:"); 	//��ǩ
		boxV1.add(label7);
		boxV1.add(Box.createVerticalStrut(12));
		
		boxV2 = Box.createVerticalBox();
		boxV2.setAlignmentX(TOP_ALIGNMENT);
		username = new JTextField(10);     		//�ı���
		boxV2.add(username);
		boxV2.add(Box.createVerticalStrut(8));
		password1 = new JPasswordField(10);     //�����
		boxV2.add(password1);
		boxV2.add(Box.createVerticalStrut(8));
		password2 = new JPasswordField(10);     //�����
		boxV2.add(password2);
		boxV2.add(Box.createVerticalStrut(8));
        group = new ButtonGroup(); 
        radio1 = new JRadioButton("��");      //��ѡ��ť
        radio2 = new JRadioButton("Ů");
        group.add(radio1); 
        group.add(radio2); 
        boxHforRadio = Box.createHorizontalBox();
        boxHforRadio.add(radio1);
        boxHforRadio.add(Box.createHorizontalStrut(5));
        boxHforRadio.add(radio2);
		boxV2.add(boxHforRadio);
		boxV2.add(Box.createVerticalStrut(8));
        checkBox1 = new JCheckBox("����");  //ѡ���
        checkBox2 = new JCheckBox("����");
        checkBox3 = new JCheckBox("����");  
        checkBox4 = new JCheckBox("����");
        checkBox5 = new JCheckBox("�ݽ�"); 
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
        comBox = new JComboBox<String>();     //�����б�
      	comBox.addItem("������������"); 
      	comBox.addItem("��Ϣ��ȫ");
      	comBox.addItem("�˹�����"); 
      	comBox.addItem("�ƶ����������");
      	comBox.addItem("�����ݷ���");
      	comBox.addItem("�ǻ۳���");
      	boxV2.add(comBox);
      	area = new JTextArea(6, 10);          //�ı���
      	boxV2.add(new JScrollPane(area));
		
		boxH1 = Box.createHorizontalBox();
		boxH1.add(boxV1);
		boxH1.add(Box.createHorizontalStrut(5));
		boxH1.add(boxV2);
		
		boxH2 = Box.createHorizontalBox();
      	button1 = new JButton("�ύ");           //��ť
      	button2 = new JButton("����");           //��ť
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

