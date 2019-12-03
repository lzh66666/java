package nuc.ss.test3;

public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SaleTicketSynchronized mt = new SaleTicketSynchronized();
                //����3���̵߳ĵ�һ��������ͬ����֤��ִ��ͬһ������
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
	//synchronized public void run(){  //�Է������м���
	public void run() {	
		for(int i = 0; i < 100; i++){	
			synchronized(this){  //�Դ������м���
				if(ticket > 0){				
					System.out.println(Thread.currentThread().getName() + "���������۳���"+ticket+"����λƱ��");
					ticket--;
				}
			}			
		}
	}
}