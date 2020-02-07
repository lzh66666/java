package nuc.ss.examination.service;

import nuc.ss.examination.entry.User;

public interface IUserService {
	/**
	 * 登录
	 * @param account
	 * @param password
	 * @return
	 */
	public String login(User user);
	
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public String register(User user);
	
	/**
	 * 修改密码等信息
	 * @param user
	 * @return
	 */
	public String revise(User user);
	
	/**
	 * 管理员删除用户等信息
	 * @param user
	 * @return
	 */
	public String remove(User user);
	
}
