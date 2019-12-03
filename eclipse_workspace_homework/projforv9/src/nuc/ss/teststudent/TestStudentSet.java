package nuc.ss.teststudent;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**
 * 用set对学生进行保存,遍历,查找,删除
 * @author 卢泽华
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
				System.out.println("请输入你要删除学生的姓名:");
				name = sc.next();
				if(studentSet.delete(set, name)) {
					System.out.println("删除成功");
				}else {
					System.out.println("没有" + name);
				}
				break;
			case 4:
				System.out.println("请输入要查找的学生姓名");
				name = sc.next();
				if(!studentSet.search(set, name)) {
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

class StudentSet{
	
	/**
	 * 保存学生成员
	 * @param set
	 */
	public void init(Set<Student> set) {
		Student stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student(18001, "张剑飞", 20);
		stu2 = new Student(18001, "李隆基", 18);
		stu3 = new Student(18003, "孙正贤", 19);
		stu4 = new Student(18004, "赵匡胤", 20);
		stu5 = new Student(18005, "孙祥熙", 17);
		stu6 = new Student(18001, "张剑飞", 20);
		

		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
	}
	
	/**
	 * 遍历成员
	 * @param set
	 */
	public void print(Set<Student> set) {
		Iterator<Student> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * 删除成员
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
	 *  查找成员
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
