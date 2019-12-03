package nuc.ss.test.interfacedemo.animal1;

public class TestIAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		System.out.println(dog.getAnimalName());
		dog.cry();
		
		Cat cat = new Cat();
		System.out.println(cat.getAnimalName());
		cat.cry();
	}

}
