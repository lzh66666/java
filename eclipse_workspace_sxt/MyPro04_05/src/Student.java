/**
 *  类和对象
 * @author 卢泽华
 *
 */
public class Student {
	//只有属性是结构体
	//属性
	int id;
	String name;
	int age;
	
	Computer comp;//计算机
	
	//方法
	void study() {
		System.out.println("我在认真学习！！使用电脑："+comp.brand);
	}
	
	void play() {
		System.out.println("我在玩游戏！王者荣耀！");
	}
	
	//构造方法，就是用于创建这个类的对象,无参的方法可以由系统自动创建
	Student(){
	}
	
	//程序执行入口，必须要有
	public static void main(String[] args) {
		Student stu=new Student();//创建一个对象
		stu.play();
		stu.id=1001;
		stu.name="卢泽华";
		stu.age=22;
		
		Computer c1=new Computer();
		c1.brand="联想";
		
		stu.comp=c1;
		
		stu.play();
		stu.study();
	}
}
class Computer{
	String brand;
}
