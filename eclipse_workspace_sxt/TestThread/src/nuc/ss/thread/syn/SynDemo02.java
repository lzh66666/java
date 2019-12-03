package nuc.ss.thread.syn;

/**
 * a�������ģʽ:ȷ��һ����ֻ��һ������(����ģʽ)
 * 
 * @author Administrator
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
/*		Jvm jvm1 = Jvm.getinstance();
		Jvm jvm2 = Jvm.getinstance();

		System.out.println(jvm1);
		System.out.println(jvm2);
*/
		JvmThread thread1 = new JvmThread(100);
		JvmThread thread2 = new JvmThread(500);
		
		thread1.start();
		thread2.start();
	}
}

class JvmThread extends Thread {
	private long time;

	public JvmThread() {

	}

	public JvmThread(long time) {
		this.time = time;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "-->����: " + Jvm.getinstance4(time));
	}
}

/**
 * �������ģʽ ȷ��һ����ֻ��һ������ 
 * ����ʽ double checking ˫�ؼ��
 * 1��������˽�л�,�����ⲿֱ�Ӵ������� 
 * 2������һ��˽�еľ�̬����
 * 3������һ������Ĺ����ľ�̬����,���ʸñ���,�������û�д�������,�����ö���
 * 
 * @author Administrator
 *
 */
class Jvm {
	// ����һ��˽�еľ�̬����
	private static Jvm instance = null;

	// ������˽�л�,�����ⲿֱ�Ӵ�������
	private Jvm() {

	}

	// ����һ������Ĺ����ľ�̬����,���ʸñ���
	public static Jvm getinstance() {
		if (instance == null) {
			instance = new Jvm();
		}
		return instance;
	}

	// ���߳�ʱ,�����Ĳ���һ������
	public static Jvm getinstance1(long time) {
		if (instance == null) {
			try {
				Thread.sleep(time);//��ʱ,�Ŵ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	//����ͬ������ֻ����һ������
	public static synchronized Jvm getinstance2(long time) {
		if (instance == null) {
			try {
				Thread.sleep(time);//��ʱ,�Ŵ����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	//����ͬ������ֻ����һ������
	public static Jvm getinstance3(long time) {
		//a b c d e  -->Ч�ʲ���,���ڶ�����Ҫ�ȴ�
		synchronized (Jvm.class) {
			if (instance == null) {
				try {
					Thread.sleep(time);// ��ʱ,�Ŵ����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				instance = new Jvm();
			}
			return instance;
		}
	}
	
	public static Jvm getinstance4(long time) {
		//a b c d e  -->Ч��  �ṩ���ڶ���ķ���Ч��
		if (instance == null) {
			synchronized (Jvm.class) {
				if (instance == null) {
					try {
						Thread.sleep(time);// ��ʱ,�Ŵ����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new Jvm();
				}
			}
		}
		return instance;
	}
}