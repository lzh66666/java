package nuc.ss.test.section11_2;

public class TestRunnable {

	public static void main(String[] args) {
		SaleTicketRunnable sale = new SaleTicketRunnable();
		Thread thread = new Thread(sale);  //������ʵ����runnable�ӿڵ������
		thread.start();

	}

}

class SaleTicketRunnable implements Runnable{
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
