package 第七章.单例模式.身份证;

public class Person {
	private String name;
	private static IdentityCardNo id;
		
	public Person(String name) {
		super();
		this.name = name;
		id = IdentityCardNo.getInstance();
	}
	
	public String toString() {
		return "你的名字：" + name + "您的身份证号" + id;
	}

	public static void main(String[] args) {
		Person person = new Person("dass");
		System.out.println(person);
	}
}
