package nuc.ss.test.abstractdemo.geometricobject;

public class TestGeometricObject {

	public static void main(String[] args) {

		displayObject(new Circle(3));
		
		displayObject(new Rectangle(2, 4, "green", true));

	}
	
	private static void displayObject(GeometricObject object) {
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.getArea());
		System.out.println(object.getPerimeter());
	}

}
