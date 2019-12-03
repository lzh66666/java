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
		setTitle("���̹���ƽ̨--�����û���Ϣҳ��");
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
	 * ���û���Ϣͨ��Swing�ؼ����֡�
	 */
	private void initDatas() {
		// ��ʾ�û���¼�˺�
		this.txtUserID.setText(user.getId());
		// ��ʾ�û���ʵ���������޸ģ�
		this.txtName.setText(user.getName() == null ? "" : user.getName());
		// ��ʾ�û��Ա𣨿��޸ģ�
		if (user.getSex().byteValue() == 1) {
			rdoMale.setSelected(true);
		} else {
			rdoFemale.setSelected(true);
		}
		// ��ʾ�û����ڵأ����޸ģ�
		if ("����".equals(user.getCity()))
			cboCity.setSelectedIndex(1);

		if ("�Ϻ�".equals(user.getCity()))
			cboCity.setSelectedIndex(2);
		
		if ("����".equals(user.getCity()))
			cboCity.setSelectedIndex(3);
		
		if ("̫ԭ".equals(user.getCity()))
			cboCity.setSelectedIndex(4);
		
		if ("����".equals(user.getCity()))
			cboCity.setSelectedIndex(5);
		
		if ("�人".equals(user.getCity()))
			cboCity.setSelectedIndex(6);

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void init() {
		lblUserID = new JLabel("��¼�˺ţ�");
		lblUserID.setBounds(20, 42, 74, 15);
		add(lblUserID);
		
		txtUserID = new JLabel("");
		txtUserID.setBounds(104, 42, 178, 15);
		add(txtUserID);	
		
		lblName = new JLabel("��ʵ������");
		lblName.setBounds(20, 99, 74, 15);
		add(lblName);

		lblSex = new JLabel("�û��Ա�");
		lblSex.setBounds(20, 156, 74, 15);
		add(lblSex);
		
		lblCity = new JLabel("���ڵأ�");
		lblCity.setBounds(20, 213, 74, 15);
		add(lblCity);
		
		txtName = new JTextField(10);
		txtName.setBounds(104, 94, 148, 25);
		add(txtName);
		
		rdoMale = new JRadioButton("��");
		rdoMale.setSelected(true);
		rdoMale.setBounds(104, 151, 50, 25);
		add(rdoMale);

		rdoFemale = new JRadioButton("Ů");
		rdoFemale.setBounds(173, 151, 50, 25);
		add(rdoFemale);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdoMale);
		group.add(rdoFemale);
		
		cboCity = new JComboBox<String>();
		cboCity.setModel(new DefaultComboBoxModel<String>(new String[] {
			                   	"����", "�Ϻ�", "����", "̫ԭ", "����", "�人" }));
		cboCity.setBounds(104, 208, 122, 25);
		add(cboCity);
		
		btnConfirm = new JButton("ȷ��");
		btnConfirm.setBounds(33, 289, 93, 35);
		add(btnConfirm);
		
		btnBack = new JButton("����");
		btnBack.setBounds(161, 289, 93, 35);
		add(btnBack);
		
		btnConfirm.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UserDao userDao = new UserDaoImpl();
				
				// ��װ�������û�����
				user.setName(txtName.getText().trim());
				user.setSex(rdoMale.isSelected() ? (byte)1 : (byte)0);
				user.setCity(cboCity.getSelectedItem().toString());
				
				boolean isOK = userDao.updateUser(user);
				if(!isOK) { // �û���Ϣ����ʧ��
					JOptionPane.showMessageDialog(null, "�û���Ϣ����ʧ��", "������Ϣ",
							JOptionPane.WARNING_MESSAGE);
					return;
				}
				
				// ���³ɹ���ת���鼮��ѯҳ��
				System.out.println("�û���Ϣ���³ɹ���ת���鼮��ѯҳ��");
				BookListForm bookListForm = new BookListForm(user);
				bookListForm.getBookListForm().setVisible(true);
				
				userForm.dispose();
			}
		});
		
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���ص�¼����
				// bejin���˴���ͬѧ�ǲ�����룬���[����]��ť���¼�������
				LoginForm loginForm = new LoginForm();
				loginForm.getLoginForm().setVisible(true);
				userForm.dispose();
				// end	
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