package 第一章概述;

import java.util.Scanner;

/**
 * 例题1.7编程练习第2小题
 * @author 卢泽华
 *
 */
public class KeyboardIO {
	public static void main(String[] args) {
		//以下部分借用java.util.Scanner类获取键盘的输入输出
		Scanner sc =  new Scanner(System.in);
		System.out.println("请输入姓名:");
		String s = sc.nextLine();
		System.out.println("身高:");
		float h = sc.nextFloat();
		System.out.println("年龄:");
		float age = sc.nextInt();
		System.out.println("个人信息如下:");
		System.out.println("姓名:"+s+"  身高:"+h+"  年龄:"+age);
	}
}
