package nuc.ss.test1_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �������ʽ����֤��
 * @author ¬��
 * @version 2019 11 24 17:02
 */
public class TestRegexId {
	public static void main(String[] args) {
		System.out.println("����������֤�ţ�");
		Scanner sc = new Scanner(System.in);
		String id =sc.next();
		//��һ��������Pattern��compile��������һ��ģʽ//����ģʽ�����Ƕ��������ʽ�ķ�װ
		Pattern p = Pattern.compile("^\\d{18}|\\d{17}X$");
		//�ڶ�����ģʽ����p����matcher�����õ�һ��ƥ��//����m
		Matcher m = p.matcher(id);
		//��������ƥ�����m����maches,�ж������Ƿ��//�������ʽƥ��
		if(m.matches())
			System.out.println("����֤" + id + "��ʽ��ȷ��");
		else
			System.out.println("����֤" + id + "��ʽ����ȷ��");
	}
}