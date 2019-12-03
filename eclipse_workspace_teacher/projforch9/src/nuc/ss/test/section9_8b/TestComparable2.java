package nuc.ss.test.section9_8b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable2 {

	public static void main(String[] args) {
		// �Զ������������
		Student2 stu1, stu2, stu3, stu4, stu5;
		stu1 = new Student2(18001, "�Ž���", 20);
		stu2 = new Student2(18002, "��¡��", 18);
		stu3 = new Student2(18003, "������", 19);
		stu4 = new Student2(18004, "�Կ�ط", 20);
		stu5 = new Student2(18005, "������", 17);
		
		// ����1�����þ��������ܵ������ࣨ TreeSet ��������ʵ���������㷨�Ķ��󣬱߷��������
		Set<Student2> set = new TreeSet<Student2>();
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		// ʹ����ǿforѭ���������1��������
		System.out.println("���÷���1����������");
		for(Student2 stu: set) {
			System.out.println(stu);
		}
	
		// ����2������Collections�����࣬Ϊ�����е�Ԫ������
		List<Student2> list = new ArrayList<Student2>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
	
		Collections.sort(list);
		
		// ʹ����ǿforѭ���������2��������
		System.out.println("���÷���2����������");
		for(Student2 stu: list) {
			System.out.println(stu);
		}
		
	}

}

