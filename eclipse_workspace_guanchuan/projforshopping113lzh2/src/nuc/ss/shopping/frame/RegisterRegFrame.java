package nuc.ss.shopping.frame;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import nuc.ss.shopping.dao.IUserDao;
import nuc.ss.shopping.dao.UserDaoImpl;
import nuc.ss.shopping.entiy.User;
import nuc.ss.shopping.service.IUserService;
import nuc.ss.shopping.service.UserServiceImpl;

public class RegisterRegFrame extends JFrame{
	private static final long serialVersionUID = 1L;
	IUserService uService = new UserServiceImpl();
	IUserDao uDao = new UserDaoImpl();
	private RegisterRegFrame registerRegFrame;
	
	private User user;
	
	private JLabel lblUserID, lblName, lblSex, lblCity,lblpwd,lblType;
	private JTextField txtName,txtUserID;
	private JPasswordField passwordField;
	private JRadioButton rdoMale, rdoFemale;
	private JComboBox<String> cboType,cboCity;
	private JButton btnConfirm, btnBack;
	
	public RegisterRegFrame getUserForm() {
		return registerRegFrame;
	}
	
	public RegisterRegFrame() {
		setTitle("电商购物平台--注册页面");
		setBounds(100, 100, 298, 450);
		setResizable(false);
		getContentPane().setLayout(null);
		registerRegFrame = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setCenter(this);
		
		this.setVisible(true);
	}
	


	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		lblUserID = new JLabel("登录账号：");
		lblUserID.setBounds(20, 42, 74, 15);
		add(lblUserID);
		
		txtUserID = new JTextField(10);
		txtUserID.setBounds(104, 42, 148, 25);
		add(txtUserID);	
		
		lblType = new JLabel("用户类型：");
		lblType.setBounds(20, 99, 74, 15);
		add(lblType);
		cboType = new JComboBox<String>();
		cboType.setModel(new DefaultComboBoxModel<String>(new String[] {
			                   	"普通用户","管理员" }));
		cboType.setBounds(104, 99, 122, 25);
		add(cboType);
		
		lblpwd = new JLabel("密码");
		lblpwd.setBounds(20, 156, 74, 15);
		add(lblpwd);
		
		lblName = new JLabel("真实姓名：");
		lblName.setBounds(20, 213, 74, 15);
		add(lblName);

		lblSex = new JLabel("用户性别：");
		lblSex.setBounds(20, 273, 74, 15);
		add(lblSex);
		
		lblCity = new JLabel("所在地：");
		lblCity.setBounds(20, 333, 74, 15);
		add(lblCity);
		
		passwordField = new JPasswordField(10);
		passwordField.setBounds(104,156,148,25);
		add(passwordField);
		
		txtName = new JTextField(10);
		txtName.setBounds(104, 213, 148, 25);
		add(txtName);
		
		rdoMale = new JRadioButton("男");
		rdoMale.setSelected(true);
		rdoMale.setBounds(104, 273, 50, 25);
		add(rdoMale);

		rdoFemale = new JRadioButton("女");
		rdoFemale.setBounds(173, 273, 50, 25);
		add(rdoFemale);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdoMale);
		group.add(rdoFemale);
		
		cboCity = new JComboBox<String>();
		cboCity.setModel(new DefaultComboBoxModel<String>(new String[] {
			                   	"北京", "上海", "广州", "太原", "西安", "武汉" }));
		cboCity.setBounds(104, 328, 122, 25);
		add(cboCity);
		
		btnConfirm = new JButton("确认");
		btnConfirm.setBounds(33, 380, 93, 35);
		add(btnConfirm);
		
		btnBack = new JButton("返回");
		btnBack.setBounds(161, 380, 93, 35);
		add(btnBack);
		
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = txtUserID.getText();
				String pwd = new String(passwordField.getPassword());
				String type = (String)cboType.getSelectedItem();
				String name = txtName.getText();
				String city = (String)cboCity.getSelectedItem();
				String sex;
				if(rdoMale.isSelected()) {
					sex = "1";
				}else {
					sex = "0";
				}
				
				if(id.equals("")|| passwordField.equals("")||name.equals("")){
					JOptionPane.showMessageDialog(null, "信息不全！", "消息",
							JOptionPane.WARNING_MESSAGE);
				} else {
					User u = new User(id, type, pwd, name, sex, city);
					String message = uService.register(u);
					JOptionPane.showMessageDialog(null, message, "消息",
							JOptionPane.WARNING_MESSAGE);
				}
				uDao.addUser(user);
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				LoginRegFrame loginForm = new LoginRegFrame();
				loginForm.getLoginRegFrame().setVisible(true);
				registerRegFrame.dispose();
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
	
	public static void main(String[] args) {
		new RegisterRegFrame();
	}
}