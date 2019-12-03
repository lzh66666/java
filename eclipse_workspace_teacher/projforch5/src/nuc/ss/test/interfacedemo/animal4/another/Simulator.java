package nuc.ss.test.interfacedemo.animal4.another;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
	}
}
