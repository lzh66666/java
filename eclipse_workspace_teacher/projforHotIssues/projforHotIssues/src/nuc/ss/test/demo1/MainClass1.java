package nuc.ss.test.demo1;

import java.util.Scanner;

public class MainClass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������һ���ַ����������ո񣩣�");
		String s1 = sc.next();
		sc.nextLine();
		System.out.println(s1);
		
		System.out.println("������һ���ַ��������԰����ո񣩣�");
		String s2 = sc.nextLine();
		System.out.println(s2);
		
		System.out.println("������һ��������");
		int number = sc.nextInt();
		System.out.println(number);
		
		sc.close();
	}

}


