package nuc.ss.shopping.service;

import nuc.ss.shopping.entity.User;

public interface UserDao {
	
	/**
	 * 
	 * ��¼��֤���ж��û����������Ƿ����
	 * 
	 * @param uid �û�����ĵ�¼�˺�
	 * @param pwd �û�����ĵ�¼����
	 * @return ��¼��Ϣ��Ч�������û����󣬷��򷵻�NULL
	 */
	public User login(String uid, String pwd);
	
	public boolean updateUser(User user);
}
