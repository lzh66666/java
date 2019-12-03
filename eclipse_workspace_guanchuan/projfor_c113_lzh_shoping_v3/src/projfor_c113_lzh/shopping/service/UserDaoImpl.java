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
	 * ��ѯ���е��û���Ϣ
	 * 
	 * @return ���е��û���Ϣ
	 */
	
	
	@Override
	public User[] queryAllUsers() {
		// TODO Auto-generated method stub
		return userr.getUsers();
	}
	
	/**
	 * �����û���Ų�ѯ�û�����ϸ��Ϣ
	 * 
	 * @param id �û����
	 * @return �û�����ϸ��Ϣ
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
	 * �û���¼
	 * 
	 * @param id �û����
	 * @param password �û���¼����
	 * @return ����¼�ɹ����򷵻��û����󣻷��򷵻�null
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
	 * �û�ע��
	 * 
	 * @param user User����
	 * @return ��ע��ɹ����򷵻�true�����򷵻�false
	 */
	@Override
	public boolean register(User user) {
		// TODO Auto-generated method stub
		User [] users = null;
		try {
			users = userr.getUsers();
			for (User user1 : users) {
				if(user1.getId().equals(user.getId())) {
					System.out.println("������ı���Ѵ���");
					return false;
				}
			}
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
		return true;
		
			
	}
		
}
