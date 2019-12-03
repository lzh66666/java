package nuc.ss.test.section9_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		//声明并创建list：使用ArrayList类（底层采用动态数组存储元素）
		List<Student> list = new ArrayList<Student>(); //使用泛型

		// 添加元素
		Student s1 = new Student(18001, "王宝国", 20);
		Student s2 = new Student(18006, "张春晖", 21);
		Student s3 = new Student(18003, "李高兴", 19);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(new Student(18008, "吴彭钢", 26));
		
		//替换元素
		Student s4 = new Student(18009, "甄健康", 22);
		list.set(2, s4);
		
		//遍历：用for循环实现对List中元素的遍历		
		System.out.println("\n采用for循环实现对List中元素的遍历");
		for(int i = 0; i < list.size(); i++){
			System.out.println(list.get(i));	
		}
		
		//删除元素
		list.remove(1);
		
		//遍历：用增强for循环
		System.out.println("\n删除索引是 1 的对象后，用增强for遍历List中元素");
		for(Student stu : list){
			System.out.println(stu);
		}	
		
		//遍历：使用迭代器遍历方式		
		System.out.println("\n采用迭代器实现对List中元素的遍历");
		
	}
}
