package nuc.ss.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 测试懒汉式单例模式(如何防止反射和反序列化漏洞)
 * 
 * @author 卢泽华
 * @version 2019 11 30 15:59
 *
 */
public class SingletonDemo6 implements Serializable{
	private static final long serialVersionUID = 1L;
	// 类初始化时，不初始化这个对象（延时加载，真正用的时候再创建）。
	private static SingletonDemo6 instance;

	// 构造器私有化
	private SingletonDemo6() {
		if(instance != null) {//防止反射破解
			throw new RuntimeException();
		}
	}

	// 方法同步，调用效率低！
	public static synchronized SingletonDemo6 getinstance() {
		if (instance == null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//防止反序列化破解,反序列化时,如果定义了readResolve()则直接返回此方法指定的对象,而不需要单独再创建新对象!
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}
