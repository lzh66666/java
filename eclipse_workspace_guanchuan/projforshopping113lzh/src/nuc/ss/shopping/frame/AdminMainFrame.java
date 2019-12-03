package nuc.ss.shopping.frame;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import nuc.ss.shopping.entiy.User;

public class AdminMainFrame extends JFrame implements MouseListener{
	private static final long serialVersionUID = 1L;
	
	JMenu shoppingmanager,ordermanager,personmanager;
	JMenu shoppingmanager21,shoppingmanager22;
	JMenuItem s10,s11,s12,s2,s3;
	JMenuBar mb;
	User user = null;
	AdminMainFrame adminMainFrame;
	public AdminMainFrame(User u) {
		adminMainFrame = this;
		user = u;
		setTitle("���̹���ƽ̨ϵͳ[��ӭ" + u.getName() + "����Ա��¼ϵͳ]");
		setBounds(200,200,400,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		init();
		
		setVisible(true);
	}
	private void init() {
		
		mb = new JMenuBar();
		
		shoppingmanager = new JMenu("��Ʒ����");
		shoppingmanager21 = new JMenu("��ѯ��Ʒ��Ϣ");
		s10 = new JMenuItem("��ѯ������Ʒ");
		s11 = new JMenuItem("����Ʒ����ѯ");
		s12 = new JMenuItem("����Ʒ���Ʋ�ѯ");
		
		shoppingmanager22 = new JMenu("������Ʒ ");
		s3 = new JMenuItem("ɾ����Ʒ ");
		
		shoppingmanager21.add(s10);
		shoppingmanager21.add(s11);
		shoppingmanager21.add(s12);
		shoppingmanager.add(shoppingmanager21);
		
		shoppingmanager.add(shoppingmanager22);
		shoppingmanager.add(s3);
		mb.add(shoppingmanager);
		
		
		ordermanager = new JMenu("��������");
		mb.add(ordermanager);
		
		personmanager = new JMenu("��ɫ����");
		mb.add(personmanager);
		
		setJMenuBar(mb);		

		shoppingmanager21.addMouseListener(this);
		shoppingmanager22.addMouseListener(this);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == shoppingmanager21) {
			new BookListFormFrame(user);
			adminMainFrame.dispose();
		}
		if(e.getSource() == shoppingmanager22) {
			new AdminAddBookFrame();
			adminMainFrame.dispose();
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
}