package cn.sxt.oo2;
/**
 * ������д�����ǣ�
 * @author ¬��
 *
 */
public class TestOverride {
	public static void main(String[] args) {
		Horse h=new Horse();
		h.run();
	}
}

class Vehicle{
	public void run() {
		System.out.println("�ܣ�");
	}
	public void stop() {
		System.out.println("ֹͣ��");
	}
	public person WhoIspsg() {
		return new person();
	}
}
class Horse extends Vehicle{
	public void run() {
		System.out.println("���㷭�ɣ��N�N�N�N��������");
	}
//	����ֵ�����������С�ڵ��ڸ���Student<person
//	����������ͬ
//	Ȩ�����������ڵ��ڸ���
	public Student WhoIspsg() {
		return new Student();
	}
}