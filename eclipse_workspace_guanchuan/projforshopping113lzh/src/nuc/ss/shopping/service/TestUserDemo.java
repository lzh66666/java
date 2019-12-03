package nuc.ss.shopping.service;

import nuc.ss.shopping.entiy.User;

public class TestUserDemo {
	public static void main(String[] args) {
		IUserService us = new UserServiceImpl();
		
		//用户注册
		String[] userinfo = {"u00007","普通用户","pw00006","马六","1","天津"};
		User user = new User(userinfo);
		String resinfo = us.register(user);
		
		System.out.println(resinfo);
		
		//用户登录
		
		if(us.login(user)) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}
}
