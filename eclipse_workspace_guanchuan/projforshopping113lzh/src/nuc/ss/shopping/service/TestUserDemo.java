package nuc.ss.shopping.service;

import nuc.ss.shopping.entiy.User;

public class TestUserDemo {
	public static void main(String[] args) {
		IUserService us = new UserServiceImpl();
		
		//�û�ע��
		String[] userinfo = {"u00007","��ͨ�û�","pw00006","����","1","���"};
		User user = new User(userinfo);
		String resinfo = us.register(user);
		
		System.out.println(resinfo);
		
		//�û���¼
		
		if(us.login(user)) {
			System.out.println("��¼�ɹ�");
		}else {
			System.out.println("��¼ʧ��");
		}
	}
}
