package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IUserFileWriter {
	/**
	 * ѧ��ע����Ϣ
	 * @param user
	 */
	public void addUser(User user);
	
	public void revise(User user);
	
	public void remove(User user);
}
