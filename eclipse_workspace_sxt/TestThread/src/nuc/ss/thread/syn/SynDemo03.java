package nuc.ss.thread.syn;
/**
 * �����ͬ�����������������
 * @author Administrator
 *
 */
public class SynDemo03 {
	
	public static void main(String[] args) {
		Object g = new Object();
		Object m = new Object();
		Test t1 = new Test(g,m);
		Test2 t2 = new Test2(g,m);
		Thread proxy = new Thread(t1);
		Thread proxy2 = new Thread(t2);
		proxy.start();
		proxy2.start();
	}
	
}

class Test implements Runnable{
	Object goods;
	Object money;
	
	@Override
	public void run() {
		while(true) {
			test();
		}
	}
	
	
	public Test(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}


	public void test() {
		synchronized(goods) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(money) {
				
			}
		}
		System.out.println("һ�ָ�Ǯ");
	}
}

class Test2 implements Runnable{
	Object goods;
	Object money;
	
	@Override
	public void run() {
		while(true) {
			test();
		}
	}
	
	
	public Test2(Object goods, Object money) {
		super();
		this.goods = goods;
		this.money = money;
	}


	public void test() {
		synchronized(money) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(goods) {
				
			}
		}
		System.out.println("һ�ָ���");
	}
}