package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1WithTryCatch {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入两个整数：");

         try {
             int number1 = scanner.nextInt();
             int number2 = scanner.nextInt();
        	 int result = number1 / number2;
			 System.out.println(number1 + "/" + number2 + "=" + result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("被零除！");
		} catch (InputMismatchException e) {
			System.out.println("数据输入格式不对！应输入整数。");
		}
         scanner.close();
         System.out.println("程序结束！");
     }
}
