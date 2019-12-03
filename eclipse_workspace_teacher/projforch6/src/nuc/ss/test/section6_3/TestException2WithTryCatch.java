package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class TestException2WithTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String filename = scanner.nextLine();
		Scanner inputFromFile = null;
		
		try {
			inputFromFile = new Scanner(new File(filename));
			int number1 = inputFromFile.nextInt();
			int number2 = inputFromFile.nextInt();
			int result = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + result);
			inputFromFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("�ļ���" + filename + "δ�ҵ���");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("�������");
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("�������ݸ�ʽ���ԣ�Ӧ������������");
		}
/*		try {
			inputFromFile = new Scanner(new File(filename));
			int number1 = inputFromFile.nextInt();
			int number2 = inputFromFile.nextInt();
			int result = number1 / number2;
			System.out.println(number1 + "/" + number2 + "=" + result);
			inputFromFile.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�����쳣�����쳣���ͣ�" + e.getMessage());
		} */
		
		scanner.close();
	}
}
