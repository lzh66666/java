package nuc.ss.test.section11_2;

class SaleTicketThread extends Thread{
	int ticket = 100;
	public void run(){
		for(int i=0; i<100; i++){		
			if(ticket > 0){				
				System.out.println("���������۳���" + (100-ticket+1) + "����λƱ��");
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


