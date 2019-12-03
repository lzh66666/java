package nuc.ss.test.section6_5d;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入学生的学号：");
		String id = sc.next();
		System.out.println("请输入学生的姓名：");	
		String name = sc.next();
		System.out.println("请输入学生的成绩：");
		float score = sc.nextFloat();
		
		sc.close();
		
		Student stu;
		try {
			stu = new Student(id, name, score);
			System.out.println(stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
