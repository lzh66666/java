package nuc.ss.test.demo3.random;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		// ʹ��java.util.Random����Բ���һ�� int��long��double��float��boolean�����ֵ��
		// ����һ��random����ʱ������ָ��һ�����ӻ�ʹ��Ĭ�ϵ����ӡ��޲ι��췽��ʹ�õ�ǰ�Ѿ���ȥ��ʱ����Ϊ���ӡ�
		// �������random����ʹ������ͬ�����ӣ���ô���ǽ�������ͬ��������С�������ԣ�������ͬ������У���������Ե�Ӧ���к����á�
		Random random1 = new Random(3);
		System.out.print("�������1��");
		for (int i = 0; i < 10; i++) {
			System.out.print(random1.nextInt(100) + " ");
		}

		System.out.println();
		
		Random random2 = new Random(3);
		System.out.print("�������2��");
		for (int i = 0; i < 10; i++) {
			System.out.print(random2.nextInt(100) + " ");
		}
		
		System.out.println();
		
		Random random3 = new Random(5);
		System.out.print("�������3��");
		for (int i = 0; i < 10; i++) {
			System.out.print(random3.nextInt(100) + " ");
		}
		
		System.out.println();
		
		Random random4 = new Random();
		System.out.print("�������4��");
		for (int i = 0; i < 10; i++) {
			System.out.print(random4.nextInt(100) + " ");
		}		
		
	}

}
