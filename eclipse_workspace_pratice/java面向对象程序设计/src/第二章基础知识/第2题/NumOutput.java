package �ڶ��»���֪ʶ.��2��;

import java.util.Scanner;

public class NumOutput {
	public static void main(String[] args) {
		System.out.println("������һ����λ����:");
		Scanner num = new Scanner(System.in);
		int numInt = num.nextInt();
		System.out.println(numInt/1000);
		System.out.println(numInt/100%10);
		System.out.println(numInt/10%10);
		System.out.println(numInt%10);
	}
}
