package nuc.ss.test.interfacedemo.animal4;

public class Simulator {
	public void playSound(IAnimal animal) {
		System.out.println("���ڲ���" + animal.getAnimalName() + "��Ľ�����");
		animal.cry();
	}
}
