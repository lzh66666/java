package nuc.ss.test.shape;

public abstract class Shape {
	protected int side1;
	protected int side2;
	//�޲εĹ��췽��
	public Shape() {
		// TODO Auto-generated constructor stub
		
	}
	//��һ�������Ĺ��췽��
	public Shape(int side1){
		this.side1=side1;
	}
	//�����������Ĺ��췽��
	public Shape(int side1,int side2){
		this.side1=side1;
		this.side2=side2;
	}
	//������������óɳ�����
	public abstract float getArea();
}
