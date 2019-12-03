package nuc.ss.test.shape;

public class Rectangle extends Shape {
	public Rectangle(int length,int width) {
		// TODO Auto-generated constructor stub
		super(length,width);
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return side1*side2;
	}
}

