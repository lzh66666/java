package nuc.ss.test.jdkinterfacedemo.comparable;

public class TestStudentComparable {
	public static void main(String[] args){
		Student stu1 = new Student(18002, "�Ŵ�", 98.6f);
		Student stu2 = new Student(18001, "١С��", 98.5f);
		if(stu1.compareTo(stu2) >= 0){ // �����󡱶������ڡ�С������ǰ��
			System.out.println(stu1 + "\n" + stu2); 
		}else{
			System.out.println(stu2 + "\n" + stu1);
		}
	} 
}

