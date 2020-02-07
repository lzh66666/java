package nuc.ss.examination.view;

import javax.swing.*;

import nuc.ss.examination.dao.IUserDao;
import nuc.ss.examination.dao.UserDaoImpl;
import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IUserService;
import nuc.ss.examination.service.UserServiceImpl;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginFrame extends BaseFrame {
	private static final long serialVersionUID = 1L;
	
	private LoginFrame loginFrame;
	private boolean judge = false;
	
	public LoginFrame() {
		loginFrame = this;
		this.init();
	}

	public LoginFrame(String title) {
		super(title);
		loginFrame = this;
		this.init();
	}

	public LoginFrame getLoginFrame() {
		return loginFrame;
	}

	private JPanel loginPanel = new JPanel();
	private JLabel titleJLable = new JLabel("�� �� �� �� ϵ ͳ");
	
	private ImageIcon showPassword = new ImageIcon(DatabaseConfig.IMAGE + "show.png");
	private ImageIcon hiddenPassword = new ImageIcon(DatabaseConfig.IMAGE + "hidden.png");
	
	private JLabel imageJLable = new JLabel("");
	private JLabel nameJLable = new JLabel("�� �ţ�");
	private JLabel passwordJLable = new JLabel("�� �룺");
	private JLabel typeJLabel = new JLabel("�� �ͣ�");
	
	private JTextField accountText = new JTextField();
	private JPasswordField passwordText = new JPasswordField();
	private JComboBox<String> typeSelect = new JComboBox<String>();
	
	private JButton login = new JButton("�� ¼");
	private JButton register = new JButton("ע��");
	private JButton reset = new JButton("�� ��");
	
	@Override
	protected void setup() {
		loginPanel.setBackground(Color.WHITE);
		loginPanel.setLayout(null);
		
		titleJLable.setBounds(120, 40, 340, 35);
		titleJLable.setFont(new Font("����", Font.BOLD, 34));

		nameJLable.setBounds(94, 124, 90, 30);
		nameJLable.setFont(new Font("����", Font.BOLD, 24));

		passwordJLable.setBounds(94, 224, 90, 30);
		passwordJLable.setFont(new Font("����", Font.BOLD, 24));

		imageJLable.setBounds(470, 226, 20, 20);
		showPassword.setImage(showPassword.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		hiddenPassword.setImage(hiddenPassword.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT));
		imageJLable.setIcon(hiddenPassword);

		typeJLabel.setBounds(94, 174, 90, 30);
		typeJLabel.setFont(new Font("����", Font.BOLD, 24));

		accountText.setBounds(204, 124, 260, 30);
		accountText.setFont(new Font("����", Font.BOLD, 24));

		passwordText.setBounds(204, 224, 260, 30);
		passwordText.setFont(new Font("����", Font.BOLD, 24));
		passwordText.setEchoChar('*');

		typeSelect.addItem(" ѧ ��");
		typeSelect.addItem(" �� ʦ");
		typeSelect.addItem(" �� �� Ա");
		typeSelect.setFont(new Font("����", Font.BOLD, 24));
		typeSelect.setBounds(204, 174, 260, 30);

		login.setBounds(94, 282, 100, 30);
		login.setFont(new Font("����", Font.BOLD, 22));

		register.setBounds(230, 282, 100, 30);
		register.setFont(new Font("����", Font.BOLD, 22));

		reset.setBounds(364, 282, 100, 30);
		reset.setFont(new Font("����", Font.BOLD, 22));

	}

	@Override
	protected void addElement() {
		loginPanel.add(titleJLable);
		loginPanel.add(nameJLable);
		loginPanel.add(passwordJLable);
		loginPanel.add(imageJLable);
		loginPanel.add(typeJLabel);
		loginPanel.add(accountText);
		loginPanel.add(passwordText);
		loginPanel.add(typeSelect);
		loginPanel.add(login);
		loginPanel.add(register);
		loginPanel.add(reset);
		add(loginPanel);
	}

	@Override
	protected void addListener() {
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String account = accountText.getText();
				String password = new String(passwordText.getPassword());
				String type = (String) typeSelect.getSelectedItem();

				User user = new User(account, password, type);
				IUserService userService = new UserServiceImpl();
				String result = userService.login(user);

				IUserDao uDao = new UserDaoImpl();
				User userTxt = uDao.selectOne(account);

				if (result == null) {
					JOptionPane.showMessageDialog(LoginFrame.this, "�û������������");
					return;
				}
				// �������ڲ�����this��������,��Ҫ��LoginFrame.this
				JOptionPane.showMessageDialog(LoginFrame.this, result);
				if (user.getType().equals(" ѧ ��")) {
					if (result.equals("ѧ��" + userTxt.getName() + "��¼�ɹ�")) {
						new StudentFrame("��ӭѧ��" + userTxt.getName() + "��¼", userTxt);
						setVisible(false);
					} else {
						accountText.requestFocus();
					}
				} else if (user.getType().equals(" �� ʦ")) {
					if (result.equals("��ʦ" + userTxt.getName() + "��¼�ɹ�")) {
						new TeacherFrame(userTxt.getName() + "��ʦ�������о�", userTxt);
						setVisible(false);
					} else {
						accountText.requestFocus();
					}
				} else {
					if (result.equals("����Ա" + userTxt.getName() + "��¼�ɹ�")) {
						new AdminFrame(userTxt.getName() + "�����Ծ�����",userTxt);
						setVisible(false);
					} else {
						accountText.requestFocus();
					}
				}
			}
		});

		// �����û�����
		passwordText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				// �û����س���������ť����һ�¡�
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					login.doClick();
				}
			}
		});
		// ע���˺�(ѧ��)
		register.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new RegisterFrame("��ӭ���ĵ���");
				setVisible(false);
			}
		});

		// ����������
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				accountText.setText("");
				passwordText.setText("");
				typeSelect.setSelectedIndex(0);
				accountText.requestFocus();
			}
		});

		imageJLable.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				if (!judge) {
					imageJLable.setIcon(showPassword);
					passwordText.setEchoChar((char) 0);
					judge = true;
				} else {
					imageJLable.setIcon(hiddenPassword);
					passwordText.setEchoChar('*');
					judge = false;
				}

			}
		});
	}

	@Override
	protected void setFrameSelf() {
		setBounds(400, 180, 560, 380);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new LoginFrame("��Ϊ������");
	}
}
