package nuc.ss.test.section7_1_3a;

public class Application {
	public static void main(String[] args) {
		Circle circle;
		Pillar pillar;
		circle = new Circle(10);
		pillar = new Pillar(circle, 58);
		System.out.println("Բ�ε׵���������Ϊ��" + pillar.getVolume());
	}
}

