package nuc.ss.test;

/**
 * �����Զ�װ����Զ�����
 * @author ¬��
 * @version 2019 11 2 12:00
 *
 */
public class Test02 {
	public static void main(String[] args) {
//		Integer a = new Integer(1000);
		Integer a = 1000;//jdk5.0֮��,�Զ�װ��,���������������ɴ���  Integer a = new Integer(1000);
//		Integer b = null;
		Integer b = 2000;
		
		int c = b;//�Զ�����,�������Ľ�:b.intValue();
		System.out.println(c);
		
		Integer d = 1234;
		Integer d2 = 1234;
		System.out.println(d == d2);
		System.out.println(d.equals(d2));
		
		System.out.println("######################");
		Integer d3 = 123;	//Ϊ�����Ч��,[-128,127]֮�������Ȼ�ᱻ����������������������
		Integer d4 = 123;
		System.out.println(d3 == d4);
		System.out.println(d3.equals(d4));
	}
}
