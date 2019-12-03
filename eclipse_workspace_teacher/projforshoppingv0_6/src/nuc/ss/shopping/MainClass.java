package nuc.ss.shopping;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.service.UserDao;
import nuc.ss.shopping.service.UserDaoImpl;

public class MainClass {

	public static void main(String[] args) {
		new LoginForm();

	}
}

class LoginForm extends JFrame {
	private static final long serialVersionUID = 1L;

	private LoginForm loginForm;

	private JLabel 	lblUserID, lblPassword;
	private JTextField txtUserID;
	private JPasswordField txtPassword;
	private JCheckBox ckbRemember;
	private JButton btnLogin, btnReset;
	
	public LoginForm getLoginForm() {
		return loginForm;
	}
	
	public LoginForm() {
		setTitle("���̹���ƽ̨--�û���¼ҳ��");
		setBounds(100, 100, 389, 300);
		setResizable(false);
		getContentPane().setLayout(null);
		
		loginForm = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setCenter(this);
		
		this.setVisible(true);
		
	}

	private void init() {
		lblUserID = new JLabel("��¼�ʺţ�");
		lblUserID.setBounds(41, 72, 82, 15);
		add(lblUserID);
		
		txtUserID = new JTextField(10);
		txtUserID.setBounds(118, 64, 207, 30);
		add(txtUserID);
		
		lblPassword = new JLabel("��¼���룺");
		lblPassword.setBounds(41, 116, 82, 15);
		add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(118, 108, 207, 30);		
		add(txtPassword);
		
		ckbRemember = new JCheckBox("��ס��¼�˺�");
		ckbRemember.setSelected(true);
		ckbRemember.setBounds(117, 151, 103, 23);
		add(ckbRemember);
		
		btnLogin = new JButton("��¼");
		btnLogin.setBounds(63, 206, 93, 30);
		add(btnLogin);
		
		btnReset = new JButton("����");
		btnReset.setBounds(221, 206, 93, 30);
		add(btnReset);	
	
		// �ı�������û� - �¼��������
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �û����س���������ť����һ�¡�
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
				}
			}
		});
		
		// ���ð�ť��� - �¼��������
		System.out.println("�û���Ϣ�������������Ʒ��ѯ���档����");
		// bejin���˴���ͬѧ�ǲ�����룬������ð�ť���¼�����
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtPassword.setText("");
			}
		});
		// end

		// ��¼��ť��� - �¼��������
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String uid = txtUserID.getText(); 
				String pwd = new String(txtPassword.getPassword());
				
				UserDao userDao = new UserDaoImpl();
				User user = userDao.login(uid, pwd);
				
				if (user == null) { // �û���Ų�����
					JOptionPane.showMessageDialog(null, "��¼�˺Ż����벻��ȷ", "������Ϣ",
							JOptionPane.WARNING_MESSAGE);
					// �����û����飬�ı����ý���
					txtUserID.requestFocus();
					// �����û����飬ѡ���ı����е�����
					txtUserID.selectAll();
					return;
				}
				
				// ��ȡ��¼�õ����ڵ�
				String city = user.getCity();
				
				if (city == null || "".equals(city)) {
					// û���������ڳ��У�������û���Ϣ�༭����
					System.out.println("û���������ڳ��У�������û���Ϣ�༭����...");
					UserForm userForm = new UserForm(user);
					userForm.getUserForm().setVisible(true);
					
				} else {
					// �û���Ϣ�������������Ʒ��ѯ����
					System.out.println("�û���Ϣ�������������Ʒ��ѯ���档����");
					// bejin���˴���ͬѧ�ǲ�����룩
					new BookListForm(user);
					// end
					
				}
				
				loginForm.dispose();
			}					
		});
	}
	
	/**
	 * �����Զ����� 
	 * 
	 * @param window
	 */
	private void setCenter(JFrame window) {
		// ��ȡ��Ļ�Ĵ�С
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int width = window.getWidth();
		int height = window.getHeight();
		// ������ʾ
		window.setBounds((d.width - width) / 2, 
				         (d.height - height) / 2, 
				          width,
				          height);
	}
}


