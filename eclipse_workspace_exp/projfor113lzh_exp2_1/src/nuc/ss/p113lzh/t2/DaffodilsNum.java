package nuc.ss.p113lzh.t2;

import java.util.Scanner;
/**
 * 水仙花数
 * @author 卢泽华
 *
 */
public class DaffodilsNum {

	public static void main(String[] args) {
		System.out.println("请输入0~1000内的数字！");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(true) {
			if(num >1000 || num < 0) {
				System.out.println("输入的不是0-1000内的数字！");
				sc.close();
				return;
			}
			else {
				sum = (num%10)*(num%10)*(num%10) + (num/10%10)*(num/10%10)*(num/10%10) + (num/100)*(num/100)*(num/100);
				if(sum == num) {
					System.out.println(num+"是水仙花数！");
				}
				else {
					System.out.println(num+"不是水仙花数！");
				}
			}
			num = sc.nextInt();
		}
	}

}
