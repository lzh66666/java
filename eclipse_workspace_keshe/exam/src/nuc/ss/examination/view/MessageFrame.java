package nuc.ss.examination.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.service.IUserService;
import nuc.ss.examination.service.UserServiceImpl;

public class MessageFrame extends BaseFrame{
	private static final long serialVersionUID = 1L;
	
	private User user;
	private boolean judge = false;
	public MessageFrame() {
		this.init();
	}
	
	public MessageFrame(String title,User user) {
		super(title);
		this.user = user;
		this.init();
	}
	
	private JPanel registerPanel = new JPanel();
	
	private JLabel titleLable = new JLabel("管 理 页 面");
	
	private JLabel nameLable = new JLabel("姓 名 ：");
	private JLabel idLable = new JLabel("身 份 证：");
	private JLabel accountLable = new JLabel("账 号 ： ");
    private JLabel passwordLable = new JLabel("密 码 ： ");
    
    private ImageIcon showPassword = new ImageIcon(DatabaseConfig.IMAGE + "show.png");
	private ImageIcon hiddenPassword = new ImageIcon(DatabaseConfig.IMAGE + "hidden.png");
	private JLabel imageJLable = new JLabel("");
	
    private JTextField nameText = new JTextField();
    private JTextField idText = new JTextField();
    private JTextField accountText = new JTextField();
    private JPasswordField passwordText = new JPasswordField();
    
    private  JButton  save= new JButton("保存");
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
        
        imageJLable.setBounds(470,277,20,20);
		showPassword.setImage(showPassword.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT ));
		hiddenPassword.setImage(hiddenPassword.getImage().getScaledInstance(20, 20,Image.SCALE_DEFAULT ));
		imageJLable.setIcon(hiddenPassword);
        
        nameText.setBounds(204,124,260,30);
        nameText.setFont(new Font("黑体",Font.BOLD,24));
        nameText.setText(user.getName());
        
        idText.setBounds(204,174,260,30);
        idText.setFont(new Font("黑体",Font.BOLD,24));
        idText.setText(user.getId());
        
        accountText.setBounds(204,224,260,30);
        accountText.setFont(new Font("黑体",Font.BOLD,24));
        accountText.setText(user.getAccount());
        accountText.setEditable(false);
        
        passwordText.setBounds(204,274,260,30);
        passwordText.setFont(new Font("黑体",Font.BOLD,24));
        passwordText.setEchoChar('*');
        passwordText.setText(user.getPassword());
        
        save.setBounds(160,324,100,30);
        save.setFont(new Font("黑体",Font.BOLD,22));
        
        back.setBounds(310,324,100,30);
        back.setFont(new Font("黑体",Font.BOLD,22));
        
        
	}

	@Override
	protected void addElement() {
		registerPanel.add(titleLable);
		registerPanel.add(nameLable);
		registerPanel.add(idLable);
		registerPanel.add(accountLable);
		registerPanel.add(passwordLable);
		registerPanel.add(imageJLable);
		registerPanel.add(nameText);
		registerPanel.add(idText);
		registerPanel.add(accountText);
		registerPanel.add(passwordText);
		registerPanel.add(back);
		registerPanel.add(save);
		
		add(registerPanel);
	}

	@Override
	protected void addListener() {
		save.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				IUserService userService = new UserServiceImpl();
				String name = nameText.getText();
				String id = idText.getText();
				String password = new String(passwordText.getPassword());
				
				User mUser = new User(name, id, user.getAccount(), password,user.getType());
				
				String message = userService.revise(mUser);
				
				if(message == null) {
					JOptionPane.showMessageDialog(MessageFrame.this, "该用户没有任何信息，请核对信息");
					nameText.requestFocus();
					return;
				}
				JOptionPane.showMessageDialog(MessageFrame.this, message);
			}
		});
		
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if(user.getType().equals(" 学 生")) {
					StudentFrame studentFrame = new StudentFrame("欢迎" + user.getName() + "到来",user);
					studentFrame.getStudentFrame().setVisible(true);
				}
				else if(user.getType().equals(" 老 师")) {
					TeacherFrame teacherFrame = new TeacherFrame("欢迎" + user.getName() + "到来",user);
					teacherFrame.getTeacherFrame().setVisible(true);
				}
			}
		});
		
		imageJLable.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {}
			
			@Override
			public void mousePressed(MouseEvent e) {}
			
			@Override
			public void mouseExited(MouseEvent e) {}
			
			@Override
			public void mouseEntered(MouseEvent e) {}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!judge) {
					imageJLable.setIcon(showPassword);
					passwordText.setEchoChar((char)0);
					judge = true;
				}else {
					imageJLable.setIcon(hiddenPassword);
					passwordText.setEchoChar('*');
					judge = false;
				}
				
			}
		});
	}

	@Override
	protected void setFrameSelf() {
		 setBounds(400,180,560,440);
	     setResizable(false);
	     setVisible(true);
	     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new MessageFrame();
	}
	
}
