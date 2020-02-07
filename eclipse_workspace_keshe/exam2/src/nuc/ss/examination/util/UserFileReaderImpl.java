package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

public class UserFileReaderImpl implements IUserFileReader {
	// static修饰，是为了保证这个集合是唯一的
	private static HashMap<String, User> userBox = new HashMap<>();
	
	{
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(DatabaseConfig.USER_FILE_PATH));
			String message = reader.readLine();
			while (message != null) {
				String[] values = message.split("-");
				String name = values[0];
				String id = values[1];
				String account = values[2];
				String password = values[3];
				String type = values[4];
				userBox.put(account, new User(name, id, account, password, type));
				message = reader.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public User getUser(String accoun) {
		return userBox.get(accoun);
	}

	@Override
	public HashMap<String, User> getAllUser() {
		return userBox;
	}

}