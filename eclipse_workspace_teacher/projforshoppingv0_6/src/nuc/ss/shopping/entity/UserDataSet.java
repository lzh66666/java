package nuc.ss.shopping.entity;

import java.util.ArrayList;
import java.util.List;

public class UserDataSet {
	
	/* 用户测试数据集 */
	public static List<User> users = null;
	
	/* 静态块会在静态函数前初始化集合 */
	static {
		users = new ArrayList<User>();
		users.add(new User("u01","何俗","123",(byte)1,"上海"));
		users.add(new User("u02","徐东强","456",(byte)1,"北京"));
		users.add(new User("u03","左曦","789",(byte)1,"广州"));
		users.add(new User("u04","王晓龙","123",(byte)1,null));
		users.add(new User("u05","冀凯","456",(byte)1,"安徽"));
		users.add(new User("u06","杜晓雨","789",(byte)1,null));
	}
}
