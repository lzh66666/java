package nuc.ss.test.section9_8b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestComparable2 {

	public static void main(String[] args) {
		// 自定义类对象排序
		Student2 stu1, stu2, stu3, stu4, stu5;
		stu1 = new Student2(18001, "张剑飞", 20);
		stu2 = new Student2(18002, "李隆基", 18);
		stu3 = new Student2(18003, "孙正贤", 19);
		stu4 = new Student2(18004, "赵匡胤", 20);
		stu5 = new Student2(18005, "孔祥熙", 17);
		
		// 方案1：采用具有排序功能的容器类（ TreeSet ），放入实现了排序算法的对象，边放入边排序。
		Set<Student2> set = new TreeSet<Student2>();
		
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		set.add(stu4);
		set.add(stu5);
		
		// 使用增强for循环输出方案1的排序结果
		System.out.println("采用方案1的排序结果：");
		for(Student2 stu: set) {
			System.out.println(stu);
		}
	
		// 方案2：采用Collections工具类，为容器中的元素排序。
		List<Student2> list = new ArrayList<Student2>();
		
		list.add(stu1);
		list.add(stu2);
		list.add(stu3);
		list.add(stu4);
		list.add(stu5);
	
		Collections.sort(list);
		
		// 使用增强for循环输出方案2的排序结果
		System.out.println("采用方案2的排序结果：");
		for(Student2 stu: list) {
			System.out.println(stu);
		}
		
	}

}

