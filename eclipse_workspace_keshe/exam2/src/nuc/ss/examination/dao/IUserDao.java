package nuc.ss.examination.dao;

import java.util.HashMap;

import nuc.ss.examination.entry.User;

public interface IUserDao {
	/**
	 * 从文件里筛选符合的用户
	 * @param account
	 * @return
	 */
	public User selectOne(String account);
	
	/**
	 * 选择所有用户
	 * @return
	 */
	public HashMap<String, User> getAllUser();
	/**
	 * 注册一个学生的信息
	 * @param user
	 */
	public void register(User user);
	
	/**
	 * 用户修改密码等信息
	 * @param user
	 */
	public void revise(User user);
	
	/**
	 * 管理员删除用户信息
	 * @param user
	 */
	public void remove(User user);
}
