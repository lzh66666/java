package nuc.ss.test.section6_3;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) throws Exception {
		System.out.println("main() bejin... ");
		System.out.println("������һ����������");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		method1(k);
		System.out.println("main() end! ");	
	}

	private static void method1(int n) throws Exception {
		System.out.println("method1() bejin... ");
		method2(n);
		System.out.println("method1() end! ");
	}
	
	private static void method2(int n) throws Exception {
		System.out.println("method2() bejin... ");
		method3(n);
		System.out.println("method2() end! ");
	}

	private static void method3(int n) throws Exception {
		System.out.println("method3() bejin... ");
		if (n <= 0) throw new Exception("�����쳣�ˣ�n = " + n);
		System.out.println("method3() end! ");
	}

}
