package nuc.ss.book;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ����ʾ��
 * @author ¬��
 * @version 6.2 2019 10 31 21:40
 *
 */

public class Size2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������Ҫ�ĳ���(�Գ�Ϊ��λ):");
		
		boolean judg = false;
		
		//���ַ�����������ѭ��,������밴����ĸ�ʽ
		while(!judg) {
			try {
				double size = sc.nextDouble();
				double size2 = judge(size);
				System.out.println(size + "��" + " = " + size2 + "��");
				judg = true;
			}catch (InputMismatchException e) {
				System.out.println("����������������,����������");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("�������");
	}
	
	public static double judge(double size) throws Exception{
		if(size < 0) {
			throw new Exception("����ĳߴ�С����,����������!!");
		}
		double size1 = size / 3;
		return size1;
	}

}
