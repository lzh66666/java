package nuc.ss.test;

import java.util.Date;

/**
 * 测试Date类用法
 * @author 卢泽华
 * @version 2019 11 2 12:16
 */
public class testDate {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		long t= System.currentTimeMillis();
		System.out.println(t);
		Date d2 = new Date(1000);
		System.out.println(d2.toGMTString());//不建议使用
		d2.setTime(123456);
		System.out.println(d2.getTime());
	}
}
