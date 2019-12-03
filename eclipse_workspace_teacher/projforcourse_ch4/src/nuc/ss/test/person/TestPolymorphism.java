package nuc.ss.test.person;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("张三",18,"软件工程");
        p.speak();
        p = new Teacher("黎民",34,"副教授");
        p.speak();
	}

}
