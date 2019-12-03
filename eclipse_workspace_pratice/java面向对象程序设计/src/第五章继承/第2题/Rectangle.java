package 第五章继承.第2题;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle() {
		
	}

	public Rectangle(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	
	public double area() {
		return getLength()*getWidth();
	}
	
	public double perimeter() {
		return (getLength()+getWidth())*2;
	}
	
	public void print() {
		System.out.println("the width and length of Rectangle are "+ getLength()+ "," + getWidth() +
				",the perimeter of Rectangle is " + perimeter() + ",the area of Rectangle is "+area() );
	}
	
}
