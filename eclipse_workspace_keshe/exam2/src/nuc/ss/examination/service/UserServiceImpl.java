package nuc.ss.examination.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		
		if(useridIsValid(user.getAccount()) && passwordIsValid(user.getPassword())) {
			User rUser = dao.selectOne(user.getAccount());
			if (rUser != null) {
				return null;
			} else {
				dao.register(user);
				return "注册成功";
			}
		}else {
			return "用户名或密码格式不对，用户名必须由字母组成；密码必须是5~12位，以字母开头";
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
	
	private boolean useridIsValid(String id) {
		Pattern p = Pattern.compile("^[A-Za-z]+$");
		Matcher m = p.matcher(id);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean passwordIsValid(String password) {
		Pattern p = Pattern.compile("^[a-zA-Z]\\w{4,11}$");
		Matcher m = p.matcher(password);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
}
