package �ڶ��»���֪ʶ.��4��;

import java.util.Scanner;

public class Guess { 
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("������������:");
		int num1 = num.nextInt();
		int num2 = num.nextInt();
		int sum = num1+num2;
		System.out.println("������²��������ĺ�:");
		int numGuess = num.nextInt();
		if(sum == numGuess) {
			System.out.println("��ϲ�����˹�������");
		}
		else {
			System.out.println("�ٽ�����,��ȷ����:"+sum);
		}
	}
}
