package nuc.ss.examination.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nuc.ss.examination.dao.IUserDao;
import nuc.ss.examination.dao.UserDaoImpl;
import nuc.ss.examination.entry.User;

public class UserServiceImpl  implements IUserService {
	// ����һ��dao������Ϊ����
	private IUserDao dao = new UserDaoImpl();

	// ���һ������ �����¼
	public String login(User user) {
		User lUser = dao.selectOne(user.getAccount());
		if (lUser != null) {
			if (user.getType().equals(" ѧ ��")) {
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "ѧ��" + lUser.getName() + "��¼�ɹ�";
					}
				}
			} else if (user.getType().equals(" �� ʦ")) {
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "��ʦ" + lUser.getName() + "��¼�ɹ�";
					}
				}
			} else {// ����Ա
				if (user.getType().equals(lUser.getType())) {
					if (user.getPassword().equals(lUser.getPassword())) {
						return "����Ա" + lUser.getName() + "��¼�ɹ�";
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
				return "ע��ɹ�";
			}
		}else {
			return "�û����������ʽ���ԣ��û�����������ĸ��ɣ����������5~12λ������ĸ��ͷ";
		}
		
	}

	@Override
	public String revise(User user) {
		if(user != null) {
			dao.revise(user);
			return "����ɹ�";
		}
		else {
			return null;
		}
		
	}

	@Override
	public String remove(User user) {
		if(user != null) {
			dao.remove(user);
			return "ɾ���ɹ�";
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
