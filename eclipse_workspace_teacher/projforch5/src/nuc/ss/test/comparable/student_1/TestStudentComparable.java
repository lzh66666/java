package nuc.ss.test.comparable.student_1;

class Student implements Comparable{
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
	      return "学号:" + num + "; 姓名:" + name + "; 成绩:" + score;
	   }
	   public int compareTo(Object o){
	      Student stu = (Student)o;
	      if(this.score > stu.score){
	          return 1;  
	      }else if(this.score < stu.score){
	          return -1;  
	      }else{
	          if(this.num > stu.num){
	              return -1; 
	          }else if(this.num < stu.num){
	              return 1;
	          }else{
	              return 0;
	          } 
	      }
	   }
	}

	public class TestStudentComparable{
	   public static void main(String[] args){
	      Student stu1 = new Student(17001,"张大江",99.5f);
	      Student stu2 = new Student(17002,"佟小菲",99.5f);
	      if(stu1.compareTo(stu2)>=0){ // 将“大”对象排在“小”对象前面
	         System.out.println(stu1+"\n"+stu2); 
	      }else{
	         System.out.println(stu2+"\n"+stu1);
	      }
	   } 
	}

