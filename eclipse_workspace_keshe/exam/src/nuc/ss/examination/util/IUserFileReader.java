package nuc.ss.examination.util;


import java.util.HashMap;

import nuc.ss.examination.entry.User;

public interface IUserFileReader {
	/**
	 * ͨ���˺ŷ��ظ��û�
	 * @param accoun
	 * @return
	 */
	public User getUser(String account);
	
	public HashMap<String, User> getAllUser();
}
