package nuc.ss.test.interfacedemo.geometricobject1;

public class TestGeometricObject {

	public static void main(String[] args) {

		printObject(new Circle(3));
		
		printObject(new Rectangle(2, 4, "green", true));

	}
	
	private static void printObject(GeometricObject object) {
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.getArea());
		System.out.println(object.getPerimeter());
	}

}
