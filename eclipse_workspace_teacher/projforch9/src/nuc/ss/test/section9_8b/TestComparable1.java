package nuc.ss.test.section9_8b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable1 {

	public static void main(String[] args) {
		// �ַ�������
		String str1 = new String("CHINA");
		String str2 = new String("USA");
		String str3 = "Japan";
		String str4 = "Italy";
		String str5 = new String("India");
		
		// ����1�����þ��������ܵ������ࣨ TreeSet��������ʵ���������㷨�Ķ��󣬱߷��������
		Set<String> set = new TreeSet<String>();
		set.add(str1);
		set.add(str2);
		set.add(str3);
		set.add(str4);
		set.add(str5);
		
		// ������ͨforѭ���������1��������
		System.out.println("���÷���1����������");
		Object[] o = set.toArray();
		for(int i = 0; i < o.length; i++) {
			System.out.println(o[i]);
		}
	
		// ����2������Collections�����࣬Ϊ�����е�Ԫ������
		List<String> list = new ArrayList<String>();
		
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		list.add(str5);
	
		Collections.sort(list);
		
		// ʹ����ͨforѭ���������2��������
		System.out.println("���÷���2����������");
		Object[] o2 = list.toArray();
		for(int i = 0; i < o2.length; i++) {
			System.out.println(o2[i]);
		}	
	}
}
