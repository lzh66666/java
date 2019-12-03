package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("请输入两个整数：");

    	 try {
        	 int number1 = scanner.nextInt();
        	 int number2 = scanner.nextInt();
    		 int result = number1 / number2;
    		 System.out.println(number1 + "/" + number2 + 
        		                 "=" + result);
    	 } catch(ArithmeticException e) {
    		 System.out.println("被0除了！"); 
    	 } catch(InputMismatchException e) {
    		 System.out.println("数据格式不对，应该输入整数！"); 
    	 }
    	 
         scanner.close();
     }
}
