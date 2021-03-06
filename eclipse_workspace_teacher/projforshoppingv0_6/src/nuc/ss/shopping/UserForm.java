package nuc.ss.shopping;

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
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.service.UserDao;
import nuc.ss.shopping.service.UserDaoImpl;

public class UserForm extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private UserForm userForm;
	private User user;
	
	private JLabel lblUserID, lblName, lblSex, lblCity;
	private JLabel txtUserID;
	private JTextField txtName;
	private JRadioButton rdoMale, rdoFemale;
	private JComboBox<String> cboCity;
	private JButton btnConfirm, btnBack;
	
	public UserForm getUserForm() {
		return userForm;
	}
	
	public UserForm(User user) {
		setTitle("电商购物平台--完善用户信息页面");
		setBounds(100, 100, 298, 364);
		setResizable(false);
		getContentPane().setLayout(null);
		userForm = this;
		this.user = user;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		initDatas();
		
		setCenter(this);
		
		this.setVisible(true);
	}
	
	/**
	 * 将用户信息通过Swing控件呈现。
	 */
	private void initDatas() {
		// 显示用户登录账号
		this.txtUserID.setText(user.getId());
		// 显示用户真实姓名（可修改）
		this.txtName.setText(user.getName() == null ? "" : user.getName());
		// 显示用户性别（可修改）
		if (user.getSex().byteValue() == 1) {
			rdoMale.setSelected(true);
		} else {
			rdoFemale.setSelected(true);
		}
		// 显示用户所在地（可修改）
		if ("北京".equals(user.getCity()))
			cboCity.setSelectedIndex(1);

		if ("上海".equals(user.getCity()))
			cboCity.setSelectedIndex(2);
		
		if ("广州".equals(user.getCity()))
			cboCity.setSelectedIndex(3);
		
		if ("太原".equals(user.getCity()))
			cboCity.setSelectedIndex(4);
		
		if ("西安".equals(user.getCity()))
			cboCity.setSelectedIndex(5);
		
		if ("武汉".equals(user.getCity()))
			cboCity.setSelectedIndex(6);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		lblUserID = new JLabel("登录账号：");
		lblUserID.setBounds(20, 42, 74, 15);
		add(lblUserID);
		
		txtUserID = new JLabel("");
		txtUserID.setBounds(104, 42, 178, 15);
		add(txtUserID);	
		
		lblName = new JLabel("真实姓名：");
		lblName.setBounds(20, 99, 74, 15);
		add(lblName);

		lblSex = new JLabel("用户性别：");
		lblSex.setBounds(20, 156, 74, 15);
		add(lblSex);
		
		lblCity = new JLabel("所在地：");
		lblCity.setBounds(20, 213, 74, 15);
		add(lblCity);
		
		txtName = new JTextField(10);
		txtName.setBounds(104, 94, 148, 25);
		add(txtName);
		
		rdoMale = new JRadioButton("男");
		rdoMale.setSelected(true);
		rdoMale.setBounds(104, 151, 50, 25);
		add(rdoMale);

		rdoFemale = new JRadioButton("女");
		rdoFemale.setBounds(173, 151, 50, 25);
		add(rdoFemale);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdoMale);
		group.add(rdoFemale);
		
		cboCity = new JComboBox<String>();
		cboCity.setModel(new DefaultComboBoxModel<String>(new String[] {
			                   	"北京", "上海", "广州", "太原", "西安", "武汉" }));
		cboCity.setBounds(104, 208, 122, 25);
		add(cboCity);
		
		btnConfirm = new JButton("确认");
		btnConfirm.setBounds(33, 289, 93, 35);
		add(btnConfirm);
		
		btnBack = new JButton("返回");
		btnBack.setBounds(161, 289, 93, 35);
		add(btnBack);
		
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDao userDao = new UserDaoImpl();
				
				// 封装待更新用户数据
				user.setName(txtName.getText().trim());
				user.setSex(rdoMale.isSelected() ? (byte)1 : (byte)0);
				user.setCity(cboCity.getSelectedItem().toString());
				
				boolean isOK = userDao.updateUser(user);
				if(!isOK) { // 用户信息更新失败
					JOptionPane.showMessageDialog(null, "用户信息更新失败", "警告信息",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				// 更新成功后转到书籍查询页面
				System.out.println("用户信息更新成功后转到书籍查询页面");
				BookListForm bookListForm = new BookListForm(user);
				bookListForm.getBookListForm().setVisible(true);
				
				userForm.dispose();
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 返回登录界面
				// bejin（此处请同学们补充代码，完成[返回]按钮的事件处理）
				LoginForm loginForm = new LoginForm();
				loginForm.getLoginForm().setVisible(true);
				userForm.dispose();
				// end	
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
