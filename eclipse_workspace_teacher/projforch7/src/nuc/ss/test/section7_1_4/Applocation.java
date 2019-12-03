package nuc.ss.test.section7_1_4;

public class Applocation {
	public static void main(String[] args) {
		Computer computer = new Computer();
		
		computer.setCom(new ComImpl1());
		System.out.println(computer.getCom());
		System.out.println(computer.f(5, 3));
		
		computer.setCom(new ComImpl2());
		System.out.println(computer.getCom());
		System.out.println(computer.f(5, 3));
	}

}
