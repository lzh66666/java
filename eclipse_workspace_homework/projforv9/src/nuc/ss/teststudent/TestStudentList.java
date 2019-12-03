package nuc.ss.teststudent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *  用list对学生进行保存,遍历,查找,删除
 * @author 卢泽华
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
				System.out.println("请输入你要删除学生的姓名:");
				name = sc.next();
				if(studentlist.delete(list, name)) {
					System.out.println("删除成功");
				}else {
					System.out.println("没有" + name);
				}
				break;
			case 4:
				System.out.println("请输入要查找的学生姓名");
				name = sc.next();
				if(!studentlist.search(list, name)) {
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


class StudentList{
	/**
	 * 保存学生成员
	 * @param list
	 */
	public void init(List<Student2> list) {
		Student2 stu1,stu2,stu3,stu4,stu5,stu6;
		stu1 = new Student2(18001, "张剑飞", 20);
		stu2 = new Student2(18001, "李隆基", 18);
		stu3 = new Student2(18003, "孙正贤", 19);
		stu4 = new Student2(18004, "赵匡胤", 20);
		stu5 = new Student2(18005, "孙祥熙", 17);
		stu6 = new Student2(18001, "张剑飞", 20);

		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
	}
	
	/**
	 * 遍历成员
	 * @param list
	 */
	public void print(List<Student2> list) {
		Iterator<Student2> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	/**
	 * 删除成员
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
	 * 查找成员
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