package nuc.ss.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
  *  ����DateFormat
 * @author ¬�� 
 *  @version 2019 11 2 18:00
 *
 */
public class TestDateFormat {
	public static void main(String[] args) {
//		DateFormat df = new SimpleDateFormat("yyyy��MM��dd��");//������
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss ���ڱ���ĵ�w��  ���ڱ��µĵ�W��");
		
		Date d = new Date(1234561234568L);
		String str = df.format(d);//��ʱ��ת��Ϊ�ַ���
		System.out.println(str);
		
		System.out.println("########################");
		
		String str2 = "2019-11-02 18:26:30";
		
		DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		try {
			Date d2 = df2.parse(str2);
			System.out.println(d2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("����ĸ�ʽ��ƥ��!!!");
		}
	}
}
