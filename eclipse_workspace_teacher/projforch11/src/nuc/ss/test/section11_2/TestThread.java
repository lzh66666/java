package nuc.ss.test.section11_2;

class SaleTicketThread extends Thread{
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

public class TestThread {

	public static void main(String[] args) {
		SaleTicketThread sale = new SaleTicketThread();
		sale.start();
	}
}


