package nuc.ss.singleton;

/**
 *���Ծ�̬�ڲ���ʵ�ֵ���ģʽ
 * ���ַ�ʽ���̰߳�ȫ������Ч�ʸߣ�����ʵ������ʱ���أ� 
 * @author ¬��
 * @version 2019 11 30 15:14
 *
 */
public class SingletonDemo4 {
	private static class SingletonClassInstance{
		private static final SingletonDemo4 instance = new SingletonDemo4();
	}
	
	private SingletonDemo4() {
	}
	
	//����û��ͬ��,����Ч�ʸ�
	public static SingletonDemo4 getInstance() {
		return SingletonClassInstance.instance;
	}
}