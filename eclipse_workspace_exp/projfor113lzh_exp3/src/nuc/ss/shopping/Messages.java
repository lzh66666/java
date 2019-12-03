package nuc.ss.shopping;

/**
 * 
 * 消息类，负责定义消息常量和消息的显示<br>
 * INFO_ : 提示消息<br>
 * QUESTION_ : 提问消息<br>
 * ERR_ : 错误消息<br>
 * WAR_ : 警告消息<br>
 * 
 * @author Frank.Chen
 * @version 3.0
 * @since JDK1.8（建议）
 */
public class Messages {
	public static final String INFO_MENU = 
			"***********商品管理系统*************\r\n" + 
			"1.查询所有商品\r\n" + 
			"2.根据商品编号查找图书\r\n" + 
			"3.购买书籍\r\n" + 
			"4.取消购买\r\n" + 
			"5.查询购买情况\r\n" + 
			"6.退出系统\r\n" + 
			"*****************************************\r\n";
	
	public static final String INFO_ADD_BOOK_SUCCESSFUL = "商品购买成功!";
	public static final String INFO_REMOVE_BOOK_SUCCESSFUL = "商品已从购物车移除!";
	public static final String INFO_INPUT_VALUE = "您选择的是:{0}";
	public static final String INFO_INPUT_MESSAGE = "您选择了：";
	
	public static final String QUESTION_CHOISE_MENU = "请选择(1-6):";
	public static final String QUESTION_ENTRY_BOOK_ID = "请输入商品的编号:";
	public static final String QUESTION_ENTRY_PERSON_ID = "请输入用户的编号:";
	
	public static final String WAR_CART_EMPTY = "购物车中没有任何的商品！";
	
	public static final String ERR_BOOK_NOT_FOUND = "商品信息不存在！";
	public static final String ERR_PERSON_NOT_FOUND = "用户信息不存在！";
	public static final String ERR_BOOK_NOT_IN_CART="没有可以删除的商品！";
	
	/**
	 * 选的内容
	 */
	public static String[] mess = {
			"处理查询所有书籍的业务",
			"处理按书籍编号查询",
			"购买书籍",
			"删除书籍",
			"显示用户购物车中的书籍",
			"退出当前应用程序，并退出应用"
	};
	
	
	/**
	 * 绘制菜单
	 */
	public static void drawMenu() {
		draw(INFO_MENU);
	}
	
	/**
	 * 按行绘制消息
	 * @param msg 需要绘制的消息
	 */
	public static void drawLine(Object msg) {
		System.out.println(msg);
	}
	
	/**
	 * 绘制消息
	 * @param msg 需要绘制的消息
	 */
	public static void draw(Object msg) {
		System.out.print(msg);
	}
	
}