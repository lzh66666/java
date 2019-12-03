package 第七章.单例模式.示例;

/**
 * 饿汉模式
 * @author 卢泽华
 *
 */
public class Singleton2 {
	private static Singleton2 instance=new Singleton2();  //静态私有成员变量
	String string;
	//私有构造函数
	private Singleton2() {	
	}
	 //静态公有工厂方法，返回唯一实例
	public static Singleton2 getInstance() {
		return instance;
	}
}
