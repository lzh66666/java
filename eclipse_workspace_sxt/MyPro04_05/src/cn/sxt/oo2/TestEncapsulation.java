package cn.sxt.oo2;

/**
 * ���Է�װ
 * @author ¬��
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//age���ɼ�
//		h.age=12;
		h.name="¬��";
		h.height=230;
		h.sayage();
		
		Person4 p4 =new Person4();
		p4.setAge(14);
		System.out.println(p4.getAge());
		p4.getName();
		
	}
}

class  Boy extends Human{
	void sayHello() {
		//�̳и���age�����ǲ����ã������޷�ʹ�ø����˽�����Ժͷ���
//		System.out.println(age);
		Human h=new Human();
		h.height=210;
		h.sayage();
	}
}