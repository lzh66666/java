package nuc.ss.examination.service;

import nuc.ss.examination.entry.User;

public interface IUserService {
	/**
	 * ��¼
	 * @param account
	 * @param password
	 * @return
	 */
	public String login(User user);
	
	/**
	 * ע��
	 * @param user
	 * @return
	 */
	public String register(User user);
	
	/**
	 * �޸��������Ϣ
	 * @param user
	 * @return
	 */
	public String revise(User user);
	
	/**
	 * ����Աɾ���û�����Ϣ
	 * @param user
	 * @return
	 */
	public String remove(User user);
	
}
