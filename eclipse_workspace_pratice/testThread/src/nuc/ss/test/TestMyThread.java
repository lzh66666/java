package nuc.ss.test;

/**
 * a继承实现线程
 * @author 卢泽华
 * @version 2019 11 26 08:50
 */
public class TestMyThread {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();//线程启动到就绪状态
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("线程执行");
	}
}
