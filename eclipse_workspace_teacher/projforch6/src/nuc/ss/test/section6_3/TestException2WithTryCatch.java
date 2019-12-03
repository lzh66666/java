package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class TestException2WithTryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
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
			System.out.println("文件：" + filename + "未找到！");
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("被零除！");
		} catch (InputMismatchException e) {
			// TODO Auto-generated catch block
			System.out.println("输入数据格式不对！应该输入整数。");
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
			System.out.println("发生异常啦！异常类型：" + e.getMessage());
		} */
		
		scanner.close();
	}
}
