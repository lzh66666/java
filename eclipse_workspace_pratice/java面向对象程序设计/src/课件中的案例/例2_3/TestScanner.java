package �μ��еİ���.��2_3;

import java.util.Scanner;

/**
 * �Ӽ��̽���������������,������������ݵĺ�
 * @author ¬��
 *
 */
public class TestScanner {
	public static void main(String[] args) {
		int num1,num2;
		System.out.println("��Ӽ����Ͻ�����������:");
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("���������ĺ���:"+(num1+num2));
	}
}
