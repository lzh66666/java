package nuc.ss.shopping.service;

import nuc.ss.shopping.entiy.User;

public interface IUserService {
	public String register(User user);
	
	public boolean login(User user);
}