package ������.��������ģʽ.�����;

import java.util.Scanner;

public class Circle implements Geometry {
    private float r;
    
    public Circle() {
		System.out.println("������Բ�İ뾶��");
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
