package �μ��еİ���.��2_4;

import java.util.Scanner;

/**
 * �жϺ�������ż��
 * @author ¬��
 *
 */
public class TestOdd {
	public static void main(String[] args) {
		int num;
		System.out.println("�Ӽ����Ͻ���һ������:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if(num%2 == 0) {
			System.out.println(num+"��ż��! ");
		}
		else {
			System.out.println(num+"������! ");
		}
	}
}
