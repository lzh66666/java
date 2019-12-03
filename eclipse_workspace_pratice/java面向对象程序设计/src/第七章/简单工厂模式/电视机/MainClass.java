package 第七章.简单工厂模式.电视机;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("请输入你想要生产的电视机!");
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();
		TVFactory factory = new TVFactory();
		TV tv = factory.produceTV(brand);
		if(tv != null)
			tv.play();
	}
}
