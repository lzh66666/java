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
 
        JLabel lblNewLabel = new JLabel("用户名");
        panel_1.add(lblNewLabel);
 
        name = new JTextField();
        panel_1.add(name);
        name.setColumns(10);
 
        JPanel panel_2 = new JPanel();
        panel.add(panel_2);
 
        JLabel label = new JLabel("密    码");
        panel_2.add(label);
 
        psw = new JTextField();
        panel_2.add(psw);
        psw.setColumns(10);
 
        JPanel panel_3 = new JPanel();
        panel.add(panel_3);
 
        final JRadioButton rb1 = new JRadioButton("男");
        panel_3.add(rb1);
 
        JRadioButton rb2 = new JRadioButton("女");
        panel_3.add(rb2);
 
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        rb1.setSelected(true);
        bg.add(rb2);
        JPanel panel_4 = new JPanel();
        panel.add(panel_4);
        JLabel ageLabel = new JLabel("出生年份");
        panel_4.add(ageLabel);
        String[] nians = { "1989", "1990", "1991", "1992" };
        final JComboBox comboBox = new JComboBox(nians);
        panel_4.add(comboBox);
 
        JPanel panel_5 = new JPanel();
        panel.add(panel_5);
 
        final JCheckBox cb1 = new JCheckBox("蓝球");
        panel_5.add(cb1);
 
        final JCheckBox cb2 = new JCheckBox("足球");
        panel_5.add(cb2);
 
        final JCheckBox cb3 = new JCheckBox("游泳");
        panel_5.add(cb3);
 
        JPanel panel_6 = new JPanel();
        panel.add(panel_6);
 
        JButton jbreg = new JButton("注册");
        panel_6.add(jbreg);
 
        JButton jbrest = new JButton("取消");
        panel_6.add(jbrest);
 
        JPanel panel_7 = new JPanel();
        getContentPane().add(panel_7, BorderLayout.SOUTH);
 
        JLabel reginfo = new JLabel(" ");
        panel_7.add(reginfo);
 
        setSize(380,300);//窗口大小
        setLocationRelativeTo(null);//居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);//退出
        setTitle("注册窗口");//标题
         
        jbreg.addActionListener(new ActionListener() {//注册按钮的事件
 
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                String id = name.getText();
                sb.append("用户名:" + id);
                String pas = psw.getText();
                sb.append(" 密码:" + pas);
                if (rb1.isSelected()) {
                    sb.append(" 性别:" + "男");
                } else {
                    sb.append(" 性别:" + "女");
                }
                sb.append(" 出生年份:" + comboBox.getSelectedItem().toString());
                sb.append(" 爱好:");
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
        jbrest.addActionListener(new ActionListener() {//重置按钮的事件
 
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
