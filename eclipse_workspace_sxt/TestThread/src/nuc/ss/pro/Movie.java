package nuc.ss.pro;

/**
 * һ������,��ͬ����Դ
 * ������ģʽ,�źŵƷ�
 * wait():�ȴ�,�ͷ���   sleep ���ͷ���
 * notify()/notifyAll():����
 * ��synchronized
 * @author Administrator
 * @version 2019 11 28 19:49
 * 
 */
public class Movie {
	private String pic;
	//�źŵ�
	//flag -->T ����������,�����ߵȴ�,������ɺ�֪ͨ����
	//flag -->F ����������,�����ߵȴ�,������ɺ�֪ͨ����
	
	private boolean flag = true;
	/**
	 * ����
	 * @param pic
	 */
	public synchronized void play(String pic) {
		if(!flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������: " + pic);
		//�������
		this.pic = pic;
		//֪ͨ����
		this.notify();
		//������ͣ��
		this.flag = false;
	}

	public synchronized void watch() {
		if(flag) {//�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("������: " + pic);
		//�������
		//֪ͨ����
		this.notifyAll();
		this.flag = true;
	}
}