package nuc.ss.teststudent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * ��set��ѧ�����б���,����,����,ɾ��
 * @author ¬��
 * @version 2019 11 25 19:18
 * 
 */

public class TestStudentSet {
	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<Student>();
		StudentSet studentSet = new StudentSet();
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		while (true) {
			menu();
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				studentSet.init(set);
				break;
			case 2:
				studentSet.print(set);
				break;
			case 3:
				System.out.println("��������Ҫɾ��ѧ��������:");
				name = sc.next();
				if(studentSet.delete(set, name)) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("û��" + name);
				}
				break;
			case 4:
				System.out.println("������Ҫ���ҵ�ѧ������");
				name = sc.next();
				if(!studentSet.search(set, name)) {
					System.out.println("û�и�ѧ��");
				}
				break;
			default:
				System.out.println("������: 1-4");
				continue;
			}
		}
	}
	
	private static void menu() {
		System.out.println("1.��ʼ������ѧ����Ϣ");
		System.out.println("2.����ѧ����Ϣ");
		System.out.println("3.ɾ��ѧ����Ϣ");
		System.out.println("4.����ѧ����Ϣ");
		System.out.println("���������ѡ��");
	}
}

class StudentSet{
	
	/**
	 * ����ѧ����Ա
	 * @param set
	 */
	public void init(Set<Student> set) {
		Student stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student(18001, "�Ž���", 20);
		stu2 = new Student(18001, "��¡��", 18);
		stu3 = new Student(18003, "������", 19);
		stu4 = new Student(18004, "�Կ�ط", 20);
		stu5 = new Student(18005, "������", 17);
		stu6 = new Student(18001, "�Ž���", 20);
		

		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
	}
	
	/**
	 * ������Ա
	 * @param set
	 */
	public void print(Set<Student> set) {
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * ɾ����Ա
	 * @param set
	 * @param name
	 * @return
	 */
	public boolean delete(Set<Student> set,String name) {
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			if(name.equals(student.getName())) {
				set.remove(student);
				return true;
			}
		}
		return false;
	}
	
	/**
	 *  ���ҳ�Ա
	 * @param set
	 * @param name
	 * @return
	 */
	
	public boolean search(Set<Student> set,String name) {
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			Student student = iter.next();
			if(name.equals(student.getName())) {
				System.out.println(student);
				return true;
			}
		}
		return false;
	}
}