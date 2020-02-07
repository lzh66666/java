package nuc.ss.examination.dao;

import java.util.HashMap;

import nuc.ss.examination.entry.User;
import nuc.ss.examination.util.IUserFileReader;
import nuc.ss.examination.util.IUserFileWriter;
import nuc.ss.examination.util.UserFileReaderImpl;
import nuc.ss.examination.util.UserFileWriterImpl;

public class UserDaoImpl implements IUserDao{
	
	IUserFileReader userFileReader = new UserFileReaderImpl();
	IUserFileWriter userFileWriter = new UserFileWriterImpl();
	
	@Override
	public User selectOne(String account){
		return userFileReader.getUser(account);
	}
	

	@Override
	public HashMap<String, User> getAllUser() {
		return userFileReader.getAllUser();
	}

	@Override
	public void register(User user) {
		userFileWriter.addUser(user);
	}

	@Override
	public void revise(User user) {
		userFileWriter.revise(user);
	}

	@Override
	public void remove(User user) {
		userFileWriter.remove(user);
	}

}
