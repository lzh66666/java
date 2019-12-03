package 第五章继承.Area.geometricobject_v4;
/**
 * 三角形
 * @author 卢泽华
 *
 */
public class Triangle extends GeometricObject{
	private double oneSide;
	private double twoSide;
	private double threeSide;
	
	public Triangle() {
		
	}

	public Triangle(double oneSide, double twoSide, double threeSide) {
		super();
		this.oneSide = oneSide;
		this.twoSide = twoSide;
		this.threeSide = threeSide;
	}
	
	public Triangle(double oneSide, double twoSide, double threeSide,String color,boolean filled) {
		super(color,filled);
		this.oneSide = oneSide;
		this.twoSide = twoSide;
		this.threeSide = threeSide;
	}

	/**访问器,获得三角形的第一条边*/
	public double getOneSide() {
		return oneSide;
	}

	/**更改器,设置三角形的第一条边*/
	public void setOneSide(double oneSide) {
		this.oneSide = oneSide;
	}

	/**访问器,获得三角形的第二条边*/
	public double getTwoSide() {
		return twoSide;
	}

	/**更改器,设置三角形的第二条边*/
	public void setTwoSide(double twoSide) {
		this.twoSide = twoSide;
	}

	/**访问器,获得三角形的第三条边*/
	public double getThreeSide() {
		return threeSide;
	}

	/**更改器,设置三角形的第三条边*/
	public void setThreeSide(double threeSide) {
		this.threeSide = threeSide;
	}

	/**方法的重写,计算三角形的面积*/
	@Override
	public double getArea() {
		double p = (getOneSide()+getTwoSide()+getThreeSide())/2;
		return Math.sqrt(p*(p-getOneSide())*(p-getTwoSide())*(p-getThreeSide()));
	}

	/**方法的重写,计算三角形的周长*/
	@Override
	public double getPerimeter() {
		return getOneSide()+getTwoSide()+getThreeSide();
	}

	/**方法的重写,返回三角形的各种属性*/
	@Override
	public String toString() {
		return "Triangle [oneSide=" + oneSide + ", twoSide=" + twoSide + ", threeSide=" + threeSide + ", getOneSide()="
				+ getOneSide() + ", getTwoSide()=" + getTwoSide() + ", getThreeSide()=" + getThreeSide()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated()
				+ "]";
	}
	
	
}
