package 第一章概述;

import java.util.Scanner;

/**
 * 编程练习3中第3小题
 * @author 卢泽华
 *
 */
public class Study {
	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		System.out.println("请输入同学的专业:");
		String major = student.nextLine();
		System.out.println("请输入同学的姓名:");
		String name = student.nextLine();
		System.out.println("欢迎"+major+"专业的"+name+"同学开始学习面向对象程序设计");
	}
}
