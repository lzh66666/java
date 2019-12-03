package nuc.ss.shopping.dao;

import java.util.Iterator;
import java.util.Map;

import nuc.ss.shopping.entiy.User;

public class TestUserDemo {
	public static void main(String[] args) {
		IUserDao ud = new UserDaoImpl();
		
		String[] userinfo1 = {"u00001","普通用户","pw00001","张三","1","北京"};
		String[] userinfo2 = {"u00002","普通用户","pw00002","李四","0","上海"};
		String[] userinfo3 = {"u00009","管理员","pw00009","钱九","1","北京"};
		
		ud.addUser(new User(userinfo1));
		ud.addUser(new User(userinfo2));
		ud.addUser(new User(userinfo3));
		
		Map<String, User> users = ud.getUsers();
		
		Iterator<User> iter = users.values().iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
