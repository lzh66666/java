package nuc.ss.test.section7_1_3a;

class Pillar {
	private Circle bottom;
	private double height;
	public Pillar(Circle bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}
	public double getVolume() {
		return(bottom.getArea() * height);
	}
}
