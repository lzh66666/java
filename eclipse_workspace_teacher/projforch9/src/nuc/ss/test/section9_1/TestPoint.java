package nuc.ss.test.section9_1;

public class TestPoint {

	public static void main(String[] args) {
		Point point = new Point(100, 200);
		System.out.println("该点的坐标位置为：[" + point.getX() + ", " + point.getY() + "]");

	}
}

class Point{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
}
