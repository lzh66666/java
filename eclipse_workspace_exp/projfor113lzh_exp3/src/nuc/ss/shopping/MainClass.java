package nuc.ss.shopping;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaoImpl;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * 
 * ������Ҫ�������Ǹ�������Ӧ�ó��򣬲����û������˻��Ի�<br>
 * �����û���ѡ��ִ����Ӧ��ҵ����
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	
	private static void queryBooks(BookDao service) {
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = service.queryAllBooks();
		// ��ʾ���е��鼮
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById(BookDao service) {
		System.out.println(Messages.QUESTION_ENTRY_BOOK_ID);
		
		// ��ȡ�û�������鼮���
		String bid = scanner.next();
		
		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = service.queryBookById(bid);
		if(book == null) {
			System.out.println(Messages.ERR_BOOK_NOT_FOUND);
			return;
		}
		
		// ��ʾ�鼮��Ϣ
		System.out.println(book);
		
	}

	public static void main(String[] args) {
		BookDao service = new BookDaoImpl();

		while (true) {
			// ��ʾ�˵�
			showMenu();
			// ����ȡ�û���ѡ��Ӧ�ò������˳�Ӧ�õı����ʼ����ʾ�˵���
			int choise = getChoise();

			switch (choise) {
			case 1:// �����ѯ�����鼮��ҵ��
				queryBooks(service);
				break;
			case 2:// �����鼮��Ų�ѯ
				queryBookById(service);
				break;
			case 3:// �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
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
//		System.out.println(MessageFormat.format("��ѡ�����:{0}",value));
//
//		try {
//			return Integer.parseInt(value);
//		} catch (NumberFormatException e) {
//			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
//			return -1;
//		}
		try {
			System.out.println(Messages.INFO_INPUT_MESSAGE + Messages.mess[Integer.parseInt(value)-1]);
			return Integer.parseInt(value);
		} catch (ArrayIndexOutOfBoundsException e) {
			return -1;
		}catch (NumberFormatException e) {
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
}