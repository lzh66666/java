package nuc.ss.test.demo3.random;

import java.util.Scanner;

public class TestMathRandom {

	public static void main(String[] args) {
		// ʹ��Math.random()���Բ���һ��0.0��1.0��������1.0��֮������double��ֵ��
		System.out.println("0-1.0(����1.0��֮����������" + Math.random()); 
		// ����0-9֮����������
		System.out.println("0-9֮����������" + (int)(Math.random()*10));
		// ����59-100֮����������
		System.out.println("59-100֮����������" + (int)(59 + Math.random()*42));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������Ŀ���������Χ��������������С��󣬿ո�������");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("[" + num1 + ", " + num2 + "]��Χ�ڵ��������" + (num1 + (int)(Math.random()*(num2-num1+1))));
		
		sc.close();
	}

}
