package �α��ϵİ���.��2_6;

import java.util.Scanner;

/**
 * ʹ��switch������ֶ���ʾ����.�۲���������������
 * @author ¬��
 *
 */
public class TimeTable {
	public static void main(String[] args) {
		char group;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your group (A,B,C)");
		
		group = sc.next().charAt(0);
		switch(group) {
			case'A':
				System.out.println("8:00 a.m");
				break;
			case 'B':
				System.out.println("10:00 a.m");
				break;
			case 'C':
				System.out.println("1:00 p.m");
				break;
			default:
				System.out.println("û�����ʱ���");
		}
	}
}
