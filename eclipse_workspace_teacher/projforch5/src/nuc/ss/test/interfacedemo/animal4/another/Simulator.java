package nuc.ss.test.interfacedemo.animal4.another;

public class Simulator {
	public void playSound(Animal animal) {
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
	}
}
