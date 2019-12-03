package nuc.ss.test4;


public class TestSleepThread {
	public static void main(String[] args) {
		SleepThread t1 = new SleepThread("t1");
		SleepThread t2 = new SleepThread("t2");
		t1.start();
		t2.start();
	}
}

class SleepThread extends Thread {
	private static Object obj = new Object();

	public SleepThread(String name) {
		super(name);
	}

	@Override
	public synchronized void run() {
		try {
			// ��ȡobj�����ͬ����
			synchronized (obj) {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s: %d\n", this.getName(), i);
					// i�ܱ�4����ʱ,t1����3��
					if ((i+1) % 4 == 0 && Thread.currentThread().getName().equals("t1")) {
						System.out.println(Thread.currentThread().getName() + "˯������!");
						Thread.sleep(3000);
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}