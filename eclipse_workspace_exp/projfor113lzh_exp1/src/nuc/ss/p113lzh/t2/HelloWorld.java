package nuc.ss.p113lzh.t2;
/**
 * HelloWorld���������汾
 * @author ¬��
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		/**��һ���汾*/
		System.out.println("Hello World!");
		
		/**�ڶ����汾*/
		Student s = new Student();
		s.speak("Hello World!");
		
		/**�������汾*/
		Student2 zhangsan = new Student2();
		Student2 lisi = new Student2();
		
		zhangsan.setName("����");
		lisi.setName("����");
		
		zhangsan.sayHello(lisi.name);
		lisi.sayHello(zhangsan.name);
	}
}

class Student{
	public void speak(String sentence) {
		System.out.println(sentence);
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
