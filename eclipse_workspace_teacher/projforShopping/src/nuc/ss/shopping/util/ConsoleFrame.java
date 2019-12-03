package nuc.ss.shopping.util;

import java.text.MessageFormat;
import java.util.Scanner;

import nuc.ss.shopping.Messages;
import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.service.BookDao;

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

		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();

		// ��ʾ�û�����Ĳ˵����
		Messages.drawLine(MessageFormat
				.format(Messages.INFO_INPUT_VALUE, value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}

	/**
	 * �����ѯ�����鼮��ҵ��
	 * 
	 */
	public static void queryAllBooks(BookDao service) {
		
		// ͨ��ҵ�����ѯ���е��鼮
		Book[] books = service.queryBook();
		// ��ʾ���е��鼮
		for (Book book : books)
			Messages.drawLine(book);
	}

	/**
	 * �����鼮��Ų�ѯ
	 */
	public static void queryBookById(BookDao service) {
		// Ҫ���û�������Ҫ��ѯ���鼮���
		Messages.draw(Messages.QUESTION_ENTRY_BOOK_ID);

		// ��ȡ�û�������鼮���
		String bid = scanner.next();

		// ͨ��ҵ�����ѯ��Ӧ���鼮
		Book book = service.queryBook(bid);

		if (book == null) {
			Messages.drawLine(Messages.ERR_BOOK_NOT_FOUND);
			return;
		}

		// ��ʾ�鼮��Ϣ
		Messages.drawLine(book);
	}
}

