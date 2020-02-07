package nuc.ss.examination.service;

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
		User rUser = dao.selectOne(user.getAccount());
		if (rUser != null) {
			return null;
		} else {
			dao.register(user);
			return "ע��ɹ�";
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
}
