package ShapeArea;

public class Square implements Shape{
	private double width;
	private double length;
	
	public Square(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}

	
	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getLength() {
		return length;
	}


	public void setLength(double length) {
		this.length = length;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return getLength()*getWidth();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*(getLength()+getWidth());
	}


	@Override
	public String toString() {
		return "Square [width=" + width + ", length=" + length + ", getWidth()=" + getWidth() + ", getLength()="
				+ getLength() + ", getArea()=" + getArea() + ", getPerimeter()=" + getPerimeter() + "]";
	}
	
	
	
}
