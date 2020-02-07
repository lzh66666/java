package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IUserFileWriter {
	/**
	 * 学生注册信息
	 * @param user
	 */
	public void addUser(User user);
	
	public void revise(User user);
	
	public void remove(User user);
}
