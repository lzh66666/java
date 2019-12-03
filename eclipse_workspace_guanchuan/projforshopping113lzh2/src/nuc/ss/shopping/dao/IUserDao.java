package nuc.ss.shopping.dao;

import java.util.Map;

import nuc.ss.shopping.entiy.User;

public interface IUserDao {
	public Map<String, User> getUsers();
	
	public void addUser(User u);
}
