package 第七章.工厂方法模式.计算器;

import java.util.Scanner;

public class TestCalculateClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你想要进行的运算(--大小写随意O(∩_∩)O--)\n加法:add\n减法:sub\n乘法:mul\n除法:div\n...");
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
			System.out.println("该计算功能还在开发中...");
		}else {
			CalculateProduce cal = calculate.calculate(type);
			
			System.out.println("请输入两个要计算的数字大小(以空格隔开)");
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			cal.cal(a, b);	
		}
		
	}
}
