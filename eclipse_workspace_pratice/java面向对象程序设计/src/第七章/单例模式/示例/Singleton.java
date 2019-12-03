package 第七章.单例模式.示例;

/**
 * 懒汉模式
 * @author 卢泽华
 *
 */
public class Singleton {
	private static Singleton instance=null;  //静态私有成员变量
	//私有构造函数
	private Singleton() {	
	}
	 //静态公有工厂方法，返回唯一实例
	public static Singleton getInstance() {
		if(instance==null) {
			instance=new Singleton();
		}	
		return instance;
	}
	
}
