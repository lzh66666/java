package nuc.ss.shopping.entity;

import java.util.ArrayList;
import java.util.List;

public class UserDataSet {
	
	/* �û��������ݼ� */
	public static List<User> users = null;
	
	/* ��̬����ھ�̬����ǰ��ʼ������ */
	static {
		users = new ArrayList<User>();
		users.add(new User("u01","����","123",(byte)1,"�Ϻ�"));
		users.add(new User("u02","�춫ǿ","456",(byte)1,"����"));
		users.add(new User("u03","����","789",(byte)1,"����"));
		users.add(new User("u04","������","123",(byte)1,null));
		users.add(new User("u05","����","456",(byte)1,"����"));
		users.add(new User("u06","������","789",(byte)1,null));
	}
}
