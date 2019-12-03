package nuc.ss.test.abstractdemo.animal3;

public class TestAnimal {

	public static void main(String[] args) {
		playSound(new Dog());
		
		playSound(new Cat());
		
	}
	
	private static void playSound(Animal animal) {
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
	}
	
}
