package nuc.ss.singleton;

import java.util.concurrent.CountDownLatch;

/**
 *  测试多线程环境下五种创建单例模式的效率
 * @author 卢泽华
 * @version 2019 11 30 16:34
 *
 */
public class Client3 {
	public static void main(String[] args) throws Exception {
		
		long start = System.currentTimeMillis();
		int threadNum = 10;
		final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
		for (int i = 0; i < threadNum; i++) {
			new Thread(new Runnable() {
				@SuppressWarnings("unused")
				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						//Object o = SingletonDemo1.getinstance();
						Object o = SingletonDemo5.INSTANCE;
					}
					countDownLatch.countDown();
				}
			}).start();
		}
		
		countDownLatch.await();//main线程阻塞，直到计数器变为0，才会继续往下执行！
		long end = System.currentTimeMillis();
		
		System.out.println("总耗时: " + (end-start));
	}
}
