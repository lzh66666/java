package �μ��еİ���.��2_11;

import java.util.Scanner;

/**
 * ��������ѧ����ѧ�ڸ��Ź��εĳɼ�,�������ƽ����
 * @author ¬��
 *
 */
public class TestArray {
	public static void main(String[] args) {
		float[] score = new float[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ѧ�ڸ��Ź��εĳɼ�:");
		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextFloat();
		}
		float sum = 0,aver;
		for (float i : score) {
			sum += i;
		}
		aver = sum/score.length;
		System.out.println("ƽ���ɼ�Ϊ:"+aver);
	}
}
