package nuc.ss.p113lzh.t2;

import java.util.Scanner;
/**
 * ˮ�ɻ���
 * @author ¬��
 *
 */
public class DaffodilsNum {

	public static void main(String[] args) {
		System.out.println("������0~1000�ڵ����֣�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		
		while(true) {
			if(num >1000 || num < 0) {
				System.out.println("����Ĳ���0-1000�ڵ����֣�");
				sc.close();
				return;
			}
			else {
				sum = (num%10)*(num%10)*(num%10) + (num/10%10)*(num/10%10)*(num/10%10) + (num/100)*(num/100)*(num/100);
				if(sum == num) {
					System.out.println(num+"��ˮ�ɻ�����");
				}
				else {
					System.out.println(num+"����ˮ�ɻ�����");
				}
			}
			num = sc.nextInt();
		}
	}

}
