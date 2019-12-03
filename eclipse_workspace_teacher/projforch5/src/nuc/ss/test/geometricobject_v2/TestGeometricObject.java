package nuc.ss.test.geometricobject_v2;

public class TestGeometricObject {

	public static void main(String[] args) {
		
		displayObject(new Circle(1));
		
		displayObject(new Rectangle(23, 4, "yellow", true));

	}
	
	private static void displayObject(GeometricObject object) {
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.getArea());
		System.out.println(object.getPerimeter());
	}

}
