package 第二章基础知识.第4题;

import java.util.Scanner;

public class Guess { 
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("请输入两个数:");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int sum = num1+num2;
		System.out.println("请输入猜测两个数的和:");
		int numGuess = num.nextInt();
		if(sum == numGuess) {
			System.out.println("恭喜你答对了哈哈哈哈");
		}
		else {
			System.out.println("再接再厉,正确答案是:"+sum);
		}
	}
}
