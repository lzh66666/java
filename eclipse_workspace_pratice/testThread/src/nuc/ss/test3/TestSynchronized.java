package nuc.ss.test3;

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicketSynchronized mt = new SaleTicketSynchronized();
                //下面3个线程的第一个参数相同，保证了执行同一块代码块
		Thread t1 = new Thread(mt, "salewindowA");
		Thread t2 = new Thread(mt, "salewindowB");
		Thread t3 = new Thread(mt, "salewindowC");
		t1.start();
		t2.start();
		t3.start();
	}
}
class SaleTicketSynchronized implements Runnable{
	
	private int ticket = 100;
	//synchronized public void run(){  //对方法进行加锁
	public void run() {	
		for(int i = 0; i < 100; i++){	
			synchronized(this){  //对代码块进行加锁
				if(ticket > 0){				
					System.out.println(Thread.currentThread().getName() + "现在正在售出第"+ticket+"号座位票；");
					ticket--;
				}
			}			
		}
	}
}