package nuc.ss.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 测试反射和反序列化破解单例模式
 * @author 卢泽华
 *
 */
public class Client2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		SingletonDemo6 s1 = SingletonDemo6.getinstance();
		SingletonDemo6 s2 = SingletonDemo6.getinstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//通过反射的方式直接调用私有构造器
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("nuc.ss.singleton.SingletonDemo6");
//		java.lang.reflect.Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		//通过反序列化的方式创建多个对象
		FileOutputStream fos = new FileOutputStream("a.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.close();
		fos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
		SingletonDemo6 s3 = (SingletonDemo6) ois.readObject();
		System.out.println(s3);
	}
}
