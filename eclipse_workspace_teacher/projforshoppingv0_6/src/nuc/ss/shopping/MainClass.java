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
		setTitle("电商购物平台--用户登录页面");
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
		lblUserID = new JLabel("登录帐号：");
		lblUserID.setBounds(41, 72, 82, 15);
		add(lblUserID);
		
		txtUserID = new JTextField(10);
		txtUserID.setBounds(118, 64, 207, 30);
		add(txtUserID);
		
		lblPassword = new JLabel("登录密码：");
		lblPassword.setBounds(41, 116, 82, 15);
		add(lblPassword);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(118, 108, 207, 30);		
		add(txtPassword);
		
		ckbRemember = new JCheckBox("记住登录账号");
		ckbRemember.setSelected(true);
		ckbRemember.setBounds(117, 151, 103, 23);
		add(ckbRemember);
		
		btnLogin = new JButton("登录");
		btnLogin.setBounds(63, 206, 93, 30);
		add(btnLogin);
		
		btnReset = new JButton("重置");
		btnReset.setBounds(221, 206, 93, 30);
		add(btnReset);	
	
		// 文本框键盘敲击 - 事件处理程序
		txtPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// 用户按回车键与点击按钮功能一致。
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					btnLogin.doClick();
				}
			}
		});
		
		// 重置按钮点击 - 事件处理程序
		System.out.println("用户信息完整，则进入商品查询界面。。。");
		// bejin（此处请同学们补充代码，完成重置按钮的事件处理）
		btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				txtUserID.setText("");
				txtPassword.setText("");
			}
		});
		// end

		// 登录按钮点击 - 事件处理程序
		btnLogin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String uid = txtUserID.getText(); 
				String pwd = new String(txtPassword.getPassword());
				
				UserDao userDao = new UserDaoImpl();
				User user = userDao.login(uid, pwd);
				
				if (user == null) { // 用户编号不存在
					JOptionPane.showMessageDialog(null, "登录账号或密码不正确", "警告信息",
							JOptionPane.WARNING_MESSAGE);
					// 增加用户体验，文本框获得焦点
					txtUserID.requestFocus();
					// 增加用户体验，选中文本框中的文字
					txtUserID.selectAll();
					return;
				}
				
				// 获取登录用的所在地
				String city = user.getCity();
				
				if (city == null || "".equals(city)) {
					// 没有设置所在城市，则进入用户信息编辑界面
					System.out.println("没有设置所在城市，则进入用户信息编辑界面...");
					UserForm userForm = new UserForm(user);
					userForm.getUserForm().setVisible(true);
					
				} else {
					// 用户信息完整，则进入商品查询界面
					System.out.println("用户信息完整，则进入商品查询界面。。。");
					// bejin（此处请同学们补充代码）
					new BookListForm(user);
					// end
					
				}
				
				loginForm.dispose();
			}					
		});
	}
	
	/**
	 * 窗体自动居中 
	 * 
	 * @param window
	 */
	private void setCenter(JFrame window) {
		// 获取屏幕的大小
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		int width = window.getWidth();
		int height = window.getHeight();
		// 居中显示
		window.setBounds((d.width - width) / 2, 
				         (d.height - height) / 2, 
				          width,
				          height);
	}
}


