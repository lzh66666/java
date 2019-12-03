package 课本上的案例.例2_4;

import java.util.Scanner;
/**
 * 字符串输入实例
 * @author 卢泽华
 *
 */
public class StringTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age;
		System.out.println("what is your name?");
		name = sc.next();
		System.out.println("What is your age?");
		age = sc.nextInt();
		System.out.println("Hello "+name);
		System.out.println("when I was your age I was"+(age+1));
	}
}
