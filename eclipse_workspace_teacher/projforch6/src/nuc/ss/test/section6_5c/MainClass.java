package nuc.ss.test.section6_5c;

public class MainClass {

	public static void main(String[] args) {
		
		Student stu;
		try {
			stu = new Student("b18001", "Õı»®∫Õ", 89.9f);
			System.out.println(stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

}
