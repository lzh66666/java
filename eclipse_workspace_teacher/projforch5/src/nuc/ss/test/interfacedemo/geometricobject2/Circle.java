package nuc.ss.test.interfacedemo.geometricobject2;

public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean filled) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	public double getDiameter() {
		return  2 * radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
				+ ", getDateCreated()=" + getDateCreated() + "]";
	}
}
