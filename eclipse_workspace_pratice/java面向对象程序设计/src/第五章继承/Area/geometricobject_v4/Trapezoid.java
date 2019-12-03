package �����¼̳�.Area.geometricobject_v4;
/**
 * ��������
 * @author ¬��
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

	/**������,������ε��ϵ�*/
	public double getUpper() {
		return upper;
	}

	/**������,�������ε��ϵ�*/
	public void setUpper(double upper) {
		this.upper = upper;
	}

	/**������,������ε��µ�*/
	public double getDown() {
		return down;
	}

	/**������,�������ε��µ�*/
	public void setDown(double down) {
		this.down = down;
	}

	/**������,������εĸ�*/
	public double getHigh() {
		return high;
	}

	/**������,�������εĸ�*/
	public void setHigh(double high) {
		this.high = high;
	}
	
	/**������,������ε���*/
	public double getWaist() {
		return waist;
	}

	/**������,�������ε���*/
	public void setWaist(double waist) {
		this.waist = waist;
	}

	/**��������д,�������ε��ܳ�*/
	@Override
	public double getPerimeter() {
		return getDown()+getUpper()+getWaist()*2;
	}

	/**��������д,�������ε����*/
	@Override
	public double getArea() {
		return (getUpper() + getDown())*getHigh()/2;
	}

	/**��������д,�������ε����Ժ���ɫ����Լ�����*/
	@Override
	public String toString() {
		return "Trapezoid [upper=" + upper + ", down=" + down + ", high=" + high + ", waist=" + waist + ", getUpper()="
				+ getUpper() + ", getDown()=" + getDown() + ", getHigh()=" + getHigh() + ", getWaist()=" + getWaist()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated()
				+ "]";
	}

}
