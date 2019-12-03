package nuc.ss.test.section9_8b;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import nuc.ss.test.section9_4.Student;

public class TestComparator {
	public static void main(String[] args) {
		Student stu1, stu2, stu3, stu4, stu5;
		stu1 = new Student(18001, "张剑飞", 20); 	stu2 = new Student(18002, "李隆基", 18);
		stu3 = new Student(18003, "孙正贤", 19);	stu4 = new Student(18004, "赵匡胤", 20);
		stu5 = new Student(18005, "孔祥熙", 17);	
		
		// 创建TreeSet容器set1，按照年龄降序排序所有学生对象
		Set<Student> set1 = new TreeSet<Student>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				// TODO Auto-generated method stub
				int result = ((Student)o2).getAge() - ((Student)o1).getAge();
				if (result == 0 ) result = 1;
				return result;
			}
		});
		
		set1.add(stu1);		set1.add(stu2);		set1.add(stu3);
		set1.add(stu4);		set1.add(stu5);
		
		System.out.println("按照年龄降序排序的结果：");
		Iterator<Student> iter1 = set1.iterator();
		while(iter1.hasNext()) {
			System.out.println(iter1.next());
		}
		
		// 创建TreeSet容器set2，按照学号升序排序所有学生对象
		Set<Student> set2 = new TreeSet<Student>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Student)o1).getId() - ((Student)o2).getId();
			}	
		});
		set2.add(stu1);
		set2.add(stu2);
		set2.add(stu3);
		set2.add(stu4);
		set2.add(stu5);
		
		System.out.println("按照学号升序排序的结果：");
		Iterator<Student> iter2 = set2.iterator();
		while(iter2.hasNext()){
			System.out.println(iter2.next());
		}
	}
}

