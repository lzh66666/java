package nuc.ss.test.section11_3;

class MyPropertyThread implements Runnable{
	public void run(){
			System.out.println(  Thread.currentThread().getName() + 
			  "�̵߳�priority=" + Thread.currentThread().getPriority() + 
					", ����ID=" + Thread.currentThread().getId() +
			     ", ����state=" + Thread.currentThread().getState());
	}
}

public class TestProperty {
	public static void main(String[] args) {
		Thread mt1=new Thread(new MyPropertyThread(), "MAX");
		Thread mt2=new Thread(new MyPropertyThread(), "Normal");
		Thread mt3=new Thread(new MyPropertyThread(), "MIN");
		Thread mt4=new Thread(new MyPropertyThread(), "�Զ������ȼ�");
		mt1.setPriority(Thread.MAX_PRIORITY);
		mt2.setPriority(Thread.NORM_PRIORITY);
		mt3.setPriority(Thread.MIN_PRIORITY);
		mt4.setPriority(7);
		mt1.start();
		//delay();
		mt2.start();
		//delay();
		mt3.start();
		//delay();
		mt4.start();
		delay();
		//������߳���Ϣ
		System.out.println("���̵߳�name=" + Thread.currentThread().getName() +
				                ",���ȼ�=" + Thread.currentThread().getPriority());

	}
	
	static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}