package ������.����ģʽ.ʾ��;

public class MainClass {
	public static void main(String[] args) {
		//����ģʽ
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		
		System.out.println((singleton == singleton1));
		
		//����ģʽ
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton3 = singleton2.getInstance();
		
		System.out.println(singleton2 == singleton3);
		
	}
}
