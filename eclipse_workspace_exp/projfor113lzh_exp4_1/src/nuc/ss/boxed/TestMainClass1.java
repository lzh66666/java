package nuc.ss.boxed;

import java.util.Scanner;

public class TestMainClass1 {
	public static void main(String[] args) {
		Box [] boxs = new Box[10];
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("请输入一个立方体最大的长宽和高:");
		double length = sc.nextDouble();
		double width = sc.nextDouble();
		double height = sc.nextDouble();
		
		System.out.println("请输入一个递减的倍数:");
		double b = sc.nextDouble();
		sc.close();
		
		for (int i = 0; i < boxs.length; i++) {
			boxs[i] = new Box(height,length,width);
			
			length *= b;
			width *= b;
			height *= b;
		}
		
		System.out.println("输出结果为");
		for (int i = 0; i < boxs.length; i++) {
			System.out.printf("%.1f*%.1f*%.1f=%.1f\n",boxs[i].getLength(),boxs[i].getWidth(),boxs[i].getHeight(),boxs[i].volum());
		}
	}
	
}
