package ������.�򵥹���ģʽ.���ӻ�;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("����������Ҫ�����ĵ��ӻ�!");
		Scanner sc = new Scanner(System.in);
		String brand = sc.next();
		TVFactory factory = new TVFactory();
		TV tv = factory.produceTV(brand);
		if(tv != null)
			tv.play();
	}
}
