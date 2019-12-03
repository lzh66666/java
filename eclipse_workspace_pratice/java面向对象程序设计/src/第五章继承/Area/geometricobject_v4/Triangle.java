package �����¼̳�.Area.geometricobject_v4;
/**
 * ������
 * @author ¬��
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

	/**������,��������εĵ�һ����*/
	public double getOneSide() {
		return oneSide;
	}

	/**������,���������εĵ�һ����*/
	public void setOneSide(double oneSide) {
		this.oneSide = oneSide;
	}

	/**������,��������εĵڶ�����*/
	public double getTwoSide() {
		return twoSide;
	}

	/**������,���������εĵڶ�����*/
	public void setTwoSide(double twoSide) {
		this.twoSide = twoSide;
	}

	/**������,��������εĵ�������*/
	public double getThreeSide() {
		return threeSide;
	}

	/**������,���������εĵ�������*/
	public void setThreeSide(double threeSide) {
		this.threeSide = threeSide;
	}

	/**��������д,���������ε����*/
	@Override
	public double getArea() {
		double p = (getOneSide()+getTwoSide()+getThreeSide())/2;
		return Math.sqrt(p*(p-getOneSide())*(p-getTwoSide())*(p-getThreeSide()));
	}

	/**��������д,���������ε��ܳ�*/
	@Override
	public double getPerimeter() {
		return getOneSide()+getTwoSide()+getThreeSide();
	}

	/**��������д,���������εĸ�������*/
	@Override
	public String toString() {
		return "Triangle [oneSide=" + oneSide + ", twoSide=" + twoSide + ", threeSide=" + threeSide + ", getOneSide()="
				+ getOneSide() + ", getTwoSide()=" + getTwoSide() + ", getThreeSide()=" + getThreeSide()
				+ ", getColor()=" + getColor() + ", isFilled()=" + isFilled() + ", getDateCreated()=" + getDateCreated()
				+ "]";
	}
	
	
}
