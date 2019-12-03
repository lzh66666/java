package nuc.ss.test.section7_1_3b;

public class Application {
	public static void main(String[] args) {
		Geometry bottom;
		Pillar pillar;
		bottom = new Rectangle(12, 22);
		pillar = new Pillar(bottom, 58); //pillar是矩形底柱体
		System.out.println("矩形底的柱体的体积为：" + pillar.getVolume());
		bottom = new Circle(10);
		pillar = new Pillar(bottom, 58); //pillar是圆形底柱体
		System.out.println("圆形底的柱体的体积为：" + pillar.getVolume());
	}
}

