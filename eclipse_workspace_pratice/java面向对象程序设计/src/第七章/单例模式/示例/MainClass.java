package 第七章.单例模式.示例;

public class MainClass {
	public static void main(String[] args) {
		//懒汉模式
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = Singleton.getInstance();
		
		System.out.println((singleton == singleton1));
		
		//饿汉模式
		Singleton2 singleton2 = Singleton2.getInstance();
		Singleton2 singleton3 = singleton2.getInstance();
		
		System.out.println(singleton2 == singleton3);
		
	}
}
