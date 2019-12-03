package nuc.ss.Point;
/**
 * ������
 * @author ¬��
 * @version 2019 11 12 15:00 
 */
public class TestPoint2 {
	public static void main(String[] args) {
		Point2<Integer> point = new Point2<Integer>(100,200);
		int x = point.getX();
		int y = point.getY();
		System.out.println("��һ���������λ��Ϊ:[" + x + "," + y + "]");
		
		Point2<Double> point2 = new Point2<Double>(100.0,200.0);
		double x2 = point2.getX();
		double y2 = point2.getY();
		System.out.println("�ڶ����������λ��Ϊ:[" + x2 + "," + y2 + "]");
		
		Point2<String> point3 = new Point2<String>("һ��","����");
		String x3 = (String)point3.getX();
		String y3 = (String)point3.getY();
		System.out.println("�������������λ��Ϊ:[" + x3 + "," + y3 + "]");
	}
}

class Point2<T> {	//������һ������T(type)������,���������ʱ��Ҫ���в����������
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
