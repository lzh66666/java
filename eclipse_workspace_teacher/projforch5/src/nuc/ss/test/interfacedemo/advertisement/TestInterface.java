package nuc.ss.test.interfacedemo.advertisement;

public class TestInterface {
	   public static void main(String args[]) {
	      AdvertisementBoard board = new AdvertisementBoard();
	      board.show(new PhilipsCorp());
	      board.show(new LenovoCorp());
	   }
	}

	/*
	// 不使用AdvertisementBoard类（只为演示，不建议这样做）
	public class Example5_17 {
		public static void main(String args[]) {
			Advertisement adver = null;
			adver = new  PhilipsCorp();
		    System.out.println("广告牌显示"+adver.getCorpName()+"公司的广告词：");
		    adver.showAdvertisement();
			 
			adver = new  LenovoCorp();
		    System.out.println("广告牌显示"+adver.getCorpName()+"公司的广告词：");
		    adver.showAdvertisement();
		}
	}
	*/



