package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class TestException2 {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������ļ�����");
		String filename = scanner.nextLine();
		Scanner inputFromFile = null;
		try {
			inputFromFile = new Scanner(new File(filename));
			int number1 = inputFromFile.nextInt();
			int number2 = inputFromFile.nextInt();
			int result = number1 / number2;
			System.out.println(number1 + "/" + number2 + 
					     "=" + result);
			inputFromFile.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ���" + filename + "�����ڣ�");
		} catch(ArithmeticException e) {
   		 System.out.println("��0���ˣ�"); 
		} catch(InputMismatchException e) {
   		 System.out.println("���ݸ�ʽ���ԣ�Ӧ������������"); 
		}

		scanner.close();
		System.out.println("end��");
	}
}
