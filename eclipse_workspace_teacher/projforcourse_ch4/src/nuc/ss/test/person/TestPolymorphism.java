package nuc.ss.test.person;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Student("����",18,"�������");
        p.speak();
        p = new Teacher("����",34,"������");
        p.speak();
	}

}
