package cn.sxt.oo2;

public class Human {
//	private只是自己可见
	private int age;
//	Default(可以省略不写)同一个包里的都可以使用
	String name;
//	protected可以被同一个包的类以及其他报的子类使用
	protected int height;
	//public任何地方都可以用
	public void sayage() {
		System.out.println(age);
	}
}
