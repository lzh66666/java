package nuc.ss.test.section7_5b;

class Singleton {
	private static Singleton instance = null;
	private String info = "ÀÁººµ¥ÀýÄ£Ê½";
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	
}

public class TestSingleton {
	public static void main(String[] args) {
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		System.out.println(st1 == st2);
		System.out.println(st1.getInfo());
	}
}

