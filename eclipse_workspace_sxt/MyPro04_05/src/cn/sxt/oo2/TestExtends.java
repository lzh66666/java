package cn.sxt.oo2;
/**
 * 测试继承
 * @author 卢泽华
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="卢泽华";
		stu.height=170;
		stu.marjor="软件工程";
		stu.rest();
		stu.study();
		
		Student stu2=new Student("嘻嘻",6,"挖掘机");
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof person);
		System.out.println(stu2 instanceof Object);
	}
}


class person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("休息一会！");
	}
}

class Student extends person{
	String marjor;

	public void study() {
		System.out.println("学习两小时！");
	}
	public Student(String name,int height,String marjor) {
		this.name=name;
		this.height=height;
		this.marjor=marjor;
	}
	public Student() {
		
	}
}
/*class Student{
	String name;
	int height;
	String marjor;
	
	public void study() {
		System.out.println("学习两小时！");
	}
	public void rest() {
		System.out.println("休息一会！");
	}
	public Student(String name,int height,String marjor) {
		this.name=name;
		this.height=height;
		this.marjor=marjor;
	}
}*/