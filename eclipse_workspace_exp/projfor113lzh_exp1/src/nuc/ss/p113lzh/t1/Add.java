package nuc.ss.p113lzh.t1;

import java.util.Scanner;
/**
 *��������������� ���������
 * @author Administrator
 *
 */
public class Add {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = 0.0;
		
		/**������̼���������֮��*/
		c = add(a, b);
		System.out.println(a + "+" + b + "=" +c);
		
		/**��������������֮��*/
		Face_Object sum = new Face_Object(a,b);
		System.out.println(sum.getA() + "+" + sum.getB() + "=" +sum.add(a, b));
		
	}
	static double add(double a,double b) {
		return a+b;
	}
}

class Face_Object{
	private double a;
	private double b;
	
	public Face_Object(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}
	
	public double  add(double a,double b) {
		return a+b;
	}
	
}
