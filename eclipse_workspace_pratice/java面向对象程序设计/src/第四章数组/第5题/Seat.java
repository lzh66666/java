package ����������.��5��;

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
		System.out.println("����������ѡ��:");
		int i = passenger.nextInt();
		
		while(i!=3) {
			switch (i) {
				case 0:
					System.out.println("��ѡ�����"+type[i]+",ֻ��ѡ���1�ź͵�2��!");
					f.Select(seat);
					break;
				case 1:
					System.out.println("��ѡ�����"+type[i]+",ֻ��ѡ�����1,2���Ժ��λ��!");
					f.Select1(seat);
					break;
				case 2:
					System.out.println("*��ʾδ��ѡ��,#��ʾ�Ѿ���ѡ���");
					f.print(seat);
					break;
				default:
					System.out.println("�������ѡ�Ŵ���,����������!");
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
		System.out.println("[0]-->ͷ�Ȳ�");
		System.out.println("[1]-->���ò�");
		System.out.println("[2]-->��λ�����");
		System.out.println("[3]-->�˳�");
	}
	public String[][] Select(String[][] seat){
		System.out.println("��������ѡ��ĵڼ��еڼ��е���λ(��: 1 2):");
		Scanner passenger = new Scanner(System.in);
		int pX = passenger.nextInt();
		int pY = passenger.nextInt();
		
		while(pX>2) {
			System.out.println("����ѡ�����,ֻ��ѡ���1,2��,����������");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		while(seat[pX-1][pY-1] == "#") {
			System.out.println("����λ�Ѿ���ѡ!����������!");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		if(seat[pX-1][pY-1] != "#") {
			seat[pX-1][pY-1] = "#";
			System.out.println("���Ѿ�ѡλ�ɹ�! ��:��"+pX+"��"+pY+"λ,��Ǻ�������λ��!");
		}
		
		return seat;
	}
	public String[][] Select1(String[][] seat){
		System.out.println("��������ѡ��ĵڼ��еڼ��е���λ(��: 3 5):");
		Scanner passenger = new Scanner(System.in);
		int pX = passenger.nextInt();
		int pY = passenger.nextInt();
		
		while(pX<2) {
			System.out.println("����ѡ�����,ֻ��ѡ���1,2���������λ,����������");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		while(seat[pX-1][pY-1] == "#") {
			System.out.println("����λ�Ѿ���ѡ!����������!");
			pX = passenger.nextInt();
			pY = passenger.nextInt();
		}
		
		if(seat[pX-1][pY-1] != "#") {
			seat[pX-1][pY-1] = "#";
			System.out.println("���Ѿ�ѡλ�ɹ�! ��:��"+pX+"��"+pY+"λ,��Ǻ�������λ��!");
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
	ͷ�Ȳ�,���ò�
}
