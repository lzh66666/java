package �μ��еİ���.��2_5;

import java.util.Scanner;

/**
 * ����ÿ������������ʵ����
 * @author ¬��
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		String season;
		System.out.println("��Ӽ��̽���һ��������(Ӣ��)");
		Scanner sc = new Scanner(System.in);
		season = sc.next();
		switch(season) {
			case "spring":
				System.out.println("���ֵļ���!");
				break;
			case "summer":
				System.out.println("�����ƽ��ļ���!");
				break;
			case "autumn":
				System.out.println("�ջ��ļ���!");
				break;
			case "winter":
				System.out.println("��ѩ�����ļ���!");
				break;
			default:
				System.out.println("��ȷ��������Ǽ���ô?");
		}
	}
}
