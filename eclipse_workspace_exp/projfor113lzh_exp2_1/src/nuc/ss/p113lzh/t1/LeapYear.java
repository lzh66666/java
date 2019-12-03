package nuc.ss.p113lzh.t1;

import java.util.Scanner;
/**
 * 闰年
 * @author 卢泽华
 *
 */
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		while(true) {
			if(year > 3000 || year <2000) {
				System.out.println("请输入2000~3000内的年数!");
				sc.close();
				return;
			}
			else {
				if((year%4 == 0 && year%100 != 0) || year%400 == 0) {
					System.out.println(year+"年是闰年");
				}
				else {
					System.out.println(year+"年不是闰年");
				}
				year = sc.nextInt();
			}
		}
			
	}
	
}
