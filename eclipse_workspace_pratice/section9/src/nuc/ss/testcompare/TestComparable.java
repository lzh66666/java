package nuc.ss.testcompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * 
 * @author 卢泽华
 * @version 2019 11 19 14:22
 */
public class TestComparable {
	public static void main(String[] args) {
		
		Student stu1,stu2,stu3,stu4,stu5;
		stu1 = new Student(18001, "张剑飞", 20);
		stu2 = new Student(18001, "李隆基", 18);
		stu3 = new Student(18003, "孙正贤", 19);
		stu4 = new Student(18004, "赵匡胤", 20);
		stu5 = new Student(18005, "孙祥熙", 17);
//		方案一: 采用具有排序功能的容器类(TreeSet),放入实现了排序算法的对象
		Set<Student> set = new TreeSet<Student>();
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		//使用增强for循环输出方一的结果
		System.out.println("采用方案一排序的结果");
		for (Student student : set) {
			System.out.println(student);
		}
		
		//方案二:采用Collocations工具类,
		List<Student> list = new ArrayList<Student>();
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
		Collections.sort(list);
		System.out.println("采用方案二排序的结果");
		for (Student student : list) {
			System.out.println(student);
		}
		
		Student2 stu11,stu12,stu13,stu14,stu15;
		stu11 = new Student2(18001, "张剑飞", 20);
		stu12 = new Student2(18002, "李隆基", 18);
		stu13 = new Student2(18003, "孙正贤", 19);
		stu14 = new Student2(18004, "赵匡胤", 20);
		stu15 = new Student2(18005, "孙祥熙", 17);
		
		//创建TreeSet容器set1,按照年龄降序排序所有学生对象
		Set<Student2> set1 = new TreeSet<Student2>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Student2)o2).getAge() - ((Student2)o1).getAge();
			}
			
		});
		set1.add(stu11);
		set1.add(stu12);
		set1.add(stu13);
		set1.add(stu14);
		set1.add(stu15);
		
		System.out.println("按照年龄降序排序的结果为: ");
		Iterator<Student2> iter = set1.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		//创建TreeSet容器set2,按照学号升序排序所有学生对象
		Set<Student2> set2 = new TreeSet<Student2>(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				return ((Student2)o1).getId() - ((Student2)o2).getId();
			}
		});
		
		set2.add(stu11);
		set2.add(stu12);
		set2.add(stu13);
		set2.add(stu14);
		set2.add(stu15);
		
		System.out.println("按照学号升序排序的结果为: ");
		Iterator<Student2> iter2 = set2.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
	}
}
