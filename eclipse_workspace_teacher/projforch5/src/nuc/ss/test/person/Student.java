package nuc.ss.test.person;

public class Student extends Person {
	private String major;
	public Student(String name,int age,String major) {
		super(name,age);
		this.major = major;
	}
	public void study() {
		System.out.println("��Ŭ��ѧϰ�ҵ�רҵ��" + major + ";");
	}
	
	@Override
	public void speak() {
		// TODO Auto-generated method stub
		super.speak();
		study();
	}



	
	
}

