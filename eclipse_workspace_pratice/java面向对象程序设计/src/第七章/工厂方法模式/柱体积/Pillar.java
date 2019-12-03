package 第七章.工厂方法模式.柱体积;

import java.util.Scanner;

public class Pillar {
    private Geometry bottom;
    private float height;
    
	public Pillar(Geometry bottom) {
		super();
		System.out.println("请输入柱体的高:");
		Scanner sc = new Scanner(System.in);
		this.bottom = bottom;
		this.height = sc.nextFloat();
		}
	
    public float getVolume() {
    	return bottom.getArea() * height;
    }
}
