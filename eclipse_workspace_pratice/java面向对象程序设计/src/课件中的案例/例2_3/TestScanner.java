package 课件中的案例.例2_3;

import java.util.Scanner;

/**
 * 从键盘接受两个整形数据,完成这两个数据的和
 * @author 卢泽华
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("请从键盘上接受两个整数:");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("这两个数的和是:"+(num1+num2));
	}
}
