package ������.��������ģʽ.�����;

public class PillarFactory {
	public static Pillar getPillar(String type) {
		Pillar p = null;
		if(type.equalsIgnoreCase("circle")) {
			p = new Pillar(new Circle());
		}
		if(type.equalsIgnoreCase("rectangle")) {
			p = new Pillar(new Rectangle());
		}
		return p;
	}
}
