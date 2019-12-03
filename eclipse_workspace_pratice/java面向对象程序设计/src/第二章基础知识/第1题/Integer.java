package 第二章基础知识.第1题;

import java.util.Scanner;

public class Integer {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("请任意输入一个小数:");
		double numDouble = num.nextDouble();	
		int numInt = (int)(numDouble+0.5);
		System.out.println(numInt);
	}
	
	
}
