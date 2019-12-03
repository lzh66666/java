package nuc.ss.Point;
/**
 * 泛型类
 * @author 卢泽华
 * @version 2019 11 12 15:00 
 */
public class TestPoint2 {
	public static void main(String[] args) {
		Point2<Integer> point = new Point2<Integer>(100,200);
		int x = point.getX();
		int y = point.getY();
		System.out.println("第一个点的坐标位置为:[" + x + "," + y + "]");
		
		Point2<Double> point2 = new Point2<Double>(100.0,200.0);
		double x2 = point2.getX();
		double y2 = point2.getY();
		System.out.println("第二个点的坐标位置为:[" + x2 + "," + y2 + "]");
		
		Point2<String> point3 = new Point2<String>("一百","二百");
		String x3 = (String)point3.getX();
		String y3 = (String)point3.getY();
		System.out.println("第三个点的坐标位置为:[" + x3 + "," + y3 + "]");
	}
}

class Point2<T> {	//类型用一个参数T(type)来代替,在声明类的时候要进行参数表的声明
	private T x;
	private T y;
	public Point2(T x,T y) {
		this.x = x;
		this.y = y;
	}
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}
}
