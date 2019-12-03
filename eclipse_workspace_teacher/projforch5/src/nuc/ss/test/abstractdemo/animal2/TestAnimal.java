package nuc.ss.test.abstractdemo.animal2;

public class TestAnimal {

	public static void main(String[] args) {
		Animal animal = new Dog();
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
		
		animal = new Cat();
		System.out.println("现在播放" + animal.getAnimalName() + "类的叫声：");
		animal.cry();
	}
	
}
