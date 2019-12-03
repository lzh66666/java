package nuc.ss.test.section9_1;

public class TestPointObject {

	public static void main(String[] args) {
		PointObject point1 = new PointObject(100, 200); // int --> Object
		int x1 = (int)point1.getX();  // Object --> int
		int y1 = (int)point1.getY();
		System.out.println("第一个点的坐标位置为：[" + x1 + ", " + y1 + "]");
		
		PointObject point2 = new PointObject(100.0, 200.0);  // double --> Object
		double x2 = (double)point2.getX();  // Object --> double
		double y2 = (double)point2.getY();
		System.out.println("第二个点的坐标位置为：[" + x2 + ", " + y2 + "]");
		
		PointObject point3 = new PointObject("一百", "二百");  // String --> Object
/*		int x3 = (int)point3.getX();
		int y3 = (int)point3.getY();*/
		String x3 = (String)point3.getX();  // Object --> String
		String y3 = (String)point3.getY();
		System.out.println("第三个点的坐标位置为：[" + x3 + ", " + y3 + "]");
	}
}

class PointObject{
	private Object x;
	private Object y;
	public PointObject(Object x, Object y) {
		this.x = x;
		this.y = y;
	}
	public Object getX() {
		return x;
	}
	public Object getY() {
		return y;
	}
}
