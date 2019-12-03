package 第一章概述;
/**
 * HelloWorld测试3
 * @author 卢泽华
 *
 */
public class HelloWorld3 {
	public static void main(String[] args) {
		Student2 zhangsan = new Student2();
		Student2 lisi = new Student2();
		
		zhangsan.setName("张三");
		lisi.setName("李四");
		
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
		System.out.println(name+"说"+":hello,"+name1);
	}
}
