package nuc.ss.test.section9_6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nuc.ss.test.section9_4.Student;

public class TestIterator {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(1009, "li", 20);
		list.add(s1);
		list.add(new Student(1002, "li", 20));
		list.add(new Student(1004, "赵", 18));
		list.add(new Student(1001, "wang", 18));
		Student s2=new Student(1010, "薛", 22);
		list.set(3, s2);			
		list.remove(2);
		//用迭代器遍历List中元素
		Iterator iter = list.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}
}

