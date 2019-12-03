package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;

class TestException2 {
	public static void main(String[] args)  {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
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
			System.out.println("文件：" + filename + "不存在！");
		} catch(ArithmeticException e) {
   		 System.out.println("被0除了！"); 
		} catch(InputMismatchException e) {
   		 System.out.println("数据格式不对，应该输入整数！"); 
		}

		scanner.close();
		System.out.println("end！");
	}
}
