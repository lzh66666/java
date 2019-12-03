package nuc.ss.test.section6_5;

import java.util.Scanner;
import java.io.*;

public class TestException3 {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String filename = scanner.nextLine();
		Scanner inputFromFile = new Scanner(new File(filename));
		int number1 = inputFromFile.nextInt();
		int number2 = inputFromFile.nextInt();
		int result;
		try {
			result = div(number1, number2);
			System.out.println(number1 + "/" + number2 + "=" + result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		inputFromFile.close();
		scanner.close();
	}
	
    private static int div(int n1, int n2) throws Exception {
    	if (n2 == 0) {
    		//throw new ArithmeticException("被0除啦！");
    		ArithmeticException ae = new ArithmeticException("被0除啦！");
    		throw ae;
    	}
    	int q = n1 / n2;
    	return q;
    }
}
