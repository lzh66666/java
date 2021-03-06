package nuc.ss.test.section9_7b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import nuc.ss.test.section9_4.Student;

public class TestMap {
	public static void main(String[] args) {
		Student s1 = new Student(18001, "王宝国", 20);
		Student s2 = new Student(18006, "张春晖", 21);
		Student s3 = new Student(18003, "李高兴", 19);
		Student s4 = new Student(18004, "彭凯利", 18);
		Student s5 = new Student(18003, "童采烈", 19);
		Student s6 = new Student(18008, "蔚韦伯", 23);
		
		Map<Integer, Student> map = 
				      new HashMap<Integer, Student>();

		// 添加元素 <key, value>
		map.put(s1.getId(), s1);
		map.put(s2.getId(), s2);
		map.put(s3.getId(), s3);
		map.put(s4.getId(), s4);
		map.put(s5.getId(), s5);
		map.put(s6.getId(), s6);
		map.put(new Integer(18010), new Student(18010, "曾国光", 20));
		
		System.out.println("按照key值取出学生信息:key=18006,"+map.get(18006));		
		System.out.println("************************************");

		System.out.println("遍历所有的key值：");
		Iterator<Integer> iterkey = map.keySet().iterator();
		while(iterkey.hasNext()){
			System.out.println(iterkey.next());
		}		
		System.out.println("************************************");

		System.out.println("遍历所有的value值：");
		Iterator<Student> itervalue = map.values().iterator();
		while(itervalue.hasNext()){
			System.out.println(itervalue.next());
		}
		System.out.println("************************************");
		
		System.out.println("同时遍历所有的key和value值：");
		Iterator<Map.Entry<Integer, Student>> iterentry = map.entrySet().iterator();
		while(iterentry.hasNext()){
			Map.Entry<Integer, Student> entry = (Map.Entry<Integer, Student>)iterentry.next();
			System.out.println("key=" + entry.getKey() + ":" + 
			                 "value=" + entry.getValue());
		}
		//按照Key值删除学生信息	
		map.remove(18001);		
		System.out.println("************************************");
		System.out.println("删除key=18001的学生对象后,用迭代器遍历map中所有元素:");
		Iterator<Map.Entry<Integer, Student>> iterentrydel = map.entrySet().iterator();
		while(iterentrydel.hasNext()){
			Map.Entry<Integer, Student> entry = (Map.Entry<Integer, Student>)iterentrydel.next();
			System.out.println("key=" + entry.getKey() + ":" + 
			                 "value=" + entry.getValue());
		}

	}

}

