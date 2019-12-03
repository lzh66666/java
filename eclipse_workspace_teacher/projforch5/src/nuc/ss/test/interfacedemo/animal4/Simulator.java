package nuc.ss.test.interfacedemo.animal4;

public class Simulator {
	public void playSound(IAnimal animal) {
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
	}
}
