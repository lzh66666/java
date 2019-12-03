package nuc.ss.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestObject {
	public static void main(String[] args) {
		
		//已有学生列表，要保存到文件。
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(18001, "张剑飞", 18));	
		list.add(new Student(18002, "李隆基", 20));
		list.add(new Student(18003, "孙正贤", 20));		
		list.add(new Student(18004, "赵匡胤", 18));			
		list.add(new Student(18005, "孔祥熙", 22));
		//保存学生信息到文件
		FileOutputStream fileout;
		ObjectOutputStream objectout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		try {
			fileout = new FileOutputStream("student.dat");			
			objectout = new ObjectOutputStream(fileout);			
			while (iter.hasNext()) {
				stu = iter.next(); // 取出list中的学生对象
				objectout.writeObject(stu); // 将学生对象直接写入文件
			}				
			fileout.close();
			objectout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//从文件读出学生信息并显示
		List<Student> list2 = new ArrayList<Student>();
		FileInputStream filein = null;
		ObjectInputStream objectin = null;		
		try {
			filein = new FileInputStream("student.dat");
			objectin = new ObjectInputStream(filein);
			for (int i = 0; i < 5 ; i++) {
				stu = (Student)objectin.readObject();
				list2.add(stu);
			}
			
			for (Student student : list2) {
				System.out.println(student);
			}
			filein.close();
			objectin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

