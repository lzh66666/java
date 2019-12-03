package projfor_c113_lzh.shopping;

import projfor_c113_lzh.shopping.entity.Book;
import projfor_c113_lzh.shopping.service.BookDaoImpl;

public class TMainClass {
	private static java.util.Scanner scanner = new java.util.Scanner(System.in);
	
	public static void main(String[] args) {
		while(true) {
			// 显示菜单
			showMenu();
			//获取用户的选择
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
				System.out.println("您的选择不正确！正确选项为：1-6");
				break;
			}	
		}
	}

	private static void showMenu() {
		// 绘制控制台菜单
		System.out.print("***********商品管理系统*************\r\n" + 
				"1.查询所有商品\r\n" + 
				"2.根据商品编号查找图书\r\n" + 
				"3.购买书籍\r\n" + 
				"4.取消购买\r\n" + 
				"5.查询购买情况\r\n" + 
				"6.退出系统\r\n" + 
				"*****************************************\r\n");
	}

	private static int getChoise() {
		//要求用户选择菜单
		System.out.print("请选择(1-6):");
		// 获取用户对于菜单的选择
		String value = scanner.next();
		// 显示用户输入的菜单序号
		// System.out.println(MessageFormat.format("您选择的是:{0}",value));
		System.out.println("您选择的是:" + value);
		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// 转换失败,对外返回-1,表示输入无效
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
		System.out.println("请输入书籍编号：");
		String bid = scanner.next();
		Book book = bdi.queryBookById(bid); 

		if(book == null) {
			System.out.println("您要查询的书籍不存在！");
			return;
		}
		
		System.out.println(book);
	}
}
