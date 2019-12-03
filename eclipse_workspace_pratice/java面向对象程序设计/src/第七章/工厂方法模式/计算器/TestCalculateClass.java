package ������.��������ģʽ.������;

import java.util.Scanner;

public class TestCalculateClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������Ҫ���е�����(--��Сд����O(��_��)O--)\n�ӷ�:add\n����:sub\n�˷�:mul\n����:div\n...");
		String type = sc.next();
		CalculateFactory calculate;
		
		if(type.equalsIgnoreCase("add")) {
			calculate = new CalculateFactoryAdd();
		}else if(type.equalsIgnoreCase("sub")){
			calculate = new CalculateFactorySub();
		}else if(type.equalsIgnoreCase("mul")) {
			calculate = new CalculateFactoryMul();
		}else if(type.equalsIgnoreCase("div")) {
			calculate = new CalculateFactoryDiv();
		}else {
			calculate = null;
		}
			
		if(calculate == null) {
			System.out.println("�ü��㹦�ܻ��ڿ�����...");
		}else {
			CalculateProduce cal = calculate.calculate(type);
			
			System.out.println("����������Ҫ��������ִ�С(�Կո����)");
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			cal.cal(a, b);	
		}
		
	}
}
