package cn.sxt.oo2;
/**
 * ���Զ�̬
 * @author Administrator
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		animal a=new animal();
		animalCry(a);
//		Dog d=new Dog();
		animal d=new Dog();//�Զ�����ת��
		animal c=new Cat();
		animalCry(d);
		
		Dog d2=(Dog)d;//ǿ������ת��
		d2.seeDoor();
		//è����ת�ɹ�������û�����б���
//		Dog d3=(Dog)c;
//		d3.seeDoor();
	}
	
	static void animalCry(animal a) {
		a.shout();
	}
}
//���final���ܼ̳�
//final class animal{
class animal{
//	������final������д
//	public final void shout() {
//		System.out.println("����һ����");
//	}
	public void shout() {
		System.out.println("����һ����");
	}
}
//class animal{
//
//	public void shout() {
//		System.out.println("����һ����");
//	}
//}

class Cat extends animal{
	public void shout() {
		System.out.println("��������");
	}
}
class Dog extends animal{
	public void shout() {
		System.out.println("��������");
	}
	public void seeDoor() {
		System.out.println("���ţ�����");
	}
}