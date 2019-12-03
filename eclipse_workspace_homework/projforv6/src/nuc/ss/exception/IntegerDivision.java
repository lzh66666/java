package nuc.ss.exception;

import java.util.Scanner;

public class IntegerDivision {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("����������������");
        
        boolean judge = false;
        
        while(!judge) {
	        try {
		       	 String number1 = scanner.next();
		       	 String number2 = scanner.next();
		   		 int result = (Integer.parseInt(number1)) / (Integer.parseInt(number2));
		   		 System.out.println(number1 + "/" + number2 + " = " + result);
		   		 judge = true;
		   	 } catch(ArithmeticException e) {
		   		 System.out.println("��0���ˣ�����������!!!");
		   	 } catch(NumberFormatException e) {
		   		 System.out.println("���ݸ�ʽ���ԣ�Ӧ����������������������!!!");
		   	 }  
		}	
        scanner.close();
	}   	 
}
