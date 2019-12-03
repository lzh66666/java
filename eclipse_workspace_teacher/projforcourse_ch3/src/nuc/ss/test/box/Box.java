package nuc.ss.test.box;

public class Box {
	private float length;
	private float width;
	private float height;
	//构造正方体的盒子
	Box(float side){
		length = side;
		width = side;
		height = side;
	}
	//构造长方体的盒子
	Box(float length,float width,float height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	public float getVolume() {
		return length * width * height;
	}
}
