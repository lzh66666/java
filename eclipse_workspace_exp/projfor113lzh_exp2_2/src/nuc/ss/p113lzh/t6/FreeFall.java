package nuc.ss.p113lzh.t6;

import java.util.Scanner;
/**
 * ��������
 * @author ¬��
 *
 */
public class FreeFall {
	public static void main(String[] args) {
		System.out.println("�����뵯��������");
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.close();
		int height = 10000;
		for (int i = 1; i <= c; i++) {
			height /= 2;
			if(height == 0) {
				System.out.println("��"+i+"�η�����,�������");
				break;
			}
		}
		if(height > 0) {
			System.out.println(c+"�η�����,��ǰ����ĸ߶���: "+height);
		}
	}
}
