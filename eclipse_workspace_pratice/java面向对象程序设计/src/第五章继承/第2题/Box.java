package 第五章继承.第2题;

public class Box extends Rectangle{
	private double height;
	public Box() {
		
	}
	
	public Box(double height,double length, double width) {
		super(length, width);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	public double area() {
		return 2*( (getLength()*getWidth()) + (getHeight()*getLength()) + getHeight()*getWidth());
	}
	public double volum() {
		return getHeight()*getLength()*getWidth();
	}
	public void print() {
		System.out.println("the leng,width and height of Box are " + getLength() + "," + getWidth() + "," + getHeight() +
				",the volum of Box is " + volum() + ",the area of Box is " + area());
	}
}
