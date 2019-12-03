package nuc.ss.test.abstractdemo.animal3;

public class TestAnimal {

	public static void main(String[] args) {
		playSound(new Dog());
		
		playSound(new Cat());
		
	}
	
	private static void playSound(Animal animal) {
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
	}
	
}
