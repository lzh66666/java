package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.User;

public interface UserDao {
	
	/**
	 * 
	 * 登录验证，判断用户名与密码是否存在
	 * 
	 * @param uid 用户输入的登录账号
	 * @param pwd 用户输入的登录密码
	 * @return 登录信息有效：返回用户对象，否则返回NULL
	 */
	public User login(String uid, String pwd);
	
	public boolean updateUser(User user);
}
