package nuc.ss.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * ���Է���ͷ����л��ƽⵥ��ģʽ
 * @author ¬��
 *
 */
public class Client2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception{
		SingletonDemo6 s1 = SingletonDemo6.getinstance();
		SingletonDemo6 s2 = SingletonDemo6.getinstance();
		
		System.out.println(s1);
		System.out.println(s2);
		
		//ͨ������ķ�ʽֱ�ӵ���˽�й�����
//		Class<SingletonDemo6> clazz = (Class<SingletonDemo6>) Class.forName("nuc.ss.singleton.SingletonDemo6");
//		java.lang.reflect.Constructor<SingletonDemo6> c = clazz.getDeclaredConstructor(null);
//		c.setAccessible(true);
//		SingletonDemo6 s3 = c.newInstance();
//		SingletonDemo6 s4 = c.newInstance();
//		System.out.println(s3);
//		System.out.println(s4);
		
		//ͨ�������л��ķ�ʽ�����������
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