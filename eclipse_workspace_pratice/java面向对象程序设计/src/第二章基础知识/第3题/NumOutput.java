package 第二章基础知识.第3题;

import java.util.Scanner;

public class NumOutput {
	public static void main(String[] args) {
		System.out.println("请输入一个小数:");
		Scanner num = new Scanner(System.in);
		double numDouble = num.nextDouble();
		int numInt = (int)numDouble;
		System.out.printf("%d %f",numInt,numDouble-numInt);
	}

}
