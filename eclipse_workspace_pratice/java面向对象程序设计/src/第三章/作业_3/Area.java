package 第三章.作业_3;
/**
 * 面积的计算
 * @author 卢泽华
 *
 */

public class Area {
	public static void main(String[] args) {
		getArea(2.0);//圆的面积
		getArea(2.0,3.0);//矩形的面积
		getArea(2.0,3.0,4.0);//长方体的表面积
		getArea(2.0,6.0f);//圆柱的表面积
		
	}
	
	public static void getArea(double r) {
		System.out.println("圆的面积: "+Math.PI*r*r); 
	}
	
	public static void getArea(double a,double b) {
		System.out.println("矩形的面积: "+a*b);
	}
	
	public static void getArea(double a,double b,double c) {
		System.out.println("长方体的表面积: "+2*(a*b + b*c + a*c)); 
	}
	
	public static void getArea(double r,float h) {
		System.out.println("圆柱的表面积: "+Math.PI*r*r*h); 
	}
	
}
