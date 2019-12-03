package nuc.ss.test;

/**
 * a接口实现线程
 * @author 卢泽华
 * @version 2019 11 26 08:55
 */
public class TestIMyThread {
	public static void main(String[] args) {
		Thread th = new Thread(new IMyThread());
		th.start();
	}
	
}


class IMyThread implements Runnable{

	@Override
	public void run() {
		System.out.println("线程执行");
		//到此线程结束
	}
	
}