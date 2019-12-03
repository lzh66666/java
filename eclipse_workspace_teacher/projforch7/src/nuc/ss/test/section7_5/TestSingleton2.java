package nuc.ss.test.section7_5;

class Singleton2 {
	private static Singleton2 instance = null;  //静态私有成员变量
	private String info = "单例模式示例";
	//私有构造函数
	private Singleton2() {	
	}
	//静态公有工厂方法，返回唯一实例
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
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

public class TestSingleton2 {
	public static void main(String[] args) {
		Singleton2 st = Singleton2.getInstance();
		System.out.println(st.getInfo());
		
	}
}

