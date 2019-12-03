package nuc.ss.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * ��������ʽ����ģʽ(��η�ֹ����ͷ����л�©��)
 * 
 * @author ¬��
 * @version 2019 11 30 15:59
 *
 */
public class SingletonDemo6 implements Serializable{
	private static final long serialVersionUID = 1L;
	// ���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�������
	private static SingletonDemo6 instance;

	// ������˽�л�
	private SingletonDemo6() {
		if(instance != null) {//��ֹ�����ƽ�
			throw new RuntimeException();
		}
	}

	// ����ͬ��������Ч�ʵͣ�
	public static synchronized SingletonDemo6 getinstance() {
		if (instance == null) {
			instance = new SingletonDemo6();
		}
		return instance;
	}
	
	//��ֹ�����л��ƽ�,�����л�ʱ,���������readResolve()��ֱ�ӷ��ش˷���ָ���Ķ���,������Ҫ�����ٴ����¶���!
	private Object readResolve() throws ObjectStreamException{
		return instance;
	}
}