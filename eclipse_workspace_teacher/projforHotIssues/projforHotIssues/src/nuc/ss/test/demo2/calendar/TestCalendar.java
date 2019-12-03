package nuc.ss.test.demo2.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 此类演示日历类java.util.Calendar（抽象类）和它的非抽象子类-公历类:java.util.GregorianCalendar的基本用法
 * @author dell
 *
 */
public class TestCalendar {

	public static void main(String[] args) {
		String[] weeks = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
		
		Calendar calendar = new GregorianCalendar();
		//Calendar calendar = Calendar.getInstance();		
		
		System.out.println("当前时间：" + new java.util.Date());
		
		System.out.println("年：\t" + calendar.get(Calendar.YEAR));
		//System.out.println("月：\t" + calendar.get(Calendar.MONTH));
		System.out.println("月：\t" + (calendar.get(Calendar.MONTH) +1));
		System.out.println("日：\t" + calendar.get(Calendar.DATE));
		
		System.out.println("星期：\t" + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("星期：\t" + weeks[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		
		//System.out.println("时：\t" + calendar.get(Calendar.HOUR));
		System.out.println("时：\t" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("分：\t" + calendar.get(Calendar.MINUTE));
		System.out.println("秒：\t" + calendar.get(Calendar.SECOND));

	}

}
