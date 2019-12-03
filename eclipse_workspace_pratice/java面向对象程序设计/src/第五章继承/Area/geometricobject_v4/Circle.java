package 第五章继承.Area.geometricobject_v4;

public class Circle extends GeometricObject{
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

	/**访问器,获得圆的radius*/
	public double getRadius() {
		return radius;
	}

	/**更改器,设置圆的radius*/
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**方法的重写,圆的面积*/
	public double getArea() {
		return radius * radius * Math.PI;
	}
	/**方法的重写,圆的周长*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/**访问器,获得圆的直径*/
	public double getDiameter() {
		return 2 * radius;
	}
	
	/**方法的重写,返回圆的各种属性和父类的颜色填充和日期*/
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
				+ ", getDateCreated()=" + getDateCreated() + "]";
	}
}
