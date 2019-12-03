package nuc.ss.test.section9_1;

public class TestPointGeneric {

	public static void main(String[] args) {
		
		PointGeneric <Integer> point1 = 
				new PointGeneric <Integer>(100, 200); // 具体类型必须是引用类型，不能是基本数据类型
		int x1 = point1.getX(); // 不需要类型转换
		int y1 = point1.getY();
		System.out.println("第一个点的坐标位置为：[" + x1 + ", " + y1 + "]");
		
		PointGeneric <Double> point2 = new PointGeneric <Double>(100.0, 200.0); // 具体类型必须是引用类型，不能是基本数据类型
		double x2 = point2.getX(); // 不需要类型转换
		double y2 = point2.getY();
		System.out.println("第二个点的坐标位置为：[" + x2 + ", " + y2 + "]");		
		
		PointGeneric <String> point3 = new PointGeneric <String>("一百", "二百"); // 具体类型必须是引用类型，不能是基本数据类型
		String x3 = point3.getX(); // 不需要类型转换
		String y3 = point3.getY();
		System.out.println("第三个点的坐标位置为：[" + x3 + ", " + y3 + "]");
		
	}
}

class PointGeneric <T> { //泛型类。参数表中的参数T代表了某种数据类型，到底哪一种？不确定！实际数据类型由外部使用者（创建该类对象的类）指定。
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
