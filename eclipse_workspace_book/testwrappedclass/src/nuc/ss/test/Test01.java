package nuc.ss.test;

/**
 * 测试包装类的基本用法
 * @author 卢泽华
 *@version 2019 11 2 11:12
 */

public class Test01 {
	public static void main(String[] args) {
		Integer i = new Integer(1000);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toHexString(i));
		Integer i2 = Integer.parseInt("234");
		Integer i3 = new Integer("234");
		System.out.println(i2 + 10);
		System.out.println(i3);
		System.out.println(i2.intValue());
	}
}
