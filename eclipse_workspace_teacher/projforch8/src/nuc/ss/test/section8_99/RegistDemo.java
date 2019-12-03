package nuc.ss.test.section8_99;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RegistDemo extends JFrame{
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField1;
	private JPasswordField passwordField2; 
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					RegistDemo frame = new RegistDemo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegistDemo() {
		setTitle("�û�ע��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100,  100,  330,  350);
		this.setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 1, 5, 5));
		
		JPanel panel1 = new JPanel();
		contentPane.add(panel1);
		JLabel label1 = new JLabel("���û�ע��");
		panel1.add(label1);
		
		JPanel panel2 = new JPanel();
		FlowLayout flowLayout = (FlowLayout)panel2.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel2);
		JLabel label2 = new JLabel("��   ��   ��:");
		panel2.add(label2);
		textField = new JTextField();
		panel2.add(textField);
		textField.setColumns(18);
		
		JPanel panel3 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout)panel3.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel3);
		JLabel label3 = new JLabel("��          ��:");
		panel3.add(label3);
		passwordField1 = new JPasswordField();
		panel3.add(passwordField1);
		passwordField1.setColumns(18);
		
		JPanel panel4 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout)panel3.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel4);
		JLabel label4 = new JLabel("ȷ���� ��:");
		panel3.add(label4);
		passwordField2 = new JPasswordField();
		panel3.add(passwordField2);
		passwordField2.setColumns(18);
		
		JPanel panel5 = new JPanel();
		contentPane.add(panel5);
		
		JButton button = new JButton("�ύ");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				do_button_actionPerformed(e);
			}
		});
		panel5.add(button);
	}

	protected void do_button_actionPerformed(ActionEvent e) {
		char[] password1 = passwordField1.getPassword();
		char[] password2 = passwordField2.getPassword();
		boolean equals = Arrays.equals(password1, password2);
		if (equals) {
			JOptionPane.showMessageDialog(this, "�û�ע��ɹ���", null, JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "�������벻ͬ��", null, JOptionPane.WARNING_MESSAGE);
		}
		Arrays.fill(password1, '0');
		Arrays.fill(password2, '0');
	}
	
}
