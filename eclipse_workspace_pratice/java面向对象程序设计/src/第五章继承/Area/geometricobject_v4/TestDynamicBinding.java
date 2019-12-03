package µÚÎåÕÂ¼Ì³Ğ.Area.geometricobject_v4;

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
