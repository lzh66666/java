package nuc.ss.datastream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 学生信息保存(数据流)
 * @author 卢泽华
 * @version 2019 11 21 17:48
 * 
 */

public class TestDataStream {
	public static void main(String[] args) {
		//已有学生列表,要保存到文件
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "赵", 18));
		list.add(new Student(1002, "李", 20));
		list.add(new Student(1003, "王", 20));
		list.add(new Student(1004, "张", 18));
		list.add(new Student(1005, "薛", 18));
		
		//保存学生信息到文件
		FileOutputStream fileout;
		DataOutputStream dataout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		
		try {
			fileout = new FileOutputStream("student.txt");
			dataout = new DataOutputStream(fileout);
			while(iter.hasNext()) {
				stu = iter.next();//取list中的学生对象
				dataout.writeInt(stu.getId());
				dataout.writeUTF(stu.getName());
				dataout.writeInt(stu.getAge());
			}
			fileout.close();
			dataout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		FileInputStream filein;
		DataInputStream datain;
		
		//从文件中读出学生信息显示
		List<Student> list2 = new ArrayList<Student>();
		try {
			filein = new FileInputStream("student.txt");
			datain = new DataInputStream(filein);
			Student stu2;
			for (int i = 0; i < 5; i++) {
				stu2 = new Student();
				stu2.setId(datain.readInt());
				stu2.setName(datain.readUTF());
				stu2.setAge(datain.readInt());
				list2.add(stu2);
			}
			for (Student student : list2) {
				System.out.println(student);
			}
			filein.close();
			datain.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
