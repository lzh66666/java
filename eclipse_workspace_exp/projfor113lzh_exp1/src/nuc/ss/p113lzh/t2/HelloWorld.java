package nuc.ss.p113lzh.t2;
/**
 * HelloWorld测试三个版本
 * @author 卢泽华
 *
 */
public class HelloWorld {
	public static void main(String[] args) {
		/**第一个版本*/
		System.out.println("Hello World!");
		
		/**第二个版本*/
		Student s = new Student();
		s.speak("Hello World!");
		
		/**第三个版本*/
		Student2 zhangsan = new Student2();
		Student2 lisi = new Student2();
		
		zhangsan.setName("张三");
		lisi.setName("李四");
		
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
		System.out.println(name+"说"+":hello,"+name1);
	}
}
