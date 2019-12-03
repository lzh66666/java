package nuc.ss.teststudent;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 *  ��map��ѧ�����б���,����,����,ɾ��
 * @author ¬��
 * @version 2019 11 25 20:09
 */
public class TestStudentMap {
	public static void main(String[] args) {
		Map<Integer, Student> map = new HashMap<Integer, Student>();
		StudentMap studentMap = new StudentMap();
		
		Scanner sc = new Scanner(System.in);
		Integer no;
		
		while (true) {
			menu();
			int choise = sc.nextInt();
			switch (choise) {
			case 1:
				studentMap.init(map);
				break;
			case 2:
				studentMap.print(map);
				break;
			case 3:
				System.out.println("��������Ҫɾ��ѧ����ѧ��:");
				no = sc.nextInt();
				if(studentMap.delete(map, no)) {
					System.out.println("ɾ���ɹ�");
				}else {
					System.out.println("û��" + no + "��ѧ��");
				}
				break;
			case 4:
				System.out.println("������Ҫ���ҵ�ѧ��ѧ��");
				no = sc.nextInt();
				if(!studentMap.search(map, no)) {
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

class StudentMap{
	/**
	 * ����ѧ����Ա
	 * @param map
	 */
	public void init(Map<Integer, Student> map) {
		Student stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student(18001, "�Ž���", 20);
		stu2 = new Student(18001, "��¡��", 18);
		stu3 = new Student(18003, "������", 19);
		stu4 = new Student(18004, "�Կ�ط", 20);
		stu5 = new Student(18005, "������", 17);
		stu6 = new Student(18001, "�Ž���", 20);

		map.put(18001, stu1);
		map.put(18002, stu2);
		map.put(18003, stu3);
		map.put(18004, stu4);
		map.put(18005, stu5);
		map.put(18001, stu6);
	}
	
	/**
	 * ������Ա
	 * @param map
	 */
	public void print(Map<Integer, Student> map) {
		Iterator<Entry<Integer, Student>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * ɾ����Ա
	 * @param map
	 * @param name
	 * @return
	 */
	public boolean delete(Map<Integer, Student> map,Integer no) {
		Iterator<Integer> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			Integer no1 = iter.next();
			if(no1.equals(no1)) {
				map.remove(no);
				return true;
			}
		}
		return false;
	}
	
	/**
	 * ���ҳ�Ա
	 * @param map
	 * @param name
	 * @return
	 */
	public boolean search(Map<Integer, Student> map,Integer no) {
		Iterator<Entry<Integer, Student>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			Entry<Integer, Student> entry = iter.next();
			if(no.equals(entry.getKey())) {
				System.out.println(entry.getValue());
				return true;
			}
		}
		return false;
	}
}