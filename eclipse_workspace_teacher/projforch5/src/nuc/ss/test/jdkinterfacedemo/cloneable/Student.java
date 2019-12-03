package nuc.ss.test.jdkinterfacedemo.cloneable;

public class Student implements Cloneable {
	private int num;
	private String name;
	private float score;

	public Student(int num, String name, float score) {
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public String toString() {
		return "Ñ§ºÅ:" + num + " ; ÐÕÃû:" + name + " ; ³É¼¨:" + score;
	}

	
	 public Object clone() throws CloneNotSupportedException{ 
		 return super.clone();
	 }
	 
}
