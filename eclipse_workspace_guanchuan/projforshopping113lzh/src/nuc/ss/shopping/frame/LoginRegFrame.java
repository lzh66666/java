package nuc.ss.shopping.frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nuc.ss.shopping.dao.IUserDao;
import nuc.ss.shopping.dao.UserDaoImpl;
import nuc.ss.shopping.entiy.User;
import nuc.ss.shopping.service.IUserService;
import nuc.ss.shopping.service.UserServiceImpl;


public class LoginRegFrame extends JFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	IUserService uService = new UserServiceImpl();
	LoginRegFrame loginRegFrame;
	IUserDao ud = new UserDaoImpl();
	
	JLabel lb1,lb2,lb3;
	JTextField text;
	JPasswordField password;
	JComboBox<String> cb;
	JButton button1,button2,button3;
	JPanel panel1,panel2;
	
	public LoginRegFrame getLoginRegFrame() {
		return loginRegFrame;
	}
	public LoginRegFrame() {
		loginRegFrame = this;
		setTitle("注册登录窗体");
		setBounds(200,200,300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		init();
		
		setVisible(true);
	}

	private void init() {
		setLayout(new BorderLayout(20,30));
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(3,2,0,20));
		lb1 = new JLabel("用户名",JLabel.CENTER);
		lb2 = new JLabel("用户类型",JLabel.CENTER);
		lb3 = new JLabel("用户密码",JLabel.CENTER);
		text = new JTextField();
		password = new JPasswordField();
		cb = new JComboBox<String>();
		cb.addItem("普通用户");
		cb.addItem("管理员");
		
		panel1.add(lb1);
		panel1.add(text);
		panel1.add(lb2);
		panel1.add(cb);
		panel1.add(lb3);
		panel1.add(password);
		
		add(panel1,BorderLayout.CENTER);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		button1 = new JButton("登录");
		button2 = new JButton("重置");
		button3 = new JButton("点我注册");
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		add(panel2,BorderLayout.SOUTH);
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			String id = text.getText(); 
			String pwd = new String(password.getPassword());
			String type = (String)cb.getSelectedItem();
			
			User u1 = new User(id, type, pwd);
			User u = null;
			Map<String, User> user = ud.getUsers();
			Iterator<Entry<String, User>> iter = user.entrySet().iterator();
			while(iter.hasNext()) {
				Map.Entry<String, User> entry = iter.next();
				if(entry.getKey().equals(id)) {
					u = entry.getValue();
				}
			}
			 
			
			if(uService.login(u1)){
				if("管理员".equals(u1.getType())) {
					new AdminMainFrame(u);
				}
				else {
					new UserMainFrame(u);
				}
				loginRegFrame.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "登录账号或密码不正确", "消息",
						JOptionPane.WARNING_MESSAGE);
				text.setText("");
				password.setText("");
				text.requestFocus();
				text.selectAll();
			}
		}else if(e.getSource() == button2) {
			text.setText("");
			password.setText("");
			text.requestFocus();
		}
		else {
			new RegisterRegFrame();
			loginRegFrame.dispose();
		}
	}
	
	public static void main(String[] args) {
		new LoginRegFrame();
	}
}