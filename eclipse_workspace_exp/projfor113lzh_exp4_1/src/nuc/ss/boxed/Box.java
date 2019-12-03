package nuc.ss.boxed;

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
				"\nthe volum of Box is " + volum() + "\nthe area of Box is " + area());
	}
}
