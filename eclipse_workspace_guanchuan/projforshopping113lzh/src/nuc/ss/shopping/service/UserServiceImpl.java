package nuc.ss.shopping.service;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nuc.ss.shopping.dao.IUserDao;
import nuc.ss.shopping.dao.UserDaoImpl;
import nuc.ss.shopping.entiy.User;

public class UserServiceImpl implements IUserService{

	private IUserDao uDao = new UserDaoImpl();
	@Override
	public String register(User user) {
		if(useridIsValid(user.getId()) && passwordIsValid(user.getPassword())) {
			Map<String, User> users = uDao.getUsers();
			if(users.containsKey(user.getId())) {
				return "ע��ʧ��,���û�id�Ѿ�����!����������!!!";
			}else {
				uDao.addUser(user);
				return "ע��ɹ�,���¼!";
			}
		}else {
			return "�û������������ʽ����,�û���������u��ͷ,5Ϊ����;���������6~12λ���ֿ�ͷ";
		}
	}
	
	private boolean useridIsValid(String id) {
		Pattern p = Pattern.compile("^[u]\\d{5}$");
		Matcher m = p.matcher(id);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}
	
	private boolean passwordIsValid(String password) {
		Pattern p = Pattern.compile("^\\w{6,12}$");
		Matcher m = p.matcher(password);
		if(m.matches()) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public boolean login(User user) {
		Map<String, User> users = uDao.getUsers();
		if(users.containsKey(user.getId())) {
			if(users.get(user.getId()).getPassword().equals(user.getPassword())) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}

}