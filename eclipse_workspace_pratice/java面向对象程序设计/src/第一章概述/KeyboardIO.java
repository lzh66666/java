package ��һ�¸���;

import java.util.Scanner;

/**
 * ����1.7�����ϰ��2С��
 * @author ¬��
 *
 */
public class KeyboardIO {
	public static void main(String[] args) {
		//���²��ֽ���java.util.Scanner���ȡ���̵��������
		Scanner sc =  new Scanner(System.in);
		System.out.println("����������:");
		String s = sc.nextLine();
		System.out.println("���:");
		float h = sc.nextFloat();
		System.out.println("����:");
		float age = sc.nextInt();
		System.out.println("������Ϣ����:");
		System.out.println("����:"+s+"  ���:"+h+"  ����:"+age);
	}
}
