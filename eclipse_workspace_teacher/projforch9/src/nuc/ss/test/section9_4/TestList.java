package nuc.ss.test.section9_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		//����������list��ʹ��ArrayList�ࣨ�ײ���ö�̬����洢Ԫ�أ�
		List<Student> list = new ArrayList<Student>(); //ʹ�÷���

		// ���Ԫ��
		Student s1 = new Student(18001, "������", 20);
		Student s2 = new Student(18006, "�Ŵ���", 21);
		Student s3 = new Student(18003, "�����", 19);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(new Student(18008, "�����", 26));
		
		//�滻Ԫ��
		Student s4 = new Student(18009, "�罡��", 22);
		list.set(2, s4);
		
		//��������forѭ��ʵ�ֶ�List��Ԫ�صı���		
		System.out.println("\n����forѭ��ʵ�ֶ�List��Ԫ�صı���");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));	
		}
		
		//ɾ��Ԫ��
		list.remove(1);
		
		//����������ǿforѭ��
		System.out.println("\nɾ�������� 1 �Ķ��������ǿfor����List��Ԫ��");
		for(Student stu : list){
			System.out.println(stu);
		}	
		
		//������ʹ�õ�����������ʽ		
		System.out.println("\n���õ�����ʵ�ֶ�List��Ԫ�صı���");
		
	}
}
