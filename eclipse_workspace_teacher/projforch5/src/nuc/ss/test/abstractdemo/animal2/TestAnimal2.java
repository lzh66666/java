package nuc.ss.test.abstractdemo.animal2;

public class TestAnimal2 {

	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat()};
		for (int i = 0; i < animal.length; i++) {
			System.out.println("���ڲ���" + animal[i].getAnimalName() + "��Ľ�����");
			animal[i].cry();
		}

	}
	
}
