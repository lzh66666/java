package 第七章.工厂方法模式.电视机;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("请输入你想要生产的电视机!");
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
			System.out.println("该品牌电视机正在开发中...");
		}
	}
}
