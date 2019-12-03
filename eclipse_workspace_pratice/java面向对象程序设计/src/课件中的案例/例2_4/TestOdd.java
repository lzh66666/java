package 课件中的案例.例2_4;

import java.util.Scanner;

/**
 * 判断函数的奇偶性
 * @author 卢泽华
 *
 */
public class TestOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("从键盘上接受一个整数:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num+"是偶数! ");
		}
		else {
			System.out.println(num+"是奇数! ");
		}
	}
}
