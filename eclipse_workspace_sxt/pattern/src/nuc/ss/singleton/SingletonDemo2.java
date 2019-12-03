package nuc.ss.singleton;

/**
 * ��������ʽ����ģʽ
 * @author ¬��
 * @version 2019 11 30 15:00
 * 
 */

public class SingletonDemo2 {
	//���ʼ��ʱ������ʼ�����������ʱ���أ������õ�ʱ���ٴ�������
	private static SingletonDemo2 instance;
	//������˽�л�
	private SingletonDemo2() {
	}
	//����ͬ��������Ч�ʵͣ�
	public static synchronized SingletonDemo2 getinstance() {
		if(instance == null) {
			instance = new SingletonDemo2();
		}
		return instance;
	}
}