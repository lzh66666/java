package nuc.ss.singleton;

/**
 * ���Զ���ʽ����ģʽ
 * @author ¬��
 * @version 2019 11 30 14:52
 * 
 */

public class SingletonDemo1 {
	//���ʼ��ʱ�����������������û����ʱ���ص����ƣ���������ʱ����Ȼ�����̰߳�ȫ�ģ�
	private static SingletonDemo1 instance = new SingletonDemo1();
	//������˽�л�
	private SingletonDemo1() {
	}
	//����û��ͬ��������Ч�ʸߣ�
	public static SingletonDemo1 getinstance() {
		return instance;
	}
}
