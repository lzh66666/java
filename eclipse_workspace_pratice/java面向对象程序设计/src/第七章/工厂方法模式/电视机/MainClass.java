package ������.��������ģʽ.���ӻ�;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("����������Ҫ�����ĵ��ӻ�!");
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();
		
		TVFactory factory;
		TV tv;
		
		if(brand.equalsIgnoreCase("haier")) {
			factory = new HaierTVFactory();
			tv = factory.produceTV(brand);
			tv.play();
		}
		
		else if(brand.equals("hisense")) {
			factory = new HisenseTVFactory();
			tv = factory.produceTV(brand);
			tv.play();	
		}else {
			System.out.println("��Ʒ�Ƶ��ӻ����ڿ�����...");
		}
	}
}
