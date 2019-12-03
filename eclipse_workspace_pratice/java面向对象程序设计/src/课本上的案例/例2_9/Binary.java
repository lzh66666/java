package 课本上的案例.例2_9;

import java.util.Scanner;

/**
 * 进制转换
 * @author 卢泽华
 *
 */
public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;//待转换的十进制数
		int v = 1;//当前2的幂次方
		n = sc.nextInt();
		while(v <= n/2) {
			v *= 2;
		}
		while(v > 0) {
			if(n < v) {
				System.out.print(0);
			}
			else {
				System.out.print(1);
				n -= v;
			}
			v /= 2;
		}
	}
}
