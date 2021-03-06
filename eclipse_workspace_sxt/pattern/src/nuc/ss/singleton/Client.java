package nuc.ss.singleton;

public class Client {
	public static void main(String[] args) {
		SingletonDemo1 s1 = SingletonDemo1.getinstance();
		SingletonDemo1 s11 = SingletonDemo1.getinstance();
		System.out.println(s1);
		System.out.println(s11);
		System.out.println("############################");
		
		SingletonDemo2 s2 = SingletonDemo2.getinstance();
		SingletonDemo2 s22 = SingletonDemo2.getinstance();
		System.out.println(s2);
		System.out.println(s22);
		System.out.println("############################");
		
		SingletonDemo3 s3 = SingletonDemo3.getInstance();
		SingletonDemo3 s33 = SingletonDemo3.getInstance();
		System.out.println(s3);
		System.out.println(s33);
		System.out.println("############################");
		
		SingletonDemo4 s4 = SingletonDemo4.getInstance();
		SingletonDemo4 s44 = SingletonDemo4.getInstance();
		System.out.println(s4);
		System.out.println(s44);
		System.out.println("############################");
		
		SingletonDemo5 s5 = SingletonDemo5.INSTANCE;
		SingletonDemo5 s55 = SingletonDemo5.INSTANCE;
		System.out.println(s5 == s55);
	}
}
