package nuc.ss.test.geometricobject_v3;

public class TestGeometricObject {

	public static void main(String[] args) {
		GeometricObject go = new Circle(2);
		System.out.println(go.toString());
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		System.out.println(((Circle)go).getDiameter());
		
		System.out.println();
		
		go = new Rectangle(2, 4, "red", true);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());

	}

}
