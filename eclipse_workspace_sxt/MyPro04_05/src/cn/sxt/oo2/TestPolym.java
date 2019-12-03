package cn.sxt.oo2;
/**
 * 测试多态
 * @author Administrator
 *
 */
public class TestPolym {
	public static void main(String[] args) {
		animal a=new animal();
		animalCry(a);
//		Dog d=new Dog();
		animal d=new Dog();//自动向上转型
		animal c=new Cat();
		animalCry(d);
		
		Dog d2=(Dog)d;//强制向下转型
		d2.seeDoor();
		//猫不能转成狗，编译没错，运行报错
//		Dog d3=(Dog)c;
//		d3.seeDoor();
	}
	
	static void animalCry(animal a) {
		a.shout();
	}
}
//类加final不能继承
//final class animal{
class animal{
//	方法加final不能重写
//	public final void shout() {
//		System.out.println("叫了一声！");
//	}
	public void shout() {
		System.out.println("叫了一声！");
	}
}
//class animal{
//
//	public void shout() {
//		System.out.println("叫了一声！");
//	}
//}

class Cat extends animal{
	public void shout() {
		System.out.println("喵喵喵！");
	}
}
class Dog extends animal{
	public void shout() {
		System.out.println("汪汪汪！");
	}
	public void seeDoor() {
		System.out.println("看门！！！");
	}
}