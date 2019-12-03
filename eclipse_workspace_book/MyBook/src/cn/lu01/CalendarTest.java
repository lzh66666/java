package cn.lu01;

/**
 * 当前日历表
 * @author 卢泽华
 *
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
	public static void main(String[] args) {
//		获得当前的月和日
		LocalDate date=LocalDate.now();
		int month=date.getMonthValue();
		int today=date.getDayOfMonth();
		
		date=date.minusDays(today-1);//一个月的开始
		DayOfWeek weekday=date.getDayOfWeek();
		int value=weekday.getValue();//1=Monday,...7=Sunday
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
//		日历的第一行是缩进的
		for (int i = 1; i < value; i++) {
			System.out.print("     ");
		}
		while(date.getMonthValue()==month) {
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth()==today) {
				System.out.print("*");//日期的当天
			}else {
				System.out.print(" ");
			}
			date=date.plusDays(1);
			if(date.getDayOfWeek().getValue()==7)
				System.out.println();
		}
		if(date.getDayOfWeek().getValue()!=7)
			System.out.println();
	}
}
