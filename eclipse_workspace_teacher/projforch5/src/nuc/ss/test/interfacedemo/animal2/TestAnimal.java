package nuc.ss.test.interfacedemo.animal2;

public class TestAnimal {

	public static void main(String[] args) {
		IAnimal animal = new Dog();
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
		
		animal = new Cat();
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
	}
	
}
