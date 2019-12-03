package nuc.ss.test.interfacedemo.chargingandattemperation;

interface Charging{ // 收费
	   public void charge(); // 收取费用
	}
	interface Attemperation { // 调节温度
	   public void controlTemperature();
	}
	class Bus implements Charging { // 公共汽车
	   public void charge() {
	      System.out.println("公共汽车:一元/张,不计算公里数");
	   }
	}
	class Taxi implements Charging,Attemperation { //出租车
	   public void charge() {
	      System.out.println("出租车:3.20元/公里,起价3公里");
	   }
	   public void controlTemperature(){
	      System.out.println("安装了Hair空调");
	   }
	}
	class MovieTheater implements Charging,Attemperation { // 电影院
	   public void charge() {
	      System.out.println("电影院:门票,十元/张");
	   }
	   public void controlTemperature() {
	      System.out.println("安装了中央空调");
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
