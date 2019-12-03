package 第五章继承.Area.geometricobject_v4;
/**
 * 矩形
 * @author 卢泽华
 *
 */
public class Rectangle extends GeometricObject {
	private double width;
	private double height;
	
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	/**访问器,获得矩形的宽*/
	public double getWidth() {
		return width;
	}

	/**更改器,设置矩形的宽*/
	public void setWidth(double width) {
		this.width = width;
	}

	/**访问器,获得矩形的高*/
	public double getHeight() {
		return height;
	}

	/**更改器,设置矩形的高*/
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**方法的重写,计算矩形的面积*/
	public double getArea() {
		return width * height;
	}
	
	/**方法的重写,计算矩形的周长*/
	public double getPerimeter() {
		return (width + height) * 2;
	}

	/**方法的重写,返回矩形的各种属性*/
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getDateCreated()=" + getDateCreated() + "]";
	}
}
