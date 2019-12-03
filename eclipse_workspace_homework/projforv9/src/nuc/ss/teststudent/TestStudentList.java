package nuc.ss.teststudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *  ��list��ѧ�����б���,����,����,ɾ��
 * @author ¬��
 * @version 2019 1125 19:50
 */
public class TestStudentList {
	public static void main(String[] args) {
		List<Student2> list = new ArrayList<Student2>();
		StudentList studentlist = new StudentList();
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		while (true) {
			menu();
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				studentlist.init(list);
				break;
			case 2:
				studentlist.print(list);
				break;
			case 3:
				System.out.println("��������Ҫɾ��ѧ��������:");
				name = sc.next();
				if(studentlist.delete(list, name)) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("û��" + name);
				}
				break;
			case 4:
				System.out.println("������Ҫ���ҵ�ѧ������");
				name = sc.next();
				if(!studentlist.search(list, name)) {
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


class StudentList{
	/**
	 * ����ѧ����Ա
	 * @param list
	 */
	public void init(List<Student2> list) {
		Student2 stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student2(18001, "�Ž���", 20);
		stu2 = new Student2(18001, "��¡��", 18);
		stu3 = new Student2(18003, "������", 19);
		stu4 = new Student2(18004, "�Կ�ط", 20);
		stu5 = new Student2(18005, "������", 17);
		stu6 = new Student2(18001, "�Ž���", 20);

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
	}
	
	/**
	 * ������Ա
	 * @param list
	 */
	public void print(List<Student2> list) {
		Iterator<Student2> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * ɾ����Ա
	 * @param list
	 * @param name
	 * @return
	 */
	public boolean delete(List<Student2> list,String name) {
		Iterator<Student2> iter = list.iterator();
		while(iter.hasNext()) {
			Student2 student = iter.next();
			if(name.equals(student.getName())) {
				list.remove(student);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ���ҳ�Ա
	 * @param list
	 * @param name
	 * @return
	 */
	public boolean search(List<Student2> list,String name) {
		Iterator<Student2> iter = list.iterator();
		while(iter.hasNext()) {
			Student2 student = iter.next();
			if(name.equals(student.getName())) {
				System.out.println(student);
				return true;
			}
		}
		return false;
	}
}