package nuc.ss.test.section8_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class RegFrame extends JFrame {
    private JTextField name;
    private JTextField psw;
 
    public RegFrame() {
         
        JPanel panel = new JPanel();
        getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(new GridLayout(6, 1, 5, 2));
 
        JPanel panel_1 = new JPanel();
        panel.add(panel_1);
 
        JLabel lblNewLabel = new JLabel("�û���");
        panel_1.add(lblNewLabel);
 
        name = new JTextField();
        panel_1.add(name);
        name.setColumns(10);
 
        JPanel panel_2 = new JPanel();
        panel.add(panel_2);
 
        JLabel label = new JLabel("��    ��");
        panel_2.add(label);
 
        psw = new JTextField();
        panel_2.add(psw);
        psw.setColumns(10);
 
        JPanel panel_3 = new JPanel();
        panel.add(panel_3);
 
        final JRadioButton rb1 = new JRadioButton("��");
        panel_3.add(rb1);
 
        JRadioButton rb2 = new JRadioButton("Ů");
        panel_3.add(rb2);
 
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        rb1.setSelected(true);
        bg.add(rb2);
        JPanel panel_4 = new JPanel();
        panel.add(panel_4);
        JLabel ageLabel = new JLabel("�������");
        panel_4.add(ageLabel);
        String[] nians = { "1989", "1990", "1991", "1992" };
        final JComboBox comboBox = new JComboBox(nians);
        panel_4.add(comboBox);
 
        JPanel panel_5 = new JPanel();
        panel.add(panel_5);
 
        final JCheckBox cb1 = new JCheckBox("����");
        panel_5.add(cb1);
 
        final JCheckBox cb2 = new JCheckBox("����");
        panel_5.add(cb2);
 
        final JCheckBox cb3 = new JCheckBox("��Ӿ");
        panel_5.add(cb3);
 
        JPanel panel_6 = new JPanel();
        panel.add(panel_6);
 
        JButton jbreg = new JButton("ע��");
        panel_6.add(jbreg);
 
        JButton jbrest = new JButton("ȡ��");
        panel_6.add(jbrest);
 
        JPanel panel_7 = new JPanel();
        getContentPane().add(panel_7, BorderLayout.SOUTH);
 
        JLabel reginfo = new JLabel(" ");
        panel_7.add(reginfo);
 
        setSize(380,300);//���ڴ�С
        setLocationRelativeTo(null);//����
        setDefaultCloseOperation(EXIT_ON_CLOSE);//�˳�
        setTitle("ע�ᴰ��");//����
         
        jbreg.addActionListener(new ActionListener() {//ע�ᰴť���¼�
 
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                String id = name.getText();
                sb.append("�û���:" + id);
                String pas = psw.getText();
                sb.append(" ����:" + pas);
                if (rb1.isSelected()) {
                    sb.append(" �Ա�:" + "��");
                } else {
                    sb.append(" �Ա�:" + "Ů");
                }
                sb.append(" �������:" + comboBox.getSelectedItem().toString());
                sb.append(" ����:");
                if (cb1.isSelected()) {
                    sb.append(cb1.getText());
                }
                if (cb2.isSelected()) {
                    sb.append(cb2.getText());
                }
                if (cb3.isSelected()) {
                    sb.append(cb3.getText());
                }
                reginfo.setText(sb.toString());
            }
        });
        jbrest.addActionListener(new ActionListener() {//���ð�ť���¼�
 
            @Override
            public void actionPerformed(ActionEvent e) {
                name.setText("");
                psw.setText("");
                rb1.setSelected(true);
                comboBox.setSelectedIndex(0);
                cb1.setSelected(false);
                cb2.setSelected(false);
                cb3.setSelected(false);
                reginfo.setText(" ");
            }
        });
    }
 
    public static void main(String[] args) {
        new RegFrame().setVisible(true);
    }
}
