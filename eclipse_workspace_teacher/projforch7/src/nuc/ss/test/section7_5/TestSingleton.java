package nuc.ss.test.section7_5;

class Singleton {
	private static Singleton instance = null;  //静态私有成员变量
	//私有构造函数
	private Singleton() {	
	}
	//静态公有工厂方法，返回唯一实例
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
        }	
		
		return instance;
	}
}

public class TestSingleton {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		System.out.println(st1 == st2);
		
	}
}

