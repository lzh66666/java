package ������.����ģʽ.ʾ��;

/**
 * ����ģʽ
 * @author ¬��
 *
 */
public class Singleton2 {
	private static Singleton2 instance=new Singleton2();  //��̬˽�г�Ա����
	String string;
	//˽�й��캯��
	private Singleton2() {	
	}
	 //��̬���й�������������Ψһʵ��
	public static Singleton2 getInstance() {
		return instance;
	}
}
