package nuc.ss.p113lzh.t4;

import java.util.Scanner;
/**
 * ��������
 * @author ¬��
 *
 */
public class ListNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[]  array = new int[5];
		for (int i = 0; i < array.length; i++) {
			System.out.println("�������" + (i+1) + "�����֣����س�");
			array[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println("����֮�������Ϊ��");
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
}
