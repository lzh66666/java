package nuc.ss.test.section7_5;

//饿汉式: 饿汉式单例类在自己被加载时就将自己实例化。
class Singleton3 {
	private static Singleton3 instance = new Singleton3();  //静态私有成员变量
	private String info = "饿汉式单例模式示例";
	//私有构造函数
	private Singleton3() {	
	}
	//静态公有工厂方法，返回唯一实例
	public static Singleton3 getInstance() {		
		return instance;
	}
	
	public String getInfo() {
		return info;
	}
	
	public void setInfo(String info) {
		this.info = info;
	}
}

public class TestSingleton3 {
	public static void main(String[] args) {
		Singleton3 st = Singleton3.getInstance();
		System.out.println(st.getInfo());
		
	}
}
