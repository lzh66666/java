package nuc.ss.test.jdkinterfacedemo.comparable;

import java.util.Arrays;

public class TestStudentSort {
     public static void main(String[] args){
          Student[] students 
			      = { new Student(18001, "�Ŵ�", 86.0f),
			          new Student(18002, "١С��", 80.0f),
			          new Student(18003, "�����", 98.5f),
			          new Student(18004, "��ٳ�", 80.0f),
			          new Student(18005, "������", 100.0f) };
          Arrays.sort(students);  
          for(Student stu: students){
                   System.out.println(stu);
           }
    }   
}
