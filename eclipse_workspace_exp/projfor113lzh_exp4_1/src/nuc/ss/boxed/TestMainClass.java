package nuc.ss.boxed;

import java.util.Scanner;

public class TestMainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input length and width of rectangle:");
		double rLength = sc.nextDouble();
		double rWidth = sc.nextDouble();
		
		Rectangle rectangle = new Rectangle(rLength,rWidth);
		
		System.out.println("Please input length ,width and height of rectangle:");
		double bLength = sc.nextDouble();
		double bWidth = sc.nextDouble();
		double bHeight = sc.nextDouble();
		
		Box box = new Box(bLength,bWidth,bHeight);
		
		sc.close();
		rectangle.print();
		System.out.println("#################################");
		box.print();
	}

}
