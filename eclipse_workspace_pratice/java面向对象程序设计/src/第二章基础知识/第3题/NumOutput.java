package �ڶ��»���֪ʶ.��3��;

import java.util.Scanner;

public class NumOutput {
	public static void main(String[] args) {
		System.out.println("������һ��С��:");
		Scanner num = new Scanner(System.in);
		double numDouble = num.nextDouble();
		int numInt = (int)numDouble;
		System.out.printf("%d %f",numInt,numDouble-numInt);
	}

}
