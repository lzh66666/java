package nuc.ss.test.jdkinterfacedemo.comparable;

import java.util.Arrays;

public class TestStudentSort {
     public static void main(String[] args){
          Student[] students 
			      = { new Student(18001, "张大江", 86.0f),
			          new Student(18002, "佟小菲", 80.0f),
			          new Student(18003, "江天河", 98.5f),
			          new Student(18004, "彭百成", 80.0f),
			          new Student(18005, "黄旭龙", 100.0f) };
          Arrays.sort(students);  
          for(Student stu: students){
                   System.out.println(stu);
           }
    }   
}
