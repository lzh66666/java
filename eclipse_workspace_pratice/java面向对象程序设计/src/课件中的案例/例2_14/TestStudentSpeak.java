package �μ��еİ���.��2_14;

import java.util.Scanner;

/**
 * �ۺϰ���
 * @author ¬��
 *
 */
public class TestStudentSpeak {
	public static void main(String[] args) {
		Scanner student = new Scanner(System.in);
		System.out.println("��������������Ա�͸��Ź��εĳɼ�:");
		System.out.println("����:");
		String name = student.next();
		
		Sex sex;
		System.out.println("�Ա�(0������,1����Ů):");
		int s = student.nextInt();
		if(s == 0) {
			sex = Sex.��;
		}
		else {
			sex = Sex.Ů;
		}
		
		double[] score = new double[4];
		System.out.println("����:");
		score[0] = student.nextDouble();
		System.out.println("�ߴ�:");
		score[1] = student.nextDouble();
		System.out.println("C����:");
		score[2] = student.nextDouble();
		System.out.println("˼��Ʒ������:");
		score[3] = student.nextDouble();
		
		System.out.println("�ҵ����ֽ�"+name+"��"+sex+",����ѧ��ͨ��Ŭ��,ȡ���˺óɼ�,���Ź��εĳɼ�����:����"
		+score[0]+",�ߴ�"+score[1]+",C����"+score[2]+",˼��Ʒ������"+score[3]+"��");
	}
}

enum Sex{
	��,Ů
}
