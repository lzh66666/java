package nuc.ss.test2;

public class TestSaleTicketRunnable {

	public static void main(String[] args) {
		SaleTicketRunnable sale = new SaleTicketRunnable();
		Thread th = new Thread(sale);
		th.start();
	}
}

class SaleTicketRunnable implements Runnable {

	private int ticket = 1;

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			if (ticket <= 100) {
				System.out.println("现在正在售出第" + ticket + "号作为票。");
			}
			ticket++;
		}
	}

}
