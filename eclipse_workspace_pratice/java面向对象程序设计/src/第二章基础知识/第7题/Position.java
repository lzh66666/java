package 第二章基础知识.第7题;

import java.util.Scanner;

public class Position {
	public static void main(String[] args) {
		Scanner p = new Scanner(System.in);
		System.out.println("请输入一个坐标(例如:1 2)");
		int x = p.nextInt();
		int y = p.nextInt();
		Coordinate w = new Coordinate();
		w.setX(x);
		w.setY(y);
		w.print();
	}
}

class Coordinate{
	int x;
	int y;
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void print() {
		if(this.x == 0 && this.y == 0) {
			System.out.println("(0,0) is origin");
		}
		else if(x == 0){
			System.out.println("(0,"+y+") is on the y-axis");
		}
		else if(y == 0) {
			System.out.println("("+x+",0) is on the x-axis");
		}
		else if(x>0 && y>0) {
			System.out.println("("+x+","+y+") is on the first quadrant");
		}
		else if(x<0 && y>0) {
			System.out.println("("+x+","+y+") is on the second quadrant");
		}
		else if(x<0 && y<0) {
			System.out.println("("+x+","+y+") is on the third quadrant");
		}
		else if(x>0 && y<0) {
			System.out.println("("+x+","+y+") is on the forth quadrant");
		}
	}
}
