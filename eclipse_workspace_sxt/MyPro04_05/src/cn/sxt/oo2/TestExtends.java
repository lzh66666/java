package cn.sxt.oo2;
/**
 * ���Լ̳�
 * @author ¬��
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.name="¬��";
		stu.height=170;
		stu.marjor="�������";
		stu.rest();
		stu.study();
		
		Student stu2=new Student("����",6,"�ھ��");
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof person);
		System.out.println(stu2 instanceof Object);
	}
}


class person{
	String name;
	int height;
	
	public void rest() {
		System.out.println("��Ϣһ�ᣡ");
	}
}

class Student extends person{
	String marjor;

	public void study() {
		System.out.println("ѧϰ��Сʱ��");
	}
	public Student(String name,int height,String marjor) {
		this.name=name;
		this.height=height;
		this.marjor=marjor;
	}
	public Student() {
		
	}
}
/*class Student{
	String name;
	int height;
	String marjor;
	
	public void study() {
		System.out.println("ѧϰ��Сʱ��");
	}
	public void rest() {
		System.out.println("��Ϣһ�ᣡ");
	}
	public Student(String name,int height,String marjor) {
		this.name=name;
		this.height=height;
		this.marjor=marjor;
	}
}*/