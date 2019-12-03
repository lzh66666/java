package nuc.ss.p113lzh.t3;

import java.util.Scanner;
/**
 * 数组的最大最小值
 * @version
 * @author 卢泽华
 *
 */
public class Compare {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		int max = array[0];
		int min = array[0];
		
		for (int i : array) {
			if(max < i) {
				max = i;
			}
			if(min > i) {
				min = i;
			}
		}
		
		System.out.println(" 数组中的最大值为： " + max);
		System.out.println(" 数组中的最小值为： " + min);
	}

}
