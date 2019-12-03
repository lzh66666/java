package nuc.ss.test.shape;

public class Ladder extends Shape {
	private int height;
	public Ladder(int upBottom,int downBottom,int height) {
		// TODO Auto-generated constructor stub
		super(upBottom,downBottom);
		this.height=height;
	}
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (side1+side2)*height/2;
	}
}

