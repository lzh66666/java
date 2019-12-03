package nuc.ss.test.section11_3;

class MyPropertyThread implements Runnable{
	public void run(){
			System.out.println(  Thread.currentThread().getName() + 
			  "线程的priority=" + Thread.currentThread().getPriority() + 
					", 它的ID=" + Thread.currentThread().getId() +
			     ", 它的state=" + Thread.currentThread().getState());
	}
}

public class TestProperty {
	public static void main(String[] args) {
		Thread mt1=new Thread(new MyPropertyThread(), "MAX");
		Thread mt2=new Thread(new MyPropertyThread(), "Normal");
		Thread mt3=new Thread(new MyPropertyThread(), "MIN");
		Thread mt4=new Thread(new MyPropertyThread(), "自定义优先级");
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
		//输出主线程信息
		System.out.println("主线程的name=" + Thread.currentThread().getName() +
				                ",优先级=" + Thread.currentThread().getPriority());

	}
	
	static void delay() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}		
	}

}
