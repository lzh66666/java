package nuc.ss.test.person;

public class Person {
	private String name;
	private int age;
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void speak() {
		System.out.println("�ҽ�"+ name +",����" + age + "�ꣻ");
	}
}
