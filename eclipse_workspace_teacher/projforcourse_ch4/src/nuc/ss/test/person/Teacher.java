package nuc.ss.test.person;

public class Teacher extends Person{
	private String positionalTitle;
	public Teacher(String name,int age,String positionalTitle) {
		super(name,age);
		this.positionalTitle = positionalTitle;
	}
	public void teach() {
		System.out.println("我是一名" + positionalTitle + "，我在用心教书育人;");
	} 
	public void speak() {
		super.speak();
		teach();
	}
}

