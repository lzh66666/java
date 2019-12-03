package nuc.ss.thread.syn;

/**
 * ���������ķ�ʽ
 * 1.����ʽ
 * 1)������˽�л�
 * 2)����˽�еľ�̬����
 * 3)�����ṩ�������Եľ�̬����,ȷ���ö������
 * @author Administrator
 *
 */
public class MyJvm {
	private static MyJvm instance;
	private MyJvm() {
		
	}
	public static MyJvm getInstance() {
		if(instance == null) {//���Ч��
			synchronized (MyJvm.class) {
				if(instance == null) {
					instance = new MyJvm();
				}
			}
		}
		
		return instance;
	}
}

/**
 * ����ʽ
 * 1)������˽�л�
 * 2)����˽�еľ�̬����,ͬʱ�����ö���
 * 3)�����ṩ�������Եľ�̬����
 * @author Administrator
 *
 */
class MyJvm2{
	private static MyJvm2 instance = new MyJvm2();
	private MyJvm2() {
		
	}
	
	public static MyJvm2 getInstance() {
		return instance;
	}
}

/**
 * ����ʹ�õ�ʱ�����,�ӻ�����ʱ��
 * @author Administrator
 *
 */
class Myjvm3{
	private static class JVMholder{
		private static Myjvm3 instance = new Myjvm3();
	}
	public static Myjvm3 getinstance () {
		return JVMholder.instance;
	}
}