package nuc.ss.test;

/**
 * a�̳�ʵ���߳�
 * @author ¬��
 * @version 2019 11 26 08:50
 */
public class TestMyThread {
	public static void main(String[] args) {
		MyThread th = new MyThread();
		th.start();//�߳�����������״̬
	}
}

class MyThread extends Thread{
	@Override
	public void run() {
		System.out.println("�߳�ִ��");
	}
}