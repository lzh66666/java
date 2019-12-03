package nuc.ss.test.section6_3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("����������������");

    	 try {
        	 int number1 = scanner.nextInt();
        	 int number2 = scanner.nextInt();
    		 int result = number1 / number2;
    		 System.out.println(number1 + "/" + number2 + 
        		                 "=" + result);
    	 } catch(ArithmeticException e) {
    		 System.out.println("��0���ˣ�"); 
    	 } catch(InputMismatchException e) {
    		 System.out.println("���ݸ�ʽ���ԣ�Ӧ������������"); 
    	 }
    	 
         scanner.close();
     }
}
