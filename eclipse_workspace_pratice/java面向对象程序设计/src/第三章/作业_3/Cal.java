package ������.��ҵ_3;

import java.util.Scanner;

/**
 * ��������ʵ��+-/*
 * @author ¬��
 *
 */

public class Cal {
	public static void main(String[] args) {
		System.out.println("�������������ļӼ��˳�����(��3 + 8,ע��ո������):");
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		char b = sc.next().charAt(0);
		double c = sc.nextDouble();
		Operation(a,b,c);
	}
	public static void Operation(double a,char b,double c) {
		double result = 0.0;
		switch(b) {
			case '+':
				result=a+c;
				break;
			case '-':
				result=a-c;
				break;
			case '*':
				result=a*c;
				break;
			case '/':
				if(c != 0)
					result=a/c;
				else
					System.out.println("��������������Ϊ0");
				break;
		}
		if(b != '/' && c != 0) {
			System.out.println(result);
		}
	}
}
