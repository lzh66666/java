package nuc.ss.teststudent;

import java.util.HashMap;
import java.util.Iterator;

import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

/**
 *  用map对学生进行保存,遍历,查找,删除
 * @author 卢泽华
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
				System.out.println("请输入你要删除学生的学号:");
				no = sc.nextInt();
				if(studentMap.delete(map, no)) {
					System.out.println("删除成功");
				}else {
					System.out.println("没有" + no + "的学生");
				}
				break;
			case 4:
				System.out.println("请输入要查找的学生学号");
				no = sc.nextInt();
				if(!studentMap.search(map, no)) {
					System.out.println("没有该学生");
				}
				break;
			default:
				System.out.println("请输入: 1-4");
				continue;
			}
		}
	}
	
	private static void menu() {
		System.out.println("1.初始化增加学生信息");
		System.out.println("2.遍历学生信息");
		System.out.println("3.删除学生信息");
		System.out.println("4.查找学生信息");
		System.out.println("请输入你的选择");
	}
}

class StudentMap{
	/**
	 * 保存学生成员
	 * @param map
	 */
	public void init(Map<Integer, Student> map) {
		Student stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student(18001, "张剑飞", 20);
		stu2 = new Student(18001, "李隆基", 18);
		stu3 = new Student(18003, "孙正贤", 19);
		stu4 = new Student(18004, "赵匡胤", 20);
		stu5 = new Student(18005, "孙祥熙", 17);
		stu6 = new Student(18001, "张剑飞", 20);

		map.put(18001, stu1);
		map.put(18002, stu2);
		map.put(18003, stu3);
		map.put(18004, stu4);
		map.put(18005, stu5);
		map.put(18001, stu6);
	}
	
	/**
	 * 遍历成员
	 * @param map
	 */
	public void print(Map<Integer, Student> map) {
		Iterator<Entry<Integer, Student>> iter = map.entrySet().iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * 删除成员
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
	 * 查找成员
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
