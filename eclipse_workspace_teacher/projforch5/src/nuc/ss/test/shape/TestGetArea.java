package nuc.ss.test.shape;

public class TestGetArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle(20,10);
		System.out.println("�����ε����Ϊ��"+s.getArea());
		s=new Triangle(20,10);
		System.out.println("�����ε����Ϊ��"+s.getArea());
		s=new Ladder(10,20,5);
		System.out.println("���ε����Ϊ��"+s.getArea());
		
	}

}

