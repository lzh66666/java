package nuc.ss.test.overload;

public class TestOverload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float circleArea = getArea(2.0f);
		double rectangleArea1 = getArea(1.0f,2);
		float rectangleArea2 = getArea(2,1.0f);
		float cuboidArea = getArea(3,4,5);	
		System.out.println("circleArea = " + circleArea + "\nrectangleArea1 = " + rectangleArea1 +
				           "\nrectangleArea2 = " + rectangleArea2 + "\ncuboidArea = " + cuboidArea);
	}
	public static float getArea(float r) {
		return 3.14f * r * r;
	}
	public static double getArea( float x,int y) {
		return x * y;
	}
	public static float getArea(int x, float y) {
		return x * y;
	}
	public static float getArea(float x, float y, float z) {
		return (x * y + y * z + z * x) * 2;
	}
	
}

