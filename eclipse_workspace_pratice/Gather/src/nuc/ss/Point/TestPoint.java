package nuc.ss.Point;
/**
 * �Ƿ�����
 * @author ¬��
 * @version 2019
 */
public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(100,200);
		int x = (int)point.getX();
		int y = (int)point.getY();
		System.out.println("��һ���������λ��Ϊ:[" + x + "," + y + "]");
		
		Point point2 = new Point(100.0,200.0);
		double x2 = (double)point2.getX();
		double y2 = (double)point2.getY();
		System.out.println("�ڶ����������λ��Ϊ:[" + x2 + "," + y2 + "]");
		
		Point point3 = new Point("һ��","����");
		String x3 = (String)point3.getX();
		String y3 = (String)point3.getY();
		System.out.println("�������������λ��Ϊ:[" + x3 + "," + y3 + "]");
	}
}

class Point{	//������һ������T������
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
