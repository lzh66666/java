package nuc.ss.test.interfacedemo.animal4;

public class TestAnimal {

	public static void main(String[] args) {
		Simulator simulator = new Simulator();
		simulator.playSound(new Dog());
		simulator.playSound(new Cat());
	}
	
}
