package 第七章.简单工厂模式.电视机;

public class TVFactory {
	public TV produceTV (String brand) {
		if(brand.equalsIgnoreCase("haier")) {
			System.out.println("生产海尔电视中");
			return new HaierTV();
		}else if(brand.equalsIgnoreCase("hisense")) {
			System.out.println("生产海信电视中");
			return new HisenseTV();
		}else {
			System.out.println("此品牌的电视机还在开发中...");
			return null;
		}
		
	}
}
