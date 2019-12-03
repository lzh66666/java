package 第四章数组.第5题;

import java.util.Scanner;

public class Seat {
	public static void main(String[] args) {
		String[][] seat = new String[13][6];
		Function f = new Function();
		f.Init(seat);
		
		TicketType[] type;
		type = TicketType.values();
		
		Scanner passenger = new Scanner(System.in);
		f.menu1();
		System.out.println("请输入您的选择:");
		int i = passenger.nextInt();
		
		while(i!=3) {
			switch (i) {
				case 0:
					System.out.println("您选择的是"+type[i]+",只能选择第1排和第2排!");
					f.Select(seat);
					break;
				case 1:
					System.out.println("您选择的是"+type[i]+",只能选择除第1,2排以后的位置!");
					f.Select1(seat);
					break;
				case 2:
					System.out.println("*表示未被选择,#表示已经被选择的");
					f.print(seat);
					break;
				default:
					System.out.println("您输入的选着错误,请重新输入!");
					break;
			}
			f.menu1();
			i = passenger.nextInt();
		}
	}

	
}
class Function{
	public String[][] Init(String[][] seat){
		for (int i = 0; i < seat.length; i++) {
			for (int j = 0; j < seat[i].length; j++) {
				seat[i][j] = "*";
			}
		}
		return seat;
	}
	public void menu1() {
		System.out.println("[0]-->头等舱");
		System.out.println("[1]-->经济舱");
		System.out.println("[2]-->座位表输出");
		System.out.println("[3]-->退出");
	}
	public String[][] Select(String[][] seat){
		System.out.println("请输入您选择的第几行第几列的座位(如: 1 2):");
		Scanner passenger = new Scanner(System.in);
		int pX = passenger.nextInt();
		int pY = passenger.nextInt();
		
		while(pX>2) {
			System.out.println("您的选择错误,只能选择第1,2排,请重新输入");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		while(seat[pX-1][pY-1] == "#") {
			System.out.println("该座位已经被选!请重新输入!");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		if(seat[pX-1][pY-1] != "#") {
			seat[pX-1][pY-1] = "#";
			System.out.println("您已经选位成功! 是:第"+pX+"排"+pY+"位,请记好您的座位码!");
		}
		
		return seat;
	}
	public String[][] Select1(String[][] seat){
		System.out.println("请输入您选择的第几行第几列的座位(如: 3 5):");
		Scanner passenger = new Scanner(System.in);
		int pX = passenger.nextInt();
		int pY = passenger.nextInt();
		
		while(pX<2) {
			System.out.println("您的选择错误,只能选择第1,2排以外的座位,请重新输入");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		while(seat[pX-1][pY-1] == "#") {
			System.out.println("该座位已经被选!请重新输入!");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		if(seat[pX-1][pY-1] != "#") {
			seat[pX-1][pY-1] = "#";
			System.out.println("您已经选位成功! 是:第"+pX+"排"+pY+"位,请记好您的座位码!");
		}
		return seat;
	}
	public void print(String[][] seat) {
		System.out.println("\tA\tB\tC\tD\tE\tF\n");
		int i = 1;
		for (String[] strings : seat) {
			System.out.print("row"+(i++));
			for (String p : strings) {
				System.out.print("\t"+p);
			}
			System.out.println("\n");
		}
	}
}

enum TicketType{
	头等舱,经济舱
}
