package ShapeArea;

public class Circle implements Shape {
	private double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*getRadius()*getRadius();
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*getRadius()*2;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getRadius()=" + getRadius() + ", getArea()=" + getArea()
				+ ", getPerimeter()=" + getPerimeter() + "]";
	}
	

}
