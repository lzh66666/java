package �����¼̳�.Area.geometricobject_v4;

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

	/**������,���Բ��radius*/
	public double getRadius() {
		return radius;
	}

	/**������,����Բ��radius*/
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/**��������д,Բ�����*/
	public double getArea() {
		return radius * radius * Math.PI;
	}
	/**��������д,Բ���ܳ�*/
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	/**������,���Բ��ֱ��*/
	public double getDiameter() {
		return 2 * radius;
	}
	
	/**��������д,����Բ�ĸ������Ժ͸������ɫ��������*/
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", getColor()=" + getColor() + ", isFilled()=" + isFilled()
				+ ", getDateCreated()=" + getDateCreated() + "]";
	}
}
