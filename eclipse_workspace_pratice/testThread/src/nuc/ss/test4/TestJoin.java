package nuc.ss.test4;

public class TestJoin {
	public static void main(String[] args) {
		Mythread t1 = new Mythread("С��");
		System.out.println("�ɷ������: " + t1.getName());
		
		t1.start();
		try {
//			t1.join();//�����޳�ʱ��
			t1.join(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(t1.isState()) {
			System.out.println(t1.getName() + "�������");
		} else {
			System.out.println("�ɷ������ߵȲ���" + t1.getName() + "�������,�����˳�");
		}
		
	}
}


class Mythread extends Thread{
	private boolean state = false;
	
	public Mythread(String name) {
		super(name);
	}
	
	public boolean isState() {
		return state;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(this.getName() + ":" + (i+1));
		}
		this.state = true;
	}
}