package projfor_c113_lzh.shopping.service;

import projfor_c113_lzh.shopping.entity.User;
import projfor_c113_lzh.shopping.entity.UserDataSet;

public class UserDaoImpl implements UserDao{
	private UserDataSet userr;
	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
		userr = new UserDataSet();
	}
	/**
	 * 查询所有的用户信息
	 * 
	 * @return 所有的用户信息
	 */
	
	
	@Override
	public User[] queryAllUsers() {
		// TODO Auto-generated method stub
		return userr.getUsers();
	}
	
	/**
	 * 根据用户编号查询用户的详细信息
	 * 
	 * @param id 用户编号
	 * @return 用户的详细信息
	 */
	@Override
	public User queryUserById(String id) {
		// TODO Auto-generated method stub
		User [] users = userr.getUsers();
		for (User user : users) {
			if(user.getId().equals(id)) {
				return user;
			}
		}
		return null;
	}
	
	/**
	 * 用户登录
	 * 
	 * @param id 用户编号
	 * @param password 用户登录密码
	 * @return 若登录成功，则返回用户对象；否则返回null
	 */
	@Override
	public User login(String id, String password) {
		// TODO Auto-generated method stub
		try {
			User [] users = userr.getUsers();
			for (User user : users) {
				if(user.getId().equals(id)) {
					return user;
				}
			}	
		} catch (NullPointerException e) {
		}
		return null;
	}
	
	/**
	 * 用户注册
	 * 
	 * @param user User对象
	 * @return 若注册成功，则返回true，否则返回false
	 */
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		User [] users = null;
		try {
			users = userr.getUsers();
			for (User user1 : users) {
				if(user1.getId().equals(user.getId())) {
					System.out.println("您输入的编号已存在");
					return false;
				}
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		return true;
		
			
	}
		
}
