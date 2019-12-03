package projfor_c113_lzh.shopping;

import java.text.MessageFormat;
import java.util.Scanner;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.entity.User;
import projfor_c113_lzh.shopping.entity.UserDataSet;
import projfor_c113_lzh.shopping.service.BookDao;
import projfor_c113_lzh.shopping.service.BookDaoImpl;
import projfor_c113_lzh.shopping.service.UserDao;
import projfor_c113_lzh.shopping.service.UserDaoImpl;
import projfor_c113_lzh_shoping.CartyException.CartyException;

/**
 * 
 * ������Ҫ�������Ǹ�������Ӧ�ó��򣬲����û������˻��Ի�<br>
 * �����û���ѡ��ִ����Ӧ��ҵ����
 * 
 * @author ¬��
 * @version 2.0
 */
public class MainClass {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		UserDataSet.init();
		UserDao Uservice = new UserDaoImpl();
		boolean judge = true;
		
		while (judge) {
			showUserMenu();
			int choise = getUserChoise();
			switch (choise) {
			case 1:
				register(Uservice);
				break;
			case 2:
				if(login(Uservice))
					judge = false;
				break;
			case 3:// �˳���ǰӦ�ó���
				System.exit(0);
				break;
			case 999:
				queryAllUsers(Uservice);
				break;
			default:
				System.out.println("����ѡ����ȷ!!��ȷѡ��Ϊ: 1-3");
				continue;
			}
		}
		if(!judge) {
			BookDao service1 = new BookDaoImpl();
			while (true) {
				// ��ʾ�˵�
				showMenu();
				// ����ȡ�û���ѡ��Ӧ�ò������˳�Ӧ�õı����ʼ����ʾ�˵���
				int choise = getChoise();

				switch (choise) {
				case 1:// �����ѯ�����鼮��ҵ��
					queryBooks(service1);
					break;
				case 2:// �����鼮��Ų�ѯ
					queryBookById(service1);
					break;
				case 3:// �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
					try {
						buy(service1);
					} catch (CartyException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
					break;
				case 4:// ɾ���鼮���ӹ��ﳵ��ɾ���鼮��Ϣ
					break;
				case 5:// ��ʾĳ���û����ﳵ�����е��鼮
					break;
				case 6:// �˳���ǰӦ�ó���
					System.exit(0);
					break;
				default:
					System.out.println("����ѡ����ȷ!!��ȷѡ��Ϊ: 1-6");
					continue;
				}
			}
		}
	}
	
	/**
	 * ��ȡ�û���¼ҳ���ѡ��
	 * 
	 * @return �û���ѡ������
	 */
	private static int getUserChoise() {
		
		//Ҫ���û���¼ѡ��˵�
		System.out.print("��ѡ��(1-3):");
		
		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
		
		// ��ʾ�û�����Ĳ˵����
		System.out.println(MessageFormat.format("��ѡ�����:{0}",value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}
	
	
	
	/**
	 * ��ʾ�û���¼�Ĳ˵�
	 */
	private static void showUserMenu() {
		// ���Ƶ�¼����̨�˵�
		System.out.print("***********��ӭʹ����Ʒ����ϵͳ*************\r\n" + 
				"1.�û�ע��\r\n" + 
				"2.�û���¼\r\n" + 
				"3.�˳�ϵͳ\r\n" +
				"*****************************************\r\n");
	}

	
	
	private static boolean login(UserDao service) {
		System.out.println("�����������û����: ");
		String id = scanner.next();
		System.out.println("�����������û�����;");
		String password = scanner.next();
		User user = service.login(id, password);
		
		if(user == null) {
			System.out.println("�û������ڣ�");
			return false;
		}else if(!user.getPassword().equals(password)) {
			System.out.println("�û��������!!");
			return false;
		}else {
			System.out.println("��ӭ" + user.getName());
			return true;
		}
	}
	
	/**
	 * �û�ע����Ϣ
	 * 
	 * @param service
	 */
	private static void register(UserDao service) {
		System.out.println("�����������û����: ");
		String id = scanner.next();
		
		boolean judge1 = true;  //�ж��û����������������Ƿ�һ��
		
		while(judge1) {
			
			System.out.println("���������ĵ�¼����:");
			String password = scanner.next();
			System.out.println("���ٴ��������ĵ�¼����: ");
			String repassword = scanner.next();
			
			if(password.equals(repassword)) {
				System.out.println("��������������:");
				String name = scanner.next();
				System.out.println("��ѡ�������Ա�(1��ʾ��,0��ʾŮ)");
				byte sex = scanner.nextByte();
				System.out.println("�����������ڵĳ���;");
				String city = scanner.next();
				
				User user = new User(id, name, password, sex, city);
				
				boolean judge = service.register(user);
				
				boolean j = UserDataSet.addUser(user);
				if(!j) {
					System.out.println("��Ա������");
					return;
				}
				if(j && judge)
					System.out.println(user.getName() +",��ϲ��ע��ɹ�");	
				judge1 = false;
			}else {
				System.out.println("��������������");
			}	
		}
	}
	
	
	/**
	 * ��ȡ�û���ѡ��
	 * 
	 * @return �û���ѡ������
	 */
	private static int getChoise() {
		
		//Ҫ���û�ѡ��˵�
		System.out.print("��ѡ��(1-6):");
		
		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
		
		// ��ʾ�û�����Ĳ˵����
		System.out.println(MessageFormat.format("��ѡ�����:{0}",value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}
	
	/**
	 * ��ʾ���ڿ���̨�Ĳ˵�
	 */
	private static void showMenu() {
		// ���ƿ���̨�˵�
		System.out.print("***********��Ʒ����ϵͳ*************\r\n" + 
				"1.��ѯ������Ʒ\r\n" + 
				"2.������Ʒ��Ų���ͼ��\r\n" + 
				"3.�����鼮\r\n" + 
				"4.ȡ������\r\n" + 
				"5.��ѯ�������\r\n" + 
				"6.�˳�ϵͳ\r\n" + 
				"*****************************************\r\n");
	}
	
	/**
	 * ��ȡ�û��������û�����Ϣ,��̨��Ա����
	 * 
	 * @param service
	 */
	private static void queryAllUsers(UserDao service) {
		
		User[] users = service.queryAllUsers();
		
		for (User user : users) {
			if(user != null)
				System.out.println(user);
		}
	}
	
	/**
	 * ��ȡ�����鼮��ҵ��
	 * 
	 * @param service
	 */
	private static void queryBooks(BookDao service) {
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = service.queryAllBooks();
		// ��ʾ���е��鼮
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	/**
	 * �����鼮��Ż�ȡ�鼮��Ϣ
	 * 
	 * @param service
	 */
	private static void queryBookById(BookDao service) {
		System.out.println("��������Ʒ�ı��:");
		
		// ��ȡ�û�������鼮���
		String bid = scanner.next();
		
		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = service.queryBookById(bid);
		if(book == null) {
			System.out.println("��Ʒ��Ϣ�����ڣ�");
			return;
		}
		
		// ��ʾ�鼮��Ϣ
		System.out.println(book);
	}
	
	public static void buy(BookDao service) throws CartyException{
		System.out.println("��������Ҫ������鼮��ţ�");
		String bid = scanner.next();
		System.out.println("��������Ҫ�������Ʒ������");
		int number = scanner.nextInt();
		boolean judge = service.buy(bid, number);
		if(judge) {
			System.out.println("����ɹ���");
		}
		
	}
}