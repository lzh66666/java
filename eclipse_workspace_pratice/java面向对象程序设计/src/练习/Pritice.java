package Á·Ï°;

public class Pritice {
	public static void main(String[] args) {
		Object a1 = new A();
		Object a2 = new Object();
		System.out.println(a1);
		System.out.println(a2);
	}
}

class A{
	int x;
	public String toString() {
		return "x is  "+ x;
	}
}

