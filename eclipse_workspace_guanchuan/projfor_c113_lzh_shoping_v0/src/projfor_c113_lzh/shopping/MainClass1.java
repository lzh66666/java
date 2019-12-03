package projfor_c113_lzh.shopping;

import java.util.Scanner;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.service.BookDao;
import projfor_c113_lzh.shopping.service.BookDaoImpl;
import projfor_c113_lzh.shopping.util.ConsoleFrame;

/**
 * 
 * 该类主要的作用是负责启动应用程序，并与用户进行人机对话<br>
 * 根据用户的选择执行相应的业务处理。
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class MainClass1 {

	private static Scanner scanner = new Scanner(System.in);
	
	// 获取书籍服务对象
	private static BookDao bookDao = new BookDaoImpl();
	
	public static void main(String[] args) {

		while (true) {
			// 显示菜单
			ConsoleFrame.showMenu();
			// 并获取用户的选择（应用不输入退出应用的编号则始终显示菜单）
			int choise = ConsoleFrame.getChoise();
			switch (choise) {
			case 1:// 处理查询所有书籍的业务
				ConsoleFrame.queryAllBooks(bookDao);
				break;
			case 2:// 处理按书籍编号查询
				ConsoleFrame.queryBookById(bookDao);
				break;
			case 3:// 购买书籍，将书籍加入到用户的购物车中
				break;
			case 4:// 删除书籍，从购物车中删除书籍信息
				break;
			case 5:// 显示某个用户购物车中所有的书籍
				break;
			case 6:// 退出当前应用程序
				System.exit(0);
				break;
			default:
				System.out.println("您的选择不正确!!正确选项为: 1-6");
				continue;
			}
		}

	}

}