package nuc.ss.shopping.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import nuc.ss.shopping.db.DatabaseConfig;
import nuc.ss.shopping.entiy.User;

public class UserDaoImpl implements IUserDao{

	@Override
	public Map<String, User> getUsers() {
		Map<String, User> users = new HashMap<String, User>();
		File f = new File(DatabaseConfig.USER_FILE_PATH);
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String str;
			String [] userInfo;
			User user;
			while((str = br.readLine()) != null) {
				userInfo = str.split(":");
				user = new User(userInfo);
				users.put(userInfo[0],user);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return users;
	}

	@Override
	public void addUser(User user) {
		File f = new File(DatabaseConfig.USER_FILE_PATH);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(f,true);
			bw = new BufferedWriter(fw);
			bw.write(user.toString());
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bw != null) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
