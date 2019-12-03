package nuc.ss.singleton;

/**
 * 测试饿汉式单例模式
 * @author 卢泽华
 * @version 2019 11 30 14:52
 * 
 */

public class SingletonDemo1 {
	//类初始化时，立即加载这个对象（没有延时加载的优势）。加载类时，天然的是线程安全的！
	private static SingletonDemo1 instance = new SingletonDemo1();
	//构造器私有化
	private SingletonDemo1() {
	}
	//方法没有同步，调用效率高！
	public static SingletonDemo1 getinstance() {
		return instance;
	}
}
