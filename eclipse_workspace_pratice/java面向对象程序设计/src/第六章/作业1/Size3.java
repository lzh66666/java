package ������.��ҵ1;

import java.util.Scanner;
/**
 * �ߴ�ת��
 * @author ¬��
 * @version 6.3 2019 11 1 17:30
 *
 */
public class Size3 {
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
			}catch (MyException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				System.out.println("����ߴ����еĲ�����������,����������");
			}
		}
		
		sc.close();
		System.out.println("�������");
	}
	
	public static double judge(double size) throws MyException{
		if(size < 0) {
			throw new MyException("����ĳߴ���С�����,����������!!");
		}
		double size1 = size / 3;
		return size1;
	}

}
