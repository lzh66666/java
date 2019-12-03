package nuc.ss.test.abstractdemo.animal4;

public class Simulator {
	public static void playSound(Animal animal) {
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
	}
}
