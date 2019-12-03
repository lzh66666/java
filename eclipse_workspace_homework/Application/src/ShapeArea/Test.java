package ShapeArea;

public class Test {
	public static void main(String[] args) {
		Shape shape = null;
		testShape(shape);
		
	}
	
	public static void testShape(Shape shape) {
		int x = (int)(Math.random()*100);
		if(x%2 == 1) {
			shape = new Circle(2);
		}
		else {
			shape = new Square(2, 3);
		}
		System.out.println(shape);
	}
}
