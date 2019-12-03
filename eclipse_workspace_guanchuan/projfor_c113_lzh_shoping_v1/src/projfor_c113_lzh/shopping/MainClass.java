package projfor_c113_lzh.shopping;

import java.text.MessageFormat;
import java.util.Scanner;

/**
 * 
 * ������Ҫ�������Ǹ�������Ӧ�ó��򣬲����û������˻��Ի�<br>
 * �����û���ѡ��ִ����Ӧ��ҵ����
 * 
 * @author ¬��
 * @version 1.0
 */
public class MainClass {

	private static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {

		while (true) {
			// ��ʾ�˵�
			showMenu();
			// ����ȡ�û���ѡ��Ӧ�ò������˳�Ӧ�õı����ʼ����ʾ�˵���
			int choise = getChoise();

			switch (choise) {
			case 1:// �����ѯ�����鼮��ҵ��
				System.out.println("��ѡ���˴����ѯ�����鼮��ҵ��");
				break;
			case 2:// �����鼮��Ų�ѯ
				System.out.println("��ѡ���˴����鼮��Ų�ѯ");
				break;
			case 3:// �����鼮�����鼮���뵽�û��Ĺ��ﳵ��
				System.out.println("��ѡ���˹����鼮");
				break;
			case 4:// ɾ���鼮���ӹ��ﳵ��ɾ���鼮��Ϣ
				System.out.println("��ѡ����ɾ���鼮");
				break;
			case 5:// ��ʾĳ���û����ﳵ�����е��鼮
				System.out.println("��ѡ������ʾ�û����ﳵ�е��鼮");
				break;
			case 6:// �˳���ǰӦ�ó���
				System.out.println("��ѡ�����˳���ǰӦ�ó��򣬲��˳�Ӧ��");
				System.exit(0);
				break;
			default:
				System.out.println("����ѡ����ȷ!!��ȷѡ��Ϊ: 1-6");
				continue;
			}
		}

	}
	
	/**
	 * ��ȡ�û���ѡ��
	 * 
	 * @return �û���ѡ������
	 */
	private static int getChoise() {
		
		//Ҫ���û�ѡ��˵�
		System.out.print("��ѡ��(1-6):");
		
		// ��ȡ�û����ڲ˵���ѡ��
		String value = scanner.next();
		
		// ��ʾ�û�����Ĳ˵����
		System.out.println(MessageFormat.format("��ѡ�����:{0}",value));

		try {
			return Integer.parseInt(value);
		} catch (NumberFormatException e) {
			// ת��ʧ��,���ⷵ��-1,��ʾ������Ч
			return -1;
		}
	}

	/**
	 * ��ʾ���ڿ���̨�Ĳ˵�
	 */
	private static void showMenu() {
		// ���ƿ���̨�˵�
		System.out.print("***********��Ʒ����ϵͳ*************\r\n" + 
				"1.��ѯ������Ʒ\r\n" + 
				"2.������Ʒ��Ų���ͼ��\r\n" + 
				"3.�����鼮\r\n" + 
				"4.ȡ������\r\n" + 
				"5.��ѯ�������\r\n" + 
				"6.�˳�ϵͳ\r\n" + 
				"*****************************************\r\n");
	}
}