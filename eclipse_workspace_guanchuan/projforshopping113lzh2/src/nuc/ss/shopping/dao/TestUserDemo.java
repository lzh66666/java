package nuc.ss.shopping.dao;

import java.util.Iterator;
import java.util.Map;

import nuc.ss.shopping.entiy.User;

public class TestUserDemo {
	public static void main(String[] args) {
		IUserDao ud = new UserDaoImpl();
		
		String[] userinfo1 = {"u00001","��ͨ�û�","pw00001","����","1","����"};
		String[] userinfo2 = {"u00002","��ͨ�û�","pw00002","����","0","�Ϻ�"};
		String[] userinfo3 = {"u00009","����Ա","pw00009","Ǯ��","1","����"};
		
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