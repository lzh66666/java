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
 * 该类主要的作用是负责启动应用程序，并与用户进行人机对话<br>
 * 根据用户的选择执行相应的业务处理。
 * 
 * @author 卢泽华
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
			case 3:// 退出当前应用程序
				System.exit(0);
				break;
			case 999:
				queryAllUsers(Uservice);
				break;
			default:
				System.out.println("您的选择不正确!!正确选项为: 1-3");
				continue;
			}
		}
		if(!judge) {
			BookDao service1 = new BookDaoImpl();
			while (true) {
				// 显示菜单
				showMenu();
				// 并获取用户的选择（应用不输入退出应用的编号则始终显示菜单）
				int choise = getChoise();

				switch (choise) {
				case 1:// 处理查询所有书籍的业务
					queryBooks(service1);
					break;
				case 2:// 处理按书籍编号查询
					queryBookById(service1);
					break;
				case 3:// 购买书籍，将书籍加入到用户的购物车中
					try {
						buy(service1);
					} catch (CartyException e) {
						// TODO Auto-generated catch block
						System.out.println(e.getMessage());
					}
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
	
	/**
	 * 获取用户登录页面的选择
	 * 
	 * @return 用户的选择的序号
	 */
	private static int getUserChoise() {
		
		//要求用户登录选择菜单
		System.out.print("请选择(1-3):");
		
		// 获取用户对于菜单的选择
		String value = scanner.next();
		
		// 显示用户输入的菜单序号
		System.out.println(MessageFormat.format("您选择的是:{0}",value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// 转换失败,对外返回-1,表示输入无效
			return -1;
		}
	}
	
	
	
	/**
	 * 显示用户登录的菜单
	 */
	private static void showUserMenu() {
		// 绘制登录控制台菜单
		System.out.print("***********欢迎使用商品管理系统*************\r\n" + 
				"1.用户注册\r\n" + 
				"2.用户登录\r\n" + 
				"3.退出系统\r\n" +
				"*****************************************\r\n");
	}

	
	
	private static boolean login(UserDao service) {
		System.out.println("请输入您的用户编号: ");
		String id = scanner.next();
		System.out.println("请输入您的用户密码;");
		String password = scanner.next();
		User user = service.login(id, password);
		
		if(user == null) {
			System.out.println("用户不存在！");
			return false;
		}else if(!user.getPassword().equals(password)) {
			System.out.println("用户密码错误!!");
			return false;
		}else {
			System.out.println("欢迎" + user.getName());
			return true;
		}
	}
	
	/**
	 * 用户注册信息
	 * 
	 * @param service
	 */
	private static void register(UserDao service) {
		System.out.println("请输入您的用户编号: ");
		String id = scanner.next();
		
		boolean judge1 = true;  //判断用户的密码两次输入是否一致
		
		while(judge1) {
			
			System.out.println("请输入您的登录密码:");
			String password = scanner.next();
			System.out.println("请再次输入您的登录密码: ");
			String repassword = scanner.next();
			
			if(password.equals(repassword)) {
				System.out.println("请输入您的姓名:");
				String name = scanner.next();
				System.out.println("请选择您的性别(1表示男,0表示女)");
				byte sex = scanner.nextByte();
				System.out.println("请输入您所在的城市;");
				String city = scanner.next();
				
				User user = new User(id, name, password, sex, city);
				
				boolean judge = service.register(user);
				
				boolean j = UserDataSet.addUser(user);
				if(!j) {
					System.out.println("人员已满！");
					return;
				}
				if(j && judge)
					System.out.println(user.getName() +",恭喜您注册成功");	
				judge1 = false;
			}else {
				System.out.println("请重新输入密码");
			}	
		}
	}
	
	
	/**
	 * 获取用户的选择
	 * 
	 * @return 用户的选择的序号
	 */
	private static int getChoise() {
		
		//要求用户选择菜单
		System.out.print("请选择(1-6):");
		
		// 获取用户对于菜单的选择
		String value = scanner.next();
		
		// 显示用户输入的菜单序号
		System.out.println(MessageFormat.format("您选择的是:{0}",value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// 转换失败,对外返回-1,表示输入无效
			return -1;
		}
	}
	
	/**
	 * 显示基于控制台的菜单
	 */
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
	
	/**
	 * 获取用户的所有用户的信息,后台人员调用
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
	 * 获取所有书籍的业务
	 * 
	 * @param service
	 */
	private static void queryBooks(BookDao service) {
		// 通过业务类查询所有的书籍
		Book[] books = service.queryAllBooks();
		// 显示所有的书籍
		for(Book book: books) {
			System.out.println(book);
		}
	}
	
	/**
	 * 根据书籍编号获取书籍信息
	 * 
	 * @param service
	 */
	private static void queryBookById(BookDao service) {
		System.out.println("请输入商品的编号:");
		
		// 获取用户输入的书籍编号
		String bid = scanner.next();
		
		// 通过业务类查询对应的书籍
		Book book = service.queryBookById(bid);
		if(book == null) {
			System.out.println("商品信息不存在！");
			return;
		}
		
		// 显示书籍信息
		System.out.println(book);
	}
	
	public static void buy(BookDao service) throws CartyException{
		System.out.println("请输入您要购买的书籍编号：");
		String bid = scanner.next();
		System.out.println("请输入您要购买的商品数量：");
		int number = scanner.nextInt();
		boolean judge = service.buy(bid, number);
		if(judge) {
			System.out.println("购买成功！");
		}
		
	}
}