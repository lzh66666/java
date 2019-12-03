package nuc.ss.test.interfacedemo.geometricobject2.another;

public class TestGeometricObject {

	public static void main(String[] args) {
		
		System.out.println("����������ܳ���");
		printObject(new Circle(3));
		printObject(new Rectangle(2, 4, "green", true));
		
		System.out.println();
		System.out.println("��������Ƚ�����Circle����Ĵ�С��");
		System.out.println("����Բ�ǣ�" + max(new Circle(13.8), new Circle(9.0, "red", true)));
		// System.out.println(max(new Rectangle(2, 4), new Rectangle(4 , 4)));
		
		System.out.println();
		System.out.println("��Rectangle������п�¡������");
		
		Rectangle rectangle1 = new Rectangle(3, 10, "red", true);
		Rectangle rectangle2 = null;
		try {
			rectangle2 = (Rectangle)rectangle1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("ԭ����Ϊ��" + rectangle1);
		System.out.println("��¡����Ϊ��" + rectangle2);
		System.out.println(rectangle1 == rectangle2);
		
	}
	
	private static void printObject(IAreaPerimeter object) {
		System.out.println();
		
		System.out.println(object);
		System.out.println(object.getArea());
		System.out.println(object.getPerimeter());
	}
	
	private static Comparable max(Comparable o1, Comparable o2) {
		if (o1.compareTo(o2) > 0)
			return o1;
		else 
			return o2;
	}
}
