package nuc.ss.test.interfacedemo.advertisement;

public class TestInterface {
	   public static void main(String args[]) {
	      AdvertisementBoard board = new AdvertisementBoard();
	      board.show(new PhilipsCorp());
	      board.show(new LenovoCorp());
	   }
	}

	/*
	// ��ʹ��AdvertisementBoard�ֻࣨΪ��ʾ����������������
	public class Example5_17 {
		public static void main(String args[]) {
			Advertisement adver = null;
			adver = new  PhilipsCorp();
		    System.out.println("�������ʾ"+adver.getCorpName()+"��˾�Ĺ��ʣ�");
		    adver.showAdvertisement();
			 
			adver = new  LenovoCorp();
		    System.out.println("�������ʾ"+adver.getCorpName()+"��˾�Ĺ��ʣ�");
		    adver.showAdvertisement();
		}
	}
	*/



