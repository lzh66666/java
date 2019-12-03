package 第五章继承.Area.geometricobject_v4;

import java.util.Date;

public class GeometricObject {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	/**创建一个空的构造器*/
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}
	
	/**创建一个带有属性color和filled的构造器*/
	public GeometricObject(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
	}
	
	/**访问器,返回color*/
	public String getColor() {
		return color;
	}
	
	/**更改器,设置color*/
	public void setColor(String color) {
		this.color = color;
	}
	
	/**访问器,返回filled*/
	public boolean isFilled() {
		return filled;
	}
	
	/**更改器,设置filled*/
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	/**访问器,获得当前日期*/
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	/**方法重载,返回一个字符串*/
	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	/**计算某种几何的面积*/
	public double getArea() {
		return 0;
	}
	
	/**计算某种几何的周长*/
	public double getPerimeter() {
		return 0;
	}
}
