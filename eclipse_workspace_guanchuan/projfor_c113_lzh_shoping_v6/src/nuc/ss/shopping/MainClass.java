package nuc.ss.shopping;

import java.util.Scanner;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.ShoppingCart;
import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;
import nuc.ss.shopping.exception.CartyException;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaoImpl;
import nuc.ss.shopping.service.UserDao;
import nuc.ss.shopping.service.UserDaoImpl;

public class MainClass {
	private static Scanner scanner = new Scanner(System.in);

	// ��ȡ�鼮�������
	private static BookDao bookDao = new BookDaoImpl();
	
	// ���浱ǰ��¼�û�
	private static User curUser = null;
	
	public static void main(String[] args) {
		UserDataSet.init();
		while(true) {
			boolean loginOKflag = false;
			while(true) {
				showRegisterAndLoginMenu();
				int choise = getChoise1();
				switch (choise) {
				case 1: 
					if ((curUser = login()) != null) loginOKflag = true;
					break;
				case 2:
					register();
					break;
				case 3:
					System.out.println("ллʹ��,�ڴ����´ι��٣�Bye��");
					System.exit(0);
					break;
				case 999:
					forManager();
					break;
				default:
					System.out.println("����ѡ����ȷ����ȷѡ��Ϊ��1-3");
					break;				
				}
				
				if(loginOKflag) break;
			}
			
			while(true) {
				// ��ʾ�˵�
				showMainMenu();
				//��ȡ�û���ѡ��
				int choise = getChoise2();
				if (choise == 6) break;
				
				switch (choise) {
				case 1: // ��ѯ�����鼮
					queryAllBooks();
					break;
				case 2: // ���ձ�Ų�ѯ�鼮
					queryBookById();
					break;
				case 3: // �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
					addBook();
					break;
				case 4: // ɾ���鼮���ӹ��ﳵ��ɾ���鼮��Ϣ
					removeBook();
					break;
				case 5: // ��ʾ�û����ﳵ�����е��鼮
					showCart();
					break;
/*				case 6:
					System.out.println("ллʹ����Ʒ����ϵͳ��");
					System.exit(0);
					break;*/
				default:
					System.out.println("����ѡ����ȷ����ȷѡ��Ϊ��1-6");
					break;
				}	
			}
		}

	}
	
	private static void forManager() {
		User[] users = UserDataSet.getUsers();
		for (User user : users) {
			if(user != null)
				System.out.println(user);
		}
		
	}

	private static void showRegisterAndLoginMenu() {
		// ���ƿ���̨�˵�
		System.out.print("" + 
		        "**************��ӭʹ����Ʒ����ϵͳ*************\r\n" + 
				"1.�û���¼\r\n" + 
				"2.�û�ע��\r\n" + 
				"3.�˳�ϵͳ\r\n" + 
				"*****************************************\r\n");
	}
	
	private static boolean register() {
		System.out.println("�����������û���ţ�");
		String userId = scanner.next();
		System.out.println("���������ĵ�¼���룺");
		String userPassword1 = scanner.next();
		System.out.println("���ٴ��������ĵ�¼���룺");
		String userPassword2 = scanner.next();
		if (!(userPassword1.equals(userPassword2))) {
			System.out.println("������������벻һ�£�");
			return false;
		}
		System.out.println("������������ʵ������");
		String userName = scanner.next();
		System.out.println("��ѡ�������Ա�1��ʾ�У�0��ʾŮ����");
		byte userSex = scanner.nextByte();
		System.out.println("�������������ڳ��У�");
		String userCity = scanner.next();
		User user = new User(userId, userName, userPassword1, userSex, userCity);
		
		UserDao udi = new UserDaoImpl();
		if(udi.register(user)) {
			System.out.println(user.getName() + ", ��ϲ��ע��ɹ���");
			return true;
		} else {
			System.out.println("���ź�����ע��ʧ�ܣ�");
			return false;
		}
	}

	private static User login() {  // ��������ԭ��Ϊboolean
		UserDao udi = new UserDaoImpl();
		System.out.println("�����������û���ţ�");
		String userId = scanner.next();
		System.out.println("���������ĵ�¼���룺");
		String userPassword = scanner.next();
		User user = udi.login(userId, userPassword);
		if (user != null) {
			System.out.println("��ӭ" + user.getName() + "!" );
			return user;
		} else {
			System.out.println("�û���Ż����벻��!" );
			return null;
		}
	}

	private static void showMainMenu() {
		// ���ƿ���̨�˵�
		System.out.print("***********��Ʒ����ϵͳ*************\r\n" + 
				"1.��ѯ������Ʒ\r\n" + 
				"2.������Ʒ��Ų���ͼ��\r\n" + 
				"3.�����鼮\r\n" + 
				"4.ȡ������\r\n" + 
				"5.��ѯ�������\r\n" + 
				"6.���ص�¼/ע��˵�\r\n" + 
				"*****************************************\r\n");
	}

	private static int getChoise1() {
		//Ҫ���û�ѡ��˵�
		System.out.print("��ѡ��(1-3):");
		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
		// ��ʾ�û�����Ĳ˵����
		// System.out.println(MessageFormat.format("��ѡ�����:{0}",value));
		System.out.println("��ѡ�����:" + value);
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}
	
	private static int getChoise2() {
		//Ҫ���û�ѡ��˵�
		System.out.print("��ѡ��(1-6):");
		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
		// ��ʾ�û�����Ĳ˵����
		// System.out.println(MessageFormat.format("��ѡ�����:{0}",value));
		System.out.println("��ѡ�����:" + value);
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}
	
	private static void queryAllBooks() {
		//BookDao bd = new BookDaoImpl();
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = bookDao.queryAllBooks();
		// ��ʾ���е��鼮
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById() {
		//BookDao bd = new BookDaoImpl();
		
		System.out.println("��������Ʒ�ı��:");
		// ��ȡ�û�������鼮���
		String bid = scanner.next();
		
		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = bookDao.queryBookById(bid);
		if(book == null) {
			System.out.println("��Ʒ��Ϣ�����ڣ�");
			return;
		}
		
		// ��ʾ�鼮��Ϣ
		System.out.println(book);
		
	}
	
	/**
	 * �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
	 */
	private static void addBook() {
		// ��ͬѧ���Լ���ɱ�����������д
		System.out.println(curUser.getName() + ",��������Ҫ�������ı��");
		String bid = scanner.next();
		System.out.println(curUser.getName() + ",��������Ҫ������������");
		int quantity = scanner.nextInt();
		Book book = bookDao.queryBookById(bid);
		
		if(book == null) {
			System.out.println("��Ʒ��Ϣ�����ڣ�");
			return;
		}else {
			try {
				curUser.getShoppingCart().buy(book, quantity);
			} catch (CartyException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	/**
	 * ɾ���鼮�����鼮���û��Ĺ��ﳵ���Ƴ�
	 */
	private static void removeBook() {
		// ��ͬѧ���Լ���ɱ�����������д
		System.out.println(curUser.getName() + ",��������Ҫ�Ƴ����鼮���");
		String bid = scanner.next();
		Book[] books = bookDao.queryAllBooks();
		for (Book book : books) {
			if(bid.equals(book.getBid())) {
				try {
					curUser.getShoppingCart().remove(book);
				} catch (CartyException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}	
	/**
	 * ��ʾ�û��Ĺ��ﳵ
	 */
	private static void showCart() {
		// ��ͬѧ���Լ���ɱ�����������д
		System.out.println(curUser.getName() + ": " + curUser.getShoppingCart());
	}
}