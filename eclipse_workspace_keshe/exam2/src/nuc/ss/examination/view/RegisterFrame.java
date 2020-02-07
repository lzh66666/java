package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IUserService;
import nuc.ss.examination.service.UserServiceImpl;

public class RegisterFrame extends BaseFrame{
	private static final long serialVersionUID = 1L;
	
	public RegisterFrame() {
		this.init();
	}
	
	public RegisterFrame(String title) {
		super(title);
		this.init();
	}
	
	private JPanel registerPanel = new JPanel();
	private JLabel titleLable = new JLabel("注 册 页 面");
	private JLabel nameLable = new JLabel("姓 名 ：");
	private JLabel idLable = new JLabel("身 份 证：");
	private JLabel accountLable = new JLabel("账 号 ： ");
    private JLabel passwordLable = new JLabel("密 码 ： ");
    private JLabel typeJLabel = new JLabel("类 型：");
    
    private JTextField nameText = new JTextField();
    private JTextField idText = new JTextField();
    private JTextField accountText = new JTextField();
    private JPasswordField passwordText = new JPasswordField();
    
    private JComboBox<String> typeSelect = new JComboBox<String>();
    
    private  JButton register = new JButton("注册");
    private  JButton back = new JButton("返回");
    
	@Override
	protected void setup() {
		registerPanel.setBackground(Color.WHITE);
		registerPanel.setLayout(null);
		
		titleLable.setBounds(180,40,340,70);
		titleLable.setFont(new Font("黑体",Font.BOLD,34));
		
		nameLable.setBounds(78,124,140,30);
        nameLable.setFont(new Font("黑体",Font.BOLD,24));
        
        idLable.setBounds(54,174,140,30);
        idLable.setFont(new Font("黑体",Font.BOLD,24));
        
        accountLable.setBounds(78,224,140,30);
        accountLable.setFont(new Font("黑体",Font.BOLD,24));
        
        passwordLable.setBounds(78,274,140,30);
        passwordLable.setFont(new Font("黑体",Font.BOLD,24));
        
        typeJLabel.setBounds(78, 324, 140, 30);
		typeJLabel.setFont(new Font("黑体", Font.BOLD, 24));
        
        nameText.setBounds(204,124,260,30);
        nameText.setFont(new Font("黑体",Font.BOLD,24));
        
        idText.setBounds(204,174,260,30);
        idText.setFont(new Font("黑体",Font.BOLD,24));
        
        accountText.setBounds(204,224,260,30);
        accountText.setFont(new Font("黑体",Font.BOLD,24));
        
        passwordText.setBounds(204,274,260,30);
        passwordText.setFont(new Font("黑体",Font.BOLD,24));
        
        typeSelect.addItem(" 学 生");
		typeSelect.addItem(" 老 师");
		typeSelect.setFont(new Font("黑体", Font.BOLD, 24));
		typeSelect.setBounds(204, 324, 260, 30);
		
        register.setBounds(160,374,100,30);
        register.setFont(new Font("黑体",Font.BOLD,22));
        
        back.setBounds(310,374,100,30);
        back.setFont(new Font("黑体",Font.BOLD,22));
        
        
	}

	@Override
	protected void addElement() {
		registerPanel.add(titleLable);
		registerPanel.add(nameLable);
		registerPanel.add(idLable);
		registerPanel.add(accountLable);
		registerPanel.add(passwordLable);
		registerPanel.add(typeJLabel);
		registerPanel.add(nameText);
		registerPanel.add(idText);
		registerPanel.add(accountText);
		registerPanel.add(passwordText);
		registerPanel.add(typeSelect);
		registerPanel.add(back);
		registerPanel.add(register);
		
		add(registerPanel);
	}

	@Override
	protected void addListener() {
		register.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IUserService userService = new UserServiceImpl();
				String name = nameText.getText();
				String id = idText.getText();
				String account = accountText.getText();
				String password = new String(passwordText.getPassword());
				String type = (String) typeSelect.getSelectedItem();
				
				User user = new User(name, id, account, password, type);
				
				String message = userService.register(user);
				
				if(message == null) {
					JOptionPane.showMessageDialog(RegisterFrame.this, "该用户账号已经注册过,请重新注册");
					nameText.requestFocus();
					return;
				}
				JOptionPane.showMessageDialog(RegisterFrame.this, message);
			}
		});
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				LoginFrame loginFrame = new LoginFrame();
				loginFrame.getLoginFrame().setVisible(true);
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		 setBounds(400,180,560,490);
	     setResizable(false);
	     setVisible(true);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
