package nuc.ss.shopping.service;

import java.util.List;

import nuc.ss.shopping.entity.User;
import nuc.ss.shopping.entity.UserDataSet;

public class UserDaoImpl implements UserDao{

	@Override
	public User login(String uid, String pwd) {
		// 获取用户测试数据集
		List<User> users = UserDataSet.users;

		// 循环判断用户输入的账号和密码在测试数据集合中是否存在。
		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
			if (user.getId().equalsIgnoreCase(uid)
					&& user.getPassword().equals(pwd))
				return user;
		}

		// 无对应用户数据返回null
		return null;
	}

	@Override
	public boolean updateUser(User user) {
		// 获取用户测试数据集
		List<User> users = UserDataSet.users;
		
		for (int i = 0; i < users.size(); i++) {
			// 判断用户数据测试集合中哪个对象被更新了
			if(users.get(i).getId().equals(user.getId())) {
				// 替换（而不是新增）原始对象数据
				users.set(i, user);
				return true;
			}
		}
		return false;
	}

}
