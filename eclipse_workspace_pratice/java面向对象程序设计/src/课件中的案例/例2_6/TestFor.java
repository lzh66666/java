package �μ��еİ���.��2_6;

import java.util.Scanner;

public class TestFor {
	public static void main(String[] args) {
		int num,sum=0;
		System.out.print("����������10������:");
//		1 2 3 4 5 6 7 8 9 10
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			sum += num;
		}
		System.out.println("��10�����ĺ���:"+sum);
	}
}
