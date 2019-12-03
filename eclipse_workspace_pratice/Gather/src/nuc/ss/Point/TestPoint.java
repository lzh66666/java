package nuc.ss.Point;
/**
 * 非泛型类
 * @author 卢泽华
 * @version 2019
 */
public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(100,200);
		int x = (int)point.getX();
		int y = (int)point.getY();
		System.out.println("第一个点的坐标位置为:[" + x + "," + y + "]");
		
		Point point2 = new Point(100.0,200.0);
		double x2 = (double)point2.getX();
		double y2 = (double)point2.getY();
		System.out.println("第二个点的坐标位置为:[" + x2 + "," + y2 + "]");
		
		Point point3 = new Point("一百","二百");
		String x3 = (String)point3.getX();
		String y3 = (String)point3.getY();
		System.out.println("第三个点的坐标位置为:[" + x3 + "," + y3 + "]");
	}
}

class Point{	//类型用一个参数T来代替
	private Object x;
	private Object y;
	public Point(Object x,Object y) {
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
