package nuc.ss.test.section10_6_3b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			fileout = new FileOutputStream("f:\\testforch10\\student.dat");			
			objectout = new ObjectOutputStream(fileout);			
			while (iter.hasNext()) {
				stu = (Student)iter.next(); // 取出list中的学生对象
				objectout.writeObject(stu); // 将学生对象直接写入文件
			}				
			fileout.close();
			objectout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//从文件读出学生信息并显示
		FileInputStream filein;
		ObjectInputStream objectin;		
		try {
			filein = new FileInputStream("f:\\testforch10\\student.dat");
			objectin = new ObjectInputStream(filein);
			for (int i = 0; i < 5 ; i++) {
				stu = (Student)objectin.readObject();
				System.out.println("第" + (i + 1) +
						           "个学生的信息是：" + stu.toString());
			}
			filein.close();
			objectin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

