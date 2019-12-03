package nuc.ss.shopping.entity;

public class UserDataSet {
	private static User[] users;

	public static void init() {
		users = new User[50];
		
		for(int i = 0; i < users.length; i++) {
			users[i] = null;
		}
		
		users[0] = new User("u01", "֣����", "123456", (byte)1, "̫ԭ");
		users[1] = new User("u02", "������", "123123", (byte)0, "����");			
	}
	
	public static boolean addUser(User user) {
		int i;
		for (i = 0; i < users.length; i++) {
			if (users[i] == null) break;
		}
		if (i < users.length) {
			try {
				users[i] = (User)user.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			return true;
		} else {
			return false;
		}
		
	}

	public static User[] getUsers() {
		return users;
	}
	
}
