package 第三章.作业_3;

import java.util.Scanner;

/**
 * 计算器的实现+-/*
 * @author 卢泽华
 *
 */

public class Cal {
	public static void main(String[] args) {
		System.out.println("请输入两个数的加减乘除运算(如3 + 8,注意空格的输入):");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		char b = sc.next().charAt(0);
		double c = sc.nextDouble();
		Operation(a,b,c);
	}
	public static void Operation(double a,char b,double c) {
		double result = 0.0;
		switch(b) {
			case '+':
				result=a+c;
				break;
			case '-':
				result=a-c;
				break;
			case '*':
				result=a*c;
				break;
			case '/':
				if(c != 0)
					result=a/c;
				else
					System.out.println("输入错误除数不能为0");
				break;
		}
		if(b != '/' && c != 0) {
			System.out.println(result);
		}
	}
}
