package ������.����ģʽ.ʾ��;

/**
 * ����ģʽ
 * @author ¬��
 *
 */
public class Singleton {
	private static Singleton instance=null;  //��̬˽�г�Ա����
	//˽�й��캯��
	private Singleton() {	
	}
	 //��̬���й�������������Ψһʵ��
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}	
		return instance;
	}
	
}
