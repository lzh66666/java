package nuc.ss.test.pillar;

class Circle {
	private float r;
	public Circle(float r) {
		this.r = r;
	}
	public float getArea() {
		return 3.14f * r * r;
	}
}
class Pillar{
	Circle bottom;
	float height;
	public Pillar(Circle bottom,float height) {
		this.bottom = bottom;
		this.height = height;
	}
	public float getVolume() {
		return bottom.getArea() * height;
	}	
}

public class TestPillarVolume{
	public static void main(String[] args) {
		Circle c = new Circle(2);
		Pillar pillar = new Pillar(c,10);
		//上面两句等价于这一句Pillar pillar = new Pillar(new Cirle(2),10);
		System.out.print("该圆柱的体积为:");
		System.out.println(pillar.getVolume());		
	}
}

