package nuc.ss.test.section9_1;

public class TestPointGeneric {

	public static void main(String[] args) {
		
		PointGeneric <Integer> point1 = 
				new PointGeneric <Integer>(100, 200); // �������ͱ������������ͣ������ǻ�����������
		int x1 = point1.getX(); // ����Ҫ����ת��
		int y1 = point1.getY();
		System.out.println("��һ���������λ��Ϊ��[" + x1 + ", " + y1 + "]");
		
		PointGeneric <Double> point2 = new PointGeneric <Double>(100.0, 200.0); // �������ͱ������������ͣ������ǻ�����������
		double x2 = point2.getX(); // ����Ҫ����ת��
		double y2 = point2.getY();
		System.out.println("�ڶ����������λ��Ϊ��[" + x2 + ", " + y2 + "]");		
		
		PointGeneric <String> point3 = new PointGeneric <String>("һ��", "����"); // �������ͱ������������ͣ������ǻ�����������
		String x3 = point3.getX(); // ����Ҫ����ת��
		String y3 = point3.getY();
		System.out.println("�������������λ��Ϊ��[" + x3 + ", " + y3 + "]");
		
	}
}

class PointGeneric <T> { //�����ࡣ�������еĲ���T������ĳ���������ͣ�������һ�֣���ȷ����ʵ�������������ⲿʹ���ߣ��������������ָࣩ����
	private T x;
	private T y;
	public PointGeneric(T x, T y) {
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
