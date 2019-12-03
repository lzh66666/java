package �����¼̳�.Area.geometricobject_v4;

public class TestGeometricObject {

	public static void main(String[] args) {
		/**��̬��Բ,��̬*/
		GeometricObject go = new Circle(2);
		
		System.out.println(go.toString());
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		System.out.println(((Circle)go).getDiameter());
		
		System.out.println();
		
		/**��̬�󶨾���,��̬*/
		go = new Rectangle(2, 4, "red", true);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		
		System.out.println();
		
		/**��̬��������,��̬*/
		go = new Triangle(3,4,6,"green",true);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		
		System.out.println();
		
		/**��̬������,��̬*/
		go = new Trapezoid(2,3,5,4);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());

	}

}
