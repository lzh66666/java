package cn.sxt.lu;

import cn.sxt.oo.User;//表示导入了User类
//import cn.sxt.oo.*;//表示导入了cn.sxt.oo的所有类，会降低编译速度
import java.util.Date;
import java.sql.*;//包里也有Date类

import static java.lang.Math.*;//静态导入

public class Test {
	public static void main(String[] args) {
		User1 user1=new User1();//同目录可以直接用
//		User user=new User();//当未引入User类时，错误
//		cn.sxt.oo.User user=new cn.sxt.oo.User();
		User user=new User();//引入User类
		String str;
		
		java.util.Date date=new java.util.Date();//重名时直接写原路径
		System.out.println(PI);//静态导入直接用
	}
}
