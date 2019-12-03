package projfor_c113_lzh.shopping;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.service.BookDaoImpl;

public class TMainClass {
	private static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			// ��ʾ�˵�
			showMenu();
			//��ȡ�û���ѡ��
			int choise = getChoise();
			switch (choise) {
			case 1:
				queryAllBooks();
				break;
			case 2:
				queryBookById();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("����ѡ����ȷ����ȷѡ��Ϊ��1-6");
				break;
			}	
		}
	}

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

	private static int getChoise() {
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
		BookDaoImpl bdi = new BookDaoImpl();
		Book[] books = bdi.queryAllBooks();
		for(Book book : books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById() {
		BookDaoImpl bdi = new BookDaoImpl();
		System.out.println("�������鼮��ţ�");
		String bid = scanner.next();
		Book book = bdi.queryBookById(bid); 

		if(book == null) {
			System.out.println("��Ҫ��ѯ���鼮�����ڣ�");
			return;
		}
		
		System.out.println(book);
	}
}
