package nuc.ss.test.annotation;

import java.util.ArrayList;
import java.util.List;

public class Demo01 {
	
	@Override//��������д
	public String toString() {
		return "";
	}
	
	@Deprecated//������ʹ��
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
