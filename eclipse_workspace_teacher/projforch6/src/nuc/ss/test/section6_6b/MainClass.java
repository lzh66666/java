package nuc.ss.test.section6_6b;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学生的学号：");
		String id = sc.next();
		System.out.println("请输入学生的姓名：");	
		String name = sc.next();
		
		boolean flag = false; // flag=false时成绩非法，需要重新输入；flag=true时成绩合法！
		while(!flag) {
			System.out.println("请输入学生的成绩：");
			float score = sc.nextFloat();
		
			Student stu;
			try {
				stu = new Student(id, name, score);
				System.out.println(stu);
				flag = true;
			} catch (ScoreOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//continue;
			}
		}
		
		sc.close();
		System.out.println("--THE END--");
	}

}
