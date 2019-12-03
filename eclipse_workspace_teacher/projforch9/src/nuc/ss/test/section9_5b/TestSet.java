package nuc.ss.test.section9_5b;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import nuc.ss.test.section9_4.Student;

public class TestSet {

	public static void main(String[] args) {
		//����Set���󣬴���HashSet����
		Set<Student> set = new HashSet<Student>();
		//����Ԫ��
		Student s1 = new Student(18001, "������", 20);
		Student s2 = new Student(18006, "�Ŵ���", 21);
		Student s3 = new Student(18003, "�����", 19);
		Student s4 = new Student(18004, "������", 18);
		Student s5 = new Student(18003, "�����", 19);
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		
		//������ʹ��forѭ��
		System.out.println("\n��forѭ���������set������Ԫ��:");
		Object[] os = set.toArray();
		for(int i = 0; i < os.length; i++){
			System.out.println(os[i]);	
		}
		
		//������ʹ�õ�����������ʽ
		System.out.println("\n�õ������������set������Ԫ��:");
		Iterator<Student> iter = set.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//ɾ��Ԫ��
		set.remove(s2);
		
		//������ʹ����ǿforѭ��
		System.out.println("\nɾ��������,����ǿforѭ���������set������Ԫ��:");
		for(Student stu : set){
			System.out.println(stu);			
		}
	}
}