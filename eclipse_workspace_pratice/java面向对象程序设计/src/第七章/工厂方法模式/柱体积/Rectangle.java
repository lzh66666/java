package 第七章.工厂方法模式.柱体积;

import java.util.Scanner;

public class Rectangle implements Geometry {
    private float length;
    private float width;
    
    public Rectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入长和宽：");
		length = sc.nextFloat();
		width = sc.nextFloat();
	}
    
	public Rectangle(float length, float width) {
		super();
		this.length = length;
		this.width = width;
	}
	
	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return length * width;
	}

}
