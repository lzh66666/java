package 第五章继承.Area.geometricobject_v4;

public class TestGeometricObject {

	public static void main(String[] args) {
		/**动态绑定圆,多态*/
		GeometricObject go = new Circle(2);
		
		System.out.println(go.toString());
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		System.out.println(((Circle)go).getDiameter());
		
		System.out.println();
		
		/**动态绑定矩形,多态*/
		go = new Rectangle(2, 4, "red", true);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		
		System.out.println();
		
		/**动态绑定三角形,多态*/
		go = new Triangle(3,4,6,"green",true);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());
		
		System.out.println();
		
		/**动态绑定梯形,多态*/
		go = new Trapezoid(2,3,5,4);
		System.out.println(go);
		System.out.println(go.getArea());
		System.out.println(go.getPerimeter());

	}

}
