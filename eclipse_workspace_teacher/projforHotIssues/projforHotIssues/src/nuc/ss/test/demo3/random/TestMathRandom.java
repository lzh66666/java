package nuc.ss.test.demo3.random;

import java.util.Scanner;

public class TestMathRandom {

	public static void main(String[] args) {
		// 使用Math.random()可以产生一个0.0到1.0（不包括1.0）之间的随机double型值。
		System.out.println("0-1.0(不含1.0）之间的随机数：" + Math.random()); 
		// 产生0-9之间的随机整数
		System.out.println("0-9之间的随机数：" + (int)(Math.random()*10));
		// 产生59-100之间的随机整数
		System.out.println("59-100之间的随机数：" + (int)(59 + Math.random()*42));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入代表目标随机数范围的两个整数（先小后大，空格间隔）：");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("[" + num1 + ", " + num2 + "]范围内的随机数：" + (num1 + (int)(Math.random()*(num2-num1+1))));
		
		sc.close();
	}

}
