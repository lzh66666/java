package nuc.ss.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * ���ӻ���������
 * @author ¬��
 * @version 2019 11 02 19:13
 *
 */
public class VisualCalendar2 {
	public static void main(String[] args) {
		System.out.println("����������: (��ʽΪ: ��-��-��)");
		Scanner scanner = new Scanner(System.in);
		
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String temp;
		
		boolean judge = false;
		while(!judge) {
			try {
				temp = scanner.nextLine();
				Date date = format.parse(temp);
				Calendar calendar = new GregorianCalendar();
				calendar.setTime(date);
				int day = calendar.get(Calendar.DATE);
				calendar.set(Calendar.DATE,1);
			
				int maxDate = calendar.getActualMaximum(Calendar.DATE);
				
				System.out.println("��\tһ\t��\t��\t��\t��\t��");
					
				for (int i = 1; i < calendar.get(Calendar.DAY_OF_WEEK); i++) {
					System.out.print("\t");
				}
				
				for (int i = 1; i <= maxDate; i++) {
					if(i == day) {
						System.out.print("*");
					}
					System.out.print(i + "\t");
					int w = calendar.get(Calendar.DAY_OF_WEEK);
					if(w == Calendar.SATURDAY) {
						System.out.println();
					}
					calendar.add(Calendar.DATE, 1);
				}
				judge = true;
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("����ĸ�ʽ����,���������룡����");
			}
		}
	}
}
