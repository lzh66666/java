package ��һ�¸���;
/**
 * HelloWorld����3
 * @author ¬��
 *
 */
public class HelloWorld3 {
	public static void main(String[] args) {
		Student2 zhangsan = new Student2();
		Student2 lisi = new Student2();
		
		zhangsan.setName("����");
		lisi.setName("����");
		
		zhangsan.sayHello(lisi.name);
		lisi.sayHello(zhangsan.name);
	}
}

class Student2{
	String name;

	public void setName(String name) {
		this.name = name;
	}

	public void sayHello(String name1) {
		System.out.println(name+"˵"+":hello,"+name1);
	}
}
