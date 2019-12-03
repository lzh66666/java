package nuc.ss.test.shape;

public abstract class Shape {
	protected int side1;
	protected int side2;
	//无参的构造方法
	public Shape() {
		// TODO Auto-generated constructor stub
		
	}
	//带一个参数的构造方法
	public Shape(int side1){
		this.side1=side1;
	}
	//带两个参数的构造方法
	public Shape(int side1,int side2){
		this.side1=side1;
		this.side2=side2;
	}
	//计算面积，设置成抽象类
	public abstract float getArea();
}
