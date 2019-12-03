package nuc.ss.test.comparable.student_2;

import java.util.Arrays;
public class TestStudentComparable{
     public static void main(String[] args){
          Student[] students 
			      = { new Student(17001,"�Ŵ�", 86.0f),
			          new Student(17002,"١С��", 80.0f),
			          new Student(17003,"�����", 98.5f),
			          new Student(17004,"��ٳ�", 80.0f),
			          new Student(17005,"١С��", 100.0f) };
          Arrays.sort(students);  
          for(Student stu: students){
                   System.out.println(stu);
           }
    }   
}

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
      return "ѧ��:" + num + "; ����:" + name + "; �ɼ�:" + score;
   }
   public int compareTo(Object o){
      Student stu = (Student)o;
      if(this.score > stu.score){
          return -1;  
      }else if(this.score < stu.score){
          return 1;  
      }else{
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