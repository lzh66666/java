package ������.��ҵ_3;
/**
 * ����ļ���
 * @author ¬��
 *
 */

public class Area {
	public static void main(String[] args) {
		getArea(2.0);//Բ�����
		getArea(2.0,3.0);//���ε����
		getArea(2.0,3.0,4.0);//������ı����
		getArea(2.0,6.0f);//Բ���ı����
		
	}
	
	public static void getArea(double r) {
		System.out.println("Բ�����: "+Math.PI*r*r); 
	}
	
	public static void getArea(double a,double b) {
		System.out.println("���ε����: "+a*b);
	}
	
	public static void getArea(double a,double b,double c) {
		System.out.println("������ı����: "+2*(a*b + b*c + a*c)); 
	}
	
	public static void getArea(double r,float h) {
		System.out.println("Բ���ı����: "+Math.PI*r*r*h); 
	}
	
}
