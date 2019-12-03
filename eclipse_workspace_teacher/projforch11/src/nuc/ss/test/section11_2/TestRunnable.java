package nuc.ss.test.section11_2;

public class TestRunnable {

	public static void main(String[] args) {
		SaleTicketRunnable sale = new SaleTicketRunnable();
		Thread thread = new Thread(sale);  //参数是实现了runnable接口的类对象
		thread.start();

	}

}

class SaleTicketRunnable implements Runnable{
	int ticket = 100;
	public void run(){
		for(int i=0; i<100; i++){		
			if(ticket > 0){				
				System.out.println("现在正在售出第" + (100-ticket+1) + "号座位票；");
				ticket--;
			}
		}
	}
}
