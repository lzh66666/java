package nuc.ss.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
  *   测试日期类
 * @author 卢泽华
 * @version 2019 11 02 18:38
 */
public class TestCalendar {
	public static void main(String[] args) {
		Calendar c = new GregorianCalendar();
//		c.set(2001, 1, 10, 12, 23, 34);
		c.set(Calendar.YEAR, 2001);
		c.set(Calendar.MONTH, 1);//2月
		c.set(Calendar.DATE, 10);
		Date d = c.getTime();
		System.out.println(d);
		System.out.println(c.get(Calendar.YEAR));
		
		//测试日期计算
		c.add(Calendar.YEAR, 30);
		System.out.println(c.getTime());
	}
}
