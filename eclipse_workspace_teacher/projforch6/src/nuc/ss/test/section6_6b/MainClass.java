package nuc.ss.test.section6_6b;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ����ѧ�ţ�");
		String id = sc.next();
		System.out.println("������ѧ����������");	
		String name = sc.next();
		
		boolean flag = false; // flag=falseʱ�ɼ��Ƿ�����Ҫ�������룻flag=trueʱ�ɼ��Ϸ���
		while(!flag) {
			System.out.println("������ѧ���ĳɼ���");
			float score = sc.nextFloat();
		
			Student stu;
			try {
				stu = new Student(id, name, score);
				System.out.println(stu);
				flag = true;
			} catch (ScoreOutOfBoundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
				//continue;
			}
		}
		
		sc.close();
		System.out.println("--THE END--");
	}

}
