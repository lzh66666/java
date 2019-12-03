package cn.sxt.oo2;

/**
 * 测试封装
 * @author 卢泽华
 *
 */
public class TestEncapsulation {
	public static void main(String[] args) {
		Human h=new Human();
		//age不可见
//		h.age=12;
		h.name="卢泽华";
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
		//继承父类age，但是不可用，子类无法使用父类的私有属性和方法
//		System.out.println(age);
		Human h=new Human();
		h.height=210;
		h.sayage();
	}
}