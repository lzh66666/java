package nuc.ss.test.interfacedemo.chargingandattemperation;

interface Charging{ // �շ�
	   public void charge(); // ��ȡ����
	}
	interface Attemperation { // �����¶�
	   public void controlTemperature();
	}
	class Bus implements Charging { // ��������
	   public void charge() {
	      System.out.println("��������:һԪ/��,�����㹫����");
	   }
	}
	class Taxi implements Charging,Attemperation { //���⳵
	   public void charge() {
	      System.out.println("���⳵:3.20Ԫ/����,���3����");
	   }
	   public void controlTemperature(){
	      System.out.println("��װ��Hair�յ�");
	   }
	}
	class MovieTheater implements Charging,Attemperation { // ��ӰԺ
	   public void charge() {
	      System.out.println("��ӰԺ:��Ʊ,ʮԪ/��");
	   }
	   public void controlTemperature() {
	      System.out.println("��װ������յ�");
	   }
	}

	public class TestInterface {
		public static void main(String args[]) {
			Bus busNo7 = new Bus();
			Taxi taxiTianyu = new Taxi();
			MovieTheater mTheaterHongxing = new MovieTheater();
			busNo7.charge();
			taxiTianyu.charge();
			mTheaterHongxing. charge();
			taxiTianyu.controlTemperature();
			mTheaterHongxing.controlTemperature();
		}
	}
