package 第五章继承.Area.geometricobject_v4;
/**
 * 等腰梯形
 * @author 卢泽华
 *
 */
public class Trapezoid extends GeometricObject{
	private double upper;
	private double down;
	private double high;
	private double waist;
	
	public Trapezoid() {
		
	}

	public Trapezoid(double upper, double down, double high,double waist) {
		super();
		this.upper = upper;
		this.down = down;
		this.high = high;
		this.waist = waist;
	}

	public Trapezoid(double upper, double down, double high,double waist,String color, boolean filled) {
		super(color, filled);
		this.upper = upper;
		this.down = down;
		this.high = high;
	}

	/**访问器,获得梯形的上底*/
	public double getUpper() {
		return upper;
	}

	/**更改器,设置梯形的上底*/
	public void setUpper(double upper) {
		this.upper = upper;
	}

	/**访问器,获得梯形的下底*/
	public double getDown() {
		return down;
	}

	/**更改器,设置梯形的下底*/
	public void setDown(double down) {
		this.down = down;
	}

	/**访问器,获得梯形的高*/
	public double getHigh() {
		return high;
	}

	/**更改器,设置梯形的高*/
	public void setHigh(double high) {
		this.high = high;
	}
	
	/**访问器,获得梯形的腰*/
	public double getWaist() {
		return waist;
	}

	/**更改器,设置梯形的腰*/
	public void setWaist(double waist) {
		this.waist = waist;
	}

	/**方法的重写,计算梯形的周长*/
	@Override
	public double getPerimeter() {
		return getDown()+getUpper()+getWaist()*2;
	}

	/**方法的重写,计算梯形的面积*/
	@Override
	public double getArea() {
		return (getUpper() + getDown())*getHigh()/2;
	}

	/**方法的重写,返回梯形的属性和颜色填充以及日期*/
	@Override
	public String toString() {
		return "Trapezoid [upper=" + upper + ", down=" + down + ", high=" + high + ", waist=" + waist + ", getUpper()="
				+ getUpper() + ", getDown()=" + getDown() + ", getHigh()=" + getHigh() + ", getWaist()=" + getWaist()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated()
				+ "]";
	}

}
