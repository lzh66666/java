package µÚÎåÕÂ¼Ì³Ð.Area.geometricobject_v4;

public class TestCasting {

	public static void main(String[] args) {
		//GeometricObject geoObject1 = new Circle(2);		
		//GeometricObject geoObject2 = new Rectangle(2, 4, "red", true);
		
		displayObject(new Circle(2));
		
		displayObject(new Rectangle(2, 4, "red", true));

	}
	
	public static void displayObject(Object object) {
		System.out.println();
		
		if (object instanceof Circle) {
			System.out.println((Circle)object);
			System.out.println(((Circle)object).getArea());
			System.out.println(((Circle)object).getPerimeter());
			System.out.println(((Circle)object).getDiameter());
		}
		else if (object instanceof Rectangle) {
			System.out.println((Rectangle)object);
			System.out.println(((Rectangle)object).getArea());
			System.out.println(((Rectangle)object).getPerimeter());
		}
	}
}
