package projfor_c113_lzh.shopping;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * 
 * 该类主要的作用是负责启动应用程序，并与用户进行人机对话<br>
 * 根据用户的选择执行相应的业务处理。
 * 
 * @author 卢泽华
 * @version 1.0
 */
public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {

		while (true) {
			// 显示菜单
			showMenu();
			// 并获取用户的选择（应用不输入退出应用的编号则始终显示菜单）
			int choise = getChoise();

			switch (choise) {
			case 1:// 处理查询所有书籍的业务
				System.out.println("您选择了处理查询所有书籍的业务");
				break;
			case 2:// 处理按书籍编号查询
				System.out.println("您选择了处理按书籍编号查询");
				break;
			case 3:// 购买书籍，将书籍加入到用户的购物车中
				System.out.println("您选择了购买书籍");
				break;
			case 4:// 删除书籍，从购物车中删除书籍信息
				System.out.println("您选择了删除书籍");
				break;
			case 5:// 显示某个用户购物车中所有的书籍
				System.out.println("您选择了显示用户购物车中的书籍");
				break;
			case 6:// 退出当前应用程序
				System.out.println("您选择了退出当前应用程序，并退出应用");
				System.exit(0);
				break;
			default:
				System.out.println("您的选择不正确!!正确选项为: 1-6");
				continue;
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
}