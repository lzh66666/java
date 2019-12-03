package 第七章.工厂方法模式.柱体积;

import java.util.Scanner;

public class Circle implements Geometry {
    private float r;
    
    public Circle() {
		System.out.println("请输入圆的半径：");
		Scanner sc = new Scanner(System.in);
		r = sc.nextFloat();
	}
    
	public Circle(float r) {
		super();
		this.r = r;
	}

	@Override
	public float getArea() {
		// TODO Auto-generated method stub
		return (float)Math.PI * r * r;
	}

}
