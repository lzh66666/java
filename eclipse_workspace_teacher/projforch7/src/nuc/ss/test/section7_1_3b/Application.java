package nuc.ss.test.section7_1_3b;

public class Application {
	public static void main(String[] args) {
		Geometry bottom;
		Pillar pillar;
		bottom = new Rectangle(12, 22);
		pillar = new Pillar(bottom, 58); //pillar�Ǿ��ε�����
		System.out.println("���ε׵���������Ϊ��" + pillar.getVolume());
		bottom = new Circle(10);
		pillar = new Pillar(bottom, 58); //pillar��Բ�ε�����
		System.out.println("Բ�ε׵���������Ϊ��" + pillar.getVolume());
	}
}

