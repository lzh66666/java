package nuc.ss.p113lzh.t3;

import java.util.Scanner;
/**
 * ����������Сֵ
 * @version
 * @author ¬��
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
		
		System.out.println(" �����е����ֵΪ�� " + max);
		System.out.println(" �����е���СֵΪ�� " + min);
	}

}
