package nuc.ss.test2;

public class TestSaleTicketThreak {

	public static void main(String[] args) {
		SaleTicketThreak sale = new SaleTicketThreak();
		sale.start();
	}
}

class SaleTicketThreak extends Thread{
	private int ticket = 1;
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (ticket <= 100) {
				System.out.println("���������۳���" + ticket + "����ΪƱ��");
			}
			ticket++;
		}
	}
}