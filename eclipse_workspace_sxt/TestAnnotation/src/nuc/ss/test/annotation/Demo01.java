package nuc.ss.test.annotation;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	
	@Override//方法的重写
	public String toString() {
		return "";
	}
	
	@Deprecated//不建议使用
	public static void test01() {
		// TODO Auto-generated method stub
		System.out.println("test01");
	}
	
	@SuppressWarnings("all")
	public static void test02() {
		List list = new ArrayList();
		List list2 = new ArrayList();
		List list3 = new ArrayList();
	}
	
	public static void main(String[] args) {
		test01();
	}
}
