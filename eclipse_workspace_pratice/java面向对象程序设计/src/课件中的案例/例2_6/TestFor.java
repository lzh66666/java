package 课件中的案例.例2_6;

import java.util.Scanner;

public class TestFor {
	public static void main(String[] args) {
		int num,sum=0;
		System.out.print("请依次输入10个整数:");
//		1 2 3 4 5 6 7 8 9 10
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("这10个数的和是:"+sum);
	}
}
