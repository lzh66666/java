package nuc.ss.test4;

public class TestSleepRunnable {
	public static void main(String[] args) {
		SleepRunnable sleepRunnable = new SleepRunnable();
		//synchronized作用于对象,所以只能创建一个SleepRunnable对象,或者静态方法可以创建两个对象
		Thread t1 = new Thread(sleepRunnable,"t1");
		Thread t2 = new Thread(sleepRunnable,"t2");
		t1.start();
		t2.start();
	}
}

class SleepRunnable implements Runnable {

	@Override
	public void  run() {
//		synchronized (this) {//修饰代码块
		synchronized (SleepRunnable.class) {//修饰SleepRunnable类
			try {
				for (int i = 0; i < 10; i++) {
					System.out.printf("%s: %d\n", Thread.currentThread().getName(), i);
					// i能被4整除时,t1休眠3秒
					if ((i + 1) % 4 == 0 && Thread.currentThread().getName().equals("t1")) {
						System.out.println(Thread.currentThread().getName() + "睡眠三秒!");
						Thread.sleep(3000);
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
