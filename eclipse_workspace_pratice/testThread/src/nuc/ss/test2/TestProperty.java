package nuc.ss.test2;

public class TestProperty {
	public static void main(String[] args) {
		Thread mt1 = new Thread(new MyProperty(),"MAX");
		Thread mt2 = new Thread(new MyProperty(),"Normal");
		Thread mt3 = new Thread(new MyProperty(),"MIN");
		Thread mt4 = new Thread(new MyProperty(),"�Զ������ȼ�");
		
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.NORM_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);
		mt4.setPriority(7);
		
		mt1.start();
		delay();
		mt2.start();
		delay();
		mt3.start();
		delay();
		mt4.start();
		delay();
		//���߳�
		System.out.println("���̵߳�name=" + Thread.currentThread().getName()
				+ ",���ȼ� = " + Thread.currentThread().getPriority());
	}
	
	private static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class MyProperty implements Runnable{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + 
				"�̵߳�priority = " + Thread.currentThread().getPriority() 
				+ ",����ID= " + Thread.currentThread().getId() + 
				",����state = " + Thread.currentThread().getState());
		
	}
	
}