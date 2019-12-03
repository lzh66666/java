package nuc.ss.test.section6_3;

import java.util.Scanner;
import java.io.*;

class TestException2WithThrows {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String filename = scanner.nextLine();
		Scanner inputFromFile = new Scanner(new File(filename));
		int number1 = inputFromFile.nextInt();
		int number2 = inputFromFile.nextInt();
		int result = number1 / number2;
		System.out.println(number1 + "/" + number2 + "=" + result);
		inputFromFile.close();
		
		scanner.close();
	}
}
