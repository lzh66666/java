package �����¼̳�.Area.geometricobject_v4;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**����һ���յĹ�����*/
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/**����һ����������color��filled�Ĺ�����*/
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	/**������,����color*/
	public String getColor() {
		return color;
	}
	
	/**������,����color*/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**������,����filled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**������,����filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**������,��õ�ǰ����*/
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/**��������,����һ���ַ���*/
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	/**����ĳ�ּ��ε����*/
	public double getArea() {
		return 0;
	}
	
	/**����ĳ�ּ��ε��ܳ�*/
	public double getPerimeter() {
		return 0;
	}
}
