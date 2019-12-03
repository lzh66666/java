package nuc.ss.test.section9_1;

public class TestPointN {

	public static void main(String[] args) {
		PointInt point1 = new PointInt(100, 200);
		System.out.println("��һ���������λ��Ϊ��[" + point1.getX() + ", " + point1.getY() + "]");
		
		PointDouble point2 = new PointDouble(100.0, 200.0);
		System.out.println("�ڶ����������λ��Ϊ��[" + point2.getX() + ", " + point2.getY() + "]");
		
		PointString point3 = new PointString("һ��", "����");
		System.out.println("�������������λ��Ϊ��[" + point3.getX() + ", " + point3.getY() + "]");
	}
}

class PointInt{
	private int x;
	private int y;
	
	public PointInt(int x, int y) {
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

class PointDouble{
	private Double x;
	private Double y;
	
	public PointDouble(Double x, Double y) {
		this.x = x;
		this.y = y;
	}
	
	public Double getX() {
		return x;
	}
	
	public Double getY() {
		return y;
	}
}

class PointString{
	private String x;
	private String y;
	
	public PointString(String x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public String getX() {
		return x;
	}
	
	public String getY() {
		return y;
	}
}