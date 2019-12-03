package cn.lu01;

/**
 * ��ǰ������
 * @author ¬��
 *
 */

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {
	public static void main(String[] args) {
//		��õ�ǰ���º���
		LocalDate date=LocalDate.now();
		int month=date.getMonthValue();
		int today=date.getDayOfMonth();
		
		date=date.minusDays(today-1);//һ���µĿ�ʼ
		DayOfWeek weekday=date.getDayOfWeek();
		int value=weekday.getValue();//1=Monday,...7=Sunday
		
		System.out.println("Sun Mon Tue Wed Thu Fri Sat");
//		�����ĵ�һ����������
		for (int i = 1; i < value; i++) {
			System.out.print("     ");
		}
		while(date.getMonthValue()==month) {
			System.out.printf("%3d",date.getDayOfMonth());
			if(date.getDayOfMonth()==today) {
				System.out.print("*");//���ڵĵ���
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
