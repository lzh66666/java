package �ڶ��»���֪ʶ.��5��;

import java.util.Scanner;

public class Bet {
	public static void main(String[] args) {
		double a = 1000;
		double b = 0.01;
		double sum = 0;
		for (int i = 0; i < 30; i++) {
			sum += b;
			b *= 2;
		}
		if(sum > a*30) {
			System.out.println("��Ӯ��!");
		}
		else if(sum == a*30) {
			System.out.println("����ƽ��!");
		}
		else {
			System.out.println("��Ӯ��!");
		}
	}
}
