package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

public class UserFileWriterImpl implements IUserFileWriter{
	public void addUser(User user) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.USER_FILE_PATH, true));
			writer.write(user.toString());
			writer.newLine();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	@Override
	public void revise(User user) {
		IUserFileReader userFileReader = new UserFileReaderImpl();
		HashMap<String, User> users = userFileReader.getAllUser();
		StringBuffer stringBuffer = new StringBuffer();
		BufferedWriter writer = null;
		
		Iterator<Entry<String, User>> iter = users.entrySet().iterator();
		
		try {
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.USER_FILE_PATH));
			while(iter.hasNext()) {
				Entry<String, User> entry = iter.next();
				if(user.getAccount().equals(entry.getValue().getAccount())) {
					stringBuffer.append(user.getName() + "-" + user.getId() + "-" + 
				     user.getAccount() + "-" + user.getPassword() + "-" + user.getType() + "\n");
				}else {
					stringBuffer.append(entry.getValue().getName() + "-" + entry.getValue().getId() + "-" + 
							entry.getValue().getAccount() + "-" + entry.getValue().getPassword() + "-" + entry.getValue().getType() + "\n");
				}
			}
			writer.write(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Override
	public void remove(User user) {
		File f = new File(DatabaseConfig.USER_FILE_PATH);
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer buff = new StringBuffer();
		
		try {
			br = new BufferedReader(new FileReader(f));
			for (String str = br.readLine(); str != null; str = br.readLine()) {
				String [] strr = str.split("-");
				if (strr[2].equals(user.getAccount()));
				else {
					buff.append(str+ "\r\n");
				}
			}
			fw = new FileWriter(f);
			bw = new BufferedWriter(fw);
			bw.write(buff.toString());
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
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
