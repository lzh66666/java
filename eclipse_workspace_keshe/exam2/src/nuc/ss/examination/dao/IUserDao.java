package nuc.ss.examination.dao;

import java.util.HashMap;

import nuc.ss.examination.entry.User;

public interface IUserDao {
	/**
	 * ���ļ���ɸѡ���ϵ��û�
	 * @param account
	 * @return
	 */
	public User selectOne(String account);
	
	/**
	 * ѡ�������û�
	 * @return
	 */
	public HashMap<String, User> getAllUser();
	/**
	 * ע��һ��ѧ������Ϣ
	 * @param user
	 */
	public void register(User user);
	
	/**
	 * �û��޸��������Ϣ
	 * @param user
	 */
	public void revise(User user);
	
	/**
	 * ����Աɾ���û���Ϣ
	 * @param user
	 */
	public void remove(User user);
}
