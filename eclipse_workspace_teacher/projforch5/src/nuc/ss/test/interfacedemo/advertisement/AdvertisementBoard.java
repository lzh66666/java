package nuc.ss.test.interfacedemo.advertisement;

public class AdvertisementBoard {
	   public void show(Advertisement adver) {
	       System.out.println("广告牌显示"+adver.getCorpName()+"公司的广告词：");
	       adver.showAdvertisement();
	   }
	}
