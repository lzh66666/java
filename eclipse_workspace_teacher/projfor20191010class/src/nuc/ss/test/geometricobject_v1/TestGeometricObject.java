package nuc.ss.test.geometricobject_v1;

public class TestGeometricObject {

	public static void main(String[] args) {
		Circle circle = new Circle(1);
		System.out.println(circle.toString());
		System.out.println(circle.getArea());
		System.out.println(circle.getPerimeter());
		System.out.println(circle.getDiameter());
		
		System.out.println();
		
		Rectangle rectangle = new Rectangle(2, 4, "green", true);
		System.out.println(rectangle);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getPerimeter());

	}

}
