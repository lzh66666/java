package �����¼̳�.Area.geometricobject_v4;
/**
 * ����
 * @author ¬��
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

	/**������,��þ��εĿ�*/
	public double getWidth() {
		return width;
	}

	/**������,���þ��εĿ�*/
	public void setWidth(double width) {
		this.width = width;
	}

	/**������,��þ��εĸ�*/
	public double getHeight() {
		return height;
	}

	/**������,���þ��εĸ�*/
	public void setHeight(double height) {
		this.height = height;
	}
	
	/**��������д,������ε����*/
	public double getArea() {
		return width * height;
	}
	
	/**��������д,������ε��ܳ�*/
	public double getPerimeter() {
		return (width + height) * 2;
	}

	/**��������д,���ؾ��εĸ�������*/
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getColor()=" + getColor() + ", isFilled()="
				+ isFilled() + ", getDateCreated()=" + getDateCreated() + "]";
	}
}
