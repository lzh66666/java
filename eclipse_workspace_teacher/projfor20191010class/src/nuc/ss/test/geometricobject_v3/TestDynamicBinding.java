package nuc.ss.test.geometricobject_v3;

public class TestDynamicBinding {

	public static void main(String[] args) {
		m(new Circle());
		m(new Rectangle());
		m(new GeometricObject());
		m(new Object());
	}
	
	public static void m(Object x) {
		System.out.println(x.toString());
	}
}
