package nuc.ss.test1_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �������ʽ����֤��
 * @author ¬��
 * @version 2019 11 24 17:07
 * 
 */
public class TestRegexIP {
	public static void main(String[] args) {
		System.out.println("������IP��ַ��");
		Scanner sc = new Scanner(System.in);
		String ip =sc.next();
		String regex = "^(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|[1-9])\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)\\."
						+ "(1\\d{2}|2[0-4]\\d|25[0-5]|[1-9]\\d|\\d)$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(ip);
		if(m.matches())
			System.out.println("IP��ַ" + ip + "��ʽ��ȷ��");
		else
			System.out.println("IP��ַ" + ip + "��ʽ����ȷ��");
	}
}