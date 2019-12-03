package nuc.ss.shopping.service;

import java.util.List;

import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(String uid, String pwd) {
		// ��ȡ�û��������ݼ�
		List<User> users = UserDataSet.users;

		// ѭ���ж��û�������˺ź������ڲ������ݼ������Ƿ���ڡ�
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getId().equalsIgnoreCase(uid)
					&& user.getPassword().equals(pwd))
				return user;
		}

		// �޶�Ӧ�û����ݷ���null
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// ��ȡ�û��������ݼ�
		List<User> users = UserDataSet.users;
		
		for (int i = 0; i < users.size(); i++) {
			// �ж��û����ݲ��Լ������ĸ����󱻸�����
			if(users.get(i).getId().equals(user.getId())) {
				// �滻��������������ԭʼ��������
				users.set(i, user);
				return true;
			}
		}
		return false;
	}

}
