package nuc.ss.p113lzh.t1;

import java.util.Scanner;
/**
 * ����
 * @author ¬��
 *
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		while(true) {
			if(year > 3000 || year <2000) {
				System.out.println("������2000~3000�ڵ�����!");
				sc.close();
				return;
			}
			else {
				if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
					System.out.println(year+"��������");
				}
				else {
					System.out.println(year+"�겻������");
				}
				year = sc.nextInt();
			}
		}
			
	}
	
}
