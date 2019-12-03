package nuc.ss.test.interfacedemo.geometricobject2.another;

public class TestGeometricObject {

	public static void main(String[] args) {
		
		System.out.println("计算面积和周长：");
		printObject(new Circle(3));
		printObject(new Rectangle(2, 4, "green", true));
		
		System.out.println();
		System.out.println("按照面积比较两个Circle对象的大小：");
		System.out.println("最大的圆是：" + max(new Circle(13.8), new Circle(9.0, "red", true)));
		// System.out.println(max(new Rectangle(2, 4), new Rectangle(4 , 4)));
		
		System.out.println();
		System.out.println("对Rectangle对象进行克隆操作：");
		
		Rectangle rectangle1 = new Rectangle(3, 10, "red", true);
		Rectangle rectangle2 = null;
		try {
			rectangle2 = (Rectangle)rectangle1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("原对象为：" + rectangle1);
		System.out.println("克隆对象为：" + rectangle2);
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
