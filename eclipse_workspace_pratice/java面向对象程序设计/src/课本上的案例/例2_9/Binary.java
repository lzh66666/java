package �α��ϵİ���.��2_9;

import java.util.Scanner;

/**
 * ����ת��
 * @author ¬��
 *
 */
public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;//��ת����ʮ������
		int v = 1;//��ǰ2���ݴη�
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
