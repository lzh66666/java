package nuc.ss.test.abstractdemo.animal4;

public class Simulator {
	public static void playSound(Animal animal) {
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
	}
}
