package ����������.��3��;

import java.util.Scanner;

public class Candidate {
	public static void main(String[] args) {
		System.out.println("�����뾺ѡ�˵������͵�Ʊ��(��:���� 5):");
		/*���� 18
		���� 16
		���� 14
		���� 12
		¬ 20*/
		Scanner candidate = new Scanner(System.in);
		String[] name = new String[5];
		int[] ticket = new int[5];
		int sum = 0;
		for (int i = 0; i < ticket.length; i++) {
			name[i] = candidate.next();
			ticket[i] = candidate.nextInt();
			sum += ticket[i];
		}
		int max = ticket[0];
		int j = 0;
		for (int i = 0; i < ticket.length; i++) {
			System.out.println("��ѡ������:"+name[i]+"---->��Ʊ��:"+ticket[i]+"---->��Ʊ���ٷֱ�:"+100.0*ticket[i]/sum+"%");
			if(max < ticket[i]) {
				j = i;
			}
		}
		System.out.println("�ôλ�ʤ�ߵ�һ��Ϊ---->"+name[j]);
	}
}
