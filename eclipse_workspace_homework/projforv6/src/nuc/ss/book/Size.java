package nuc.ss.book;

import java.util.Scanner;

/**
 * �ߴ�ת��
 * @author ¬��
 * @version 6.1 2019 10 31 22:00
 *
 */

public class Size {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��(5��)����Ҫ�ĳ���(�Գ�Ϊ��λ,�Կո����):");
		double [] a = new double[5];
		double [] b = new double[5];
		
		boolean judg = false;
		
		while(!judg) {
			try {
				for (int i = 0; i < a.length; i++) {
					b[i] = Double.parseDouble(sc.next());
					a[i] = judge(b[i]);
				}
				for (int i = 0; i < a.length; i++) {
					System.out.println(b[i] + "��" + " = " + a[i] + "��");
				}
				judg = true;
			}catch (NumberFormatException e) {
				System.out.println("����ߴ����еĲ�����������,����������");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		sc.close();
		System.out.println("�������");
	}
	
	public static double judge(double size) throws Exception{
		if(size < 0) {
			throw new Exception("����ĳߴ���С�����,����������!!");
		}
		double size1 = size / 3;
		return size1;
	}

}
