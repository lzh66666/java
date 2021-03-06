package nuc.ss.shopping;

import java.util.Scanner;

import nuc.ss.shopping.entity.Book;
import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;
import nuc.ss.shopping.service.BookDao;
import nuc.ss.shopping.service.BookDaoImpl;
import nuc.ss.shopping.service.UserDao;
import nuc.ss.shopping.service.UserDaoImpl;

public class MainClass {
	private static Scanner scanner = new Scanner(System.in);

	// 获取书籍服务对象
	private static BookDao bookDao = new BookDaoImpl();
	
	// 保存当前登录用户
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
					System.out.println("谢谢使用,期待您下次光临！Bye！");
					System.exit(0);
					break;
				case 999:
					forManager();
					break;
				default:
					System.out.println("您的选择不正确！正确选项为：1-3");
					break;				
				}
				
				if(loginOKflag) break;
			}
			
			while(true) {
				// 显示菜单
				showMainMenu();
				//获取用户的选择
				int choise = getChoise2();
				if (choise == 6) break;
				
				switch (choise) {
				case 1: // 查询所有书籍
					queryAllBooks();
					break;
				case 2: // 按照编号查询书籍
					queryBookById();
					break;
				case 3: // 购买书籍，将书籍加入到用户的购物车中
					addBook();
					break;
				case 4: // 删除书籍，从购物车中删除书籍信息
					removeBook();
					break;
				case 5: // 显示用户购物车中所有的书籍
					showCart();
					break;
/*				case 6:
					System.out.println("谢谢使用商品管理系统！");
					System.exit(0);
					break;*/
				default:
					System.out.println("您的选择不正确！正确选项为：1-6");
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
		// 绘制控制台菜单
		System.out.print("" + 
		        "**************欢迎使用商品管理系统*************\r\n" + 
				"1.用户登录\r\n" + 
				"2.用户注册\r\n" + 
				"3.退出系统\r\n" + 
				"*****************************************\r\n");
	}
	
	private static boolean register() {
		System.out.println("请输入您的用户编号：");
		String userId = scanner.next();
		System.out.println("请输入您的登录密码：");
		String userPassword1 = scanner.next();
		System.out.println("请再次输入您的登录密码：");
		String userPassword2 = scanner.next();
		if (!(userPassword1.equals(userPassword2))) {
			System.out.println("两次输入的密码不一致！");
			return false;
		}
		System.out.println("请输入您的真实姓名：");
		String userName = scanner.next();
		System.out.println("请选择您的性别（1表示男，0表示女）：");
		byte userSex = scanner.nextByte();
		System.out.println("请输入您的所在城市：");
		String userCity = scanner.next();
		User user = new User(userId, userName, userPassword1, userSex, userCity);
		
		UserDao udi = new UserDaoImpl();
		if(udi.register(user)) {
			System.out.println(user.getName() + ", 恭喜您注册成功！");
			return true;
		} else {
			System.out.println("很遗憾！您注册失败！");
			return false;
		}
	}

	private static User login() {  // 返回类型原来为boolean
		UserDao udi = new UserDaoImpl();
		System.out.println("请输入您的用户编号：");
		String userId = scanner.next();
		System.out.println("请输入您的登录密码：");
		String userPassword = scanner.next();
		User user = udi.login(userId, userPassword);
		if (user != null) {
			System.out.println("欢迎" + user.getName() + "!" );
			return user;
		} else {
			System.out.println("用户编号或密码不对!" );
			return null;
		}
	}

	private static void showMainMenu() {
		// 绘制控制台菜单
		System.out.print("***********商品管理系统*************\r\n" + 
				"1.查询所有商品\r\n" + 
				"2.根据商品编号查找图书\r\n" + 
				"3.购买书籍\r\n" + 
				"4.取消购买\r\n" + 
				"5.查询购买情况\r\n" + 
				"6.返回登录/注册菜单\r\n" + 
				"*****************************************\r\n");
	}

	private static int getChoise1() {
		//要求用户选择菜单
		System.out.print("请选择(1-3):");
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
	
	private static int getChoise2() {
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
		//BookDao bd = new BookDaoImpl();
		// 通过业务类查询所有的书籍
		Book[] books = bookDao.queryAllBooks();
		// 显示所有的书籍
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	private static void queryBookById() {
		//BookDao bd = new BookDaoImpl();
		
		System.out.println("请输入商品的编号:");
		// 获取用户输入的书籍编号
		String bid = scanner.next();
		
		// 通过业务类查询对应的书籍
		Book book = bookDao.queryBookById(bid);
		if(book == null) {
			System.out.println("商品信息不存在！");
			return;
		}
		
		// 显示书籍信息
		System.out.println(book);
		
	}
	
	/**
	 * 购买书籍，将书籍加入到用户的购物车中
	 */
	private static void addBook() {
		// 请同学们自己完成本方法体代码编写
		
	}
	/**
	 * 删除书籍，将书籍从用户的购物车中移除
	 */
	private static void removeBook() {
		// 请同学们自己完成本方法体代码编写
		
	}	
	/**
	 * 显示用户的购物车
	 */
	private static void showCart() {
		// 请同学们自己完成本方法体代码编写
		

	}
}
