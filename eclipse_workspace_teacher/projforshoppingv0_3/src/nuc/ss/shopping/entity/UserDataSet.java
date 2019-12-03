package nuc.ss.shopping.entity;

public class UserDataSet {
	private static User[] users;

	public static void init() {
		users = new User[50];
		
		for(int i = 0; i < users.length; i++) {
			users[i] = null;
		}
		
		users[0] = new User("u01", "郑光荣", "123456", (byte)1, "太原");
		users[1] = new User("u02", "李欣媛", "123123", (byte)0, "北京");			
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
