package nuc.ss.test.shape;

public class Triangle extends Shape {
	public Triangle(int bottom,int height) {
		// TODO Auto-generated constructor stub
		super(bottom,height);
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return side1*side2/2;
	}
}
