package nuc.ss.test.section6_3;

import java.util.Scanner;

public class TestException1WithIf {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("����������������");
         int number1 = scanner.nextInt();
         int number2 = scanner.nextInt();
         if (number2 != 0) {
             int result = number1 / number2;
             System.out.println(number1 + "/" + number2 + "=" + result);        	 
         }
         else {
        	 System.out.println("��������Ϊ0!");
         }
         scanner.close();
         System.out.println("�������!");
     }
}
