package ������.����ģʽ.���֤;

public class Person {
	private String name;
	private static IdentityCardNo id;
		
	public Person(String name) {
		super();
		this.name = name;
		id = IdentityCardNo.getInstance();
	}
	
	public String toString() {
		return "������֣�" + name + "�������֤��" + id;
	}

	public static void main(String[] args) {
		Person person = new Person("dass");
		System.out.println(person);
	}
}
