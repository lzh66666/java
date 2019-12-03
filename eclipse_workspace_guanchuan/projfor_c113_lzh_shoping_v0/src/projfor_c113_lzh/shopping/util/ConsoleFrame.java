package projfor_c113_lzh.shopping.util;

import java.text.MessageFormat;
import java.util.Scanner;

import projfor_c113_lzh.shopping.Messages;
import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.service.BookDao;

/**
 * 
 * �û�ͨ������̨��ȡ��ʾ���û�ͨ������̨�������ݾ��ɸ��ฺ��<br>
 * �������˻�����������
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8�����飩
 */
public class ConsoleFrame {

	/** ��ȡ�û����������� */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * ��ʾ���ڿ���̨�Ĳ˵�
	 */
	public static void showMenu() {
		// ���ƿ���̨�˵�
		Messages.drawMenu();

	}

	/**
	 * ��ȡ�û���ѡ��
	 * 
	 * @return �û���ѡ������
	 */
	public static int getChoise() {

		// Ҫ���û�ѡ��˵�
		Messages.draw(Messages.QUESTION_CHOISE_MENU);

//		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
//
		// ��ʾ�û�����Ĳ˵����
		
		
		try {
			Messages.drawLine(MessageFormat
					.format(Messages.mess[Integer.parseInt(value)-1], value));
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}  catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("����ѡ����ȷ,����������!!!");
			return -1;
		}
	}

	/**
	 * ������ѯ�����鼮��ҵ��
	 * 
	 */
	public static void queryAllBooks(BookDao service) {
		
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = service.queryAllBooks();
		// ��ʾ���е��鼮
		for (Book book : books)
			Messages.drawLine(book);
	}

	/**
	 * �������鼮��Ų�ѯ
	 */
	public static void queryBookById(BookDao service) {
		// Ҫ���û�������Ҫ��ѯ���鼮���
		Messages.draw(Messages.QUESTION_ENTRY_BOOK_ID);

		// ��ȡ�û�������鼮���
		String bid = scanner.next();

		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = service.queryBookById(bid);

		if (book == null) {
			Messages.drawLine(Messages.ERR_BOOK_NOT_FOUND);
			return;
		}

		// ��ʾ�鼮��Ϣ
		Messages.drawLine(book);
	}
	
	/**
	 * �����鼮
	 */
	
	public static void buyBooks() {
		System.out.println();
	}
}
