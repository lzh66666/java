package nuc.ss.test.demo2.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * ������ʾ������java.util.Calendar�������ࣩ�����ķǳ�������-������:java.util.GregorianCalendar�Ļ����÷�
 * @author dell
 *
 */
public class TestCalendar {

	public static void main(String[] args) {
		String[] weeks = {"������", "����һ", "���ڶ�", "������", "������", "������", "������"};
		
		Calendar calendar = new GregorianCalendar();
		//Calendar calendar = Calendar.getInstance();		
		
		System.out.println("��ǰʱ�䣺" + new java.util.Date());
		
		System.out.println("�꣺\t" + calendar.get(Calendar.YEAR));
		//System.out.println("�£�\t" + calendar.get(Calendar.MONTH));
		System.out.println("�£�\t" + (calendar.get(Calendar.MONTH) +1));
		System.out.println("�գ�\t" + calendar.get(Calendar.DATE));
		
		System.out.println("���ڣ�\t" + (calendar.get(Calendar.DAY_OF_WEEK)-1));
		System.out.println("���ڣ�\t" + weeks[calendar.get(Calendar.DAY_OF_WEEK)-1]);
		
		//System.out.println("ʱ��\t" + calendar.get(Calendar.HOUR));
		System.out.println("ʱ��\t" + calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�\t" + calendar.get(Calendar.MINUTE));
		System.out.println("�룺\t" + calendar.get(Calendar.SECOND));

	}

}
