package nuc.ss.shopping.util;

import java.text.MessageFormat;
import java.util.Scanner;

import nuc.ss.shopping.Messages;
import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.service.BookDao;

/**
 * 
 * 用户通过控制台获取提示，用户通过控制台输入数据均由该类负责<br>
 * 该类起到人机交互的作用
 * 
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class ConsoleFrame {

	/** 获取用户的输入数据 */
	private static Scanner scanner = new Scanner(System.in);

	/**
	 * 显示基于控制台的菜单
	 */
	public static void showMenu() {
		// 绘制控制台菜单
		Messages.drawMenu();

	}

	/**
	 * 获取用户的选择
	 * 
	 * @return 用户的选择的序号
	 */
	public static int getChoise() {

		// 要求用户选择菜单
		Messages.draw(Messages.QUESTION_CHOISE_MENU);

		// 获取用户对于菜单的选择
		String value = scanner.next();

		// 显示用户输入的菜单序号
		Messages.drawLine(MessageFormat
				.format(Messages.INFO_INPUT_VALUE, value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// 转换失败,对外返回-1,表示输入无效
			return -1;
		}
	}

	/**
	 * 处理查询所有书籍的业务
	 * 
	 */
	public static void queryAllBooks(BookDao service) {
		
		// 通过业务类查询所有的书籍
		Book[] books = service.queryBook();
		// 显示所有的书籍
		for (Book book : books)
			Messages.drawLine(book);
	}

	/**
	 * 处理按书籍编号查询
	 */
	public static void queryBookById(BookDao service) {
		// 要求用户输入需要查询的书籍编号
		Messages.draw(Messages.QUESTION_ENTRY_BOOK_ID);

		// 获取用户输入的书籍编号
		String bid = scanner.next();

		// 通过业务类查询对应的书籍
		Book book = service.queryBook(bid);

		if (book == null) {
			Messages.drawLine(Messages.ERR_BOOK_NOT_FOUND);
			return;
		}

		// 显示书籍信息
		Messages.drawLine(book);
	}
}

