package nuc.ss.examination.service;

import nuc.ss.examination.dao.IUserDao;
import nuc.ss.examination.dao.UserDaoImpl;
import nuc.ss.examination.entry.User;

public class UserServiceImpl  implements IUserService {
	// 包含一个dao对象作为属性
	private IUserDao dao = new UserDaoImpl();

	// 设计一个方法 负责登录
	public String login(User user) {
		User lUser = dao.selectOne(user.getAccount());
		if (lUser != null) {
			if (user.getType().equals(" 学 生")) {
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "学生" + lUser.getName() + "登录成功";
					}
				}
			} else if (user.getType().equals(" 老 师")) {
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "老师" + lUser.getName() + "登录成功";
					}
				}
			} else {// 管理员
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "管理员" + lUser.getName() + "登录成功";
					}
				}
			}
		}
		return null;
	}

	@Override
	public String register(User user) {
		User rUser = dao.selectOne(user.getAccount());
		if (rUser != null) {
			return null;
		} else {
			dao.register(user);
			return "注册成功";
		}
	}

	@Override
	public String revise(User user) {
		if(user != null) {
			dao.revise(user);
			return "保存成功";
		}
		else {
			return null;
		}
		
	}

	@Override
	public String remove(User user) {
		if(user != null) {
			dao.remove(user);
			return "删除成功";
		}
		return null;
	}
}
