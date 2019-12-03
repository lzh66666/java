package nuc.ss.test.interfacedemo.geometricobject3;

public class TestGeometricObject {

	public static void main(String[] args) {

		printObject(new Circle(3));
		
		printObject(new Rectangle(2, 4, "green", true));

	}
	
	private static void printObject(IAreaPerimeter object) { // 不能声明为GeometricObject
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.getArea());
		System.out.println(object.getPerimeter());
	}

}
