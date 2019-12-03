package 课本上的案例.例2_5;

import java.util.Scanner;

/**
 * 使用if嵌套语句实现分段显示上课时间
 * @author 卢泽华
 *
 */
public class TimeTable {
	public static void main(String[] args) {
		char group;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your group(A,B,C)");
		group = sc.next().charAt(0);
		if(group == 'A') {
			System.out.println("8:00 a.m");
		}
		else {
			if(group == 'B') {
				System.out.println("10:00 a.m");
			}
			else {
				if(group == 'C') {
					System.out.println("1:00 p.m");
				}
				else {
					System.out.println("没有这个时段");
				}
			}
		}
		
	}
}
