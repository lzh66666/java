package nuc.ss.test.jdkinterfacedemo.comparable;

public class Student implements Comparable{
	private int num; 
	private String name;
	private float score;
	
	public Student(){
	}
	
	public Student(int num, String name, float score){
		this.num = num;
		this.name = name;
		this.score = score;
	}
	
	public String toString(){
		return "Ñ§ºÅ:" + num + "; ÐÕÃû:" + name + "; ³É¼¨:" + score;
	}
	Student stu;
	public int compareTo(Object o){
		if(o instanceof Student) {
			stu = (Student)o;
		}
		
		if(this.score > stu.score){
			return -1;  
		}
		else if(this.score < stu.score){
			return 1;  
		}
		else{
			if(this.num > stu.num){
				return 1; 
			}else if(this.num < stu.num){
				return -1;
			}else{
				return 0;
			} 
		}
	}
}