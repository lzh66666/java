package ������.��������ģʽ.�����;

import java.util.Scanner;

public class Pillar {
    private Geometry bottom;
    private float height;
    
	public Pillar(Geometry bottom) {
		super();
		System.out.println("����������ĸ�:");
		Scanner sc = new Scanner(System.in);
		this.bottom = bottom;
		this.height = sc.nextFloat();
		}
	
    public float getVolume() {
    	return bottom.getArea() * height;
    }
}
