package nuc.ss.p113lzh.t6;

import java.util.Scanner;
/**
 * 自由落体
 * @author 卢泽华
 *
 */
public class FreeFall {
	public static void main(String[] args) {
		System.out.println("请输入弹跳次数：");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		int height = 10000;
		for (int i = 1; i <= c; i++) {
			height /= 2;
			if(height == 0) {
				System.out.println("第"+i+"次反弹后,球体落地");
				break;
			}
		}
		if(height > 0) {
			System.out.println(c+"次反弹后,当前球体的高度是: "+height);
		}
	}
}
