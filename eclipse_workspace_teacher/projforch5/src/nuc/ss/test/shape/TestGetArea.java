package nuc.ss.test.shape;

public class TestGetArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle(20,10);
		System.out.println("长方形的面积为："+s.getArea());
		s=new Triangle(20,10);
		System.out.println("三角形的面积为："+s.getArea());
		s=new Ladder(10,20,5);
		System.out.println("梯形的面积为："+s.getArea());
		
	}

}

