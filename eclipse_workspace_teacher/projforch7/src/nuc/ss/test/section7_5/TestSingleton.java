package nuc.ss.test.section7_5;

class Singleton {
	private static Singleton instance = null;  //��̬˽�г�Ա����
	//˽�й��캯��
	private Singleton() {	
	}
	//��̬���й�������������Ψһʵ��
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

