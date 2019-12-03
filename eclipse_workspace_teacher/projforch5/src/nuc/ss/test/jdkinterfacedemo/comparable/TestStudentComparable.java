package nuc.ss.test.jdkinterfacedemo.comparable;

public class TestStudentComparable {
	public static void main(String[] args){
		Student stu1 = new Student(18002, "张大江", 98.6f);
		Student stu2 = new Student(18001, "佟小菲", 98.5f);
		if(stu1.compareTo(stu2) >= 0){ // 将“大”对象排在“小”对象前面
			System.out.println(stu1 + "\n" + stu2); 
		}else{
			System.out.println(stu2 + "\n" + stu1);
		}
	} 
}

