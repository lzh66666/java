package nuc.ss.test3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 用对象流保存和读取学生的信息
 * @author 卢泽华
 * @version 2019 11 23 11:17
 */

public class TestObjectStream {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(18001,"张三",18));
		list.add(new Student(18002,"王五",19));
		list.add(new Student(18003,"李四",17));
		list.add(new Student(18004,"赵六",20));
		list.add(new Student(18005,"韩七",18));
		
		/**
		 * 完成对学生信息的保存
		 */
		
		FileOutputStream fout = null;
		ObjectOutputStream objectOut = null;
		Iterator<Student> iter = list.iterator();
		Student stu = null;
		try {
			fout = new FileOutputStream("studentObject.txt");
			objectOut = new ObjectOutputStream(fout);
			while(iter.hasNext()) {
				stu = iter.next();
				objectOut.writeObject(stu);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(objectOut != null) {
				try {
					objectOut.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		/**
		 * 对学生对象的读取
		 */
		Student stu2 = null;
		FileInputStream fin = null;
		ObjectInputStream objectIn = null;
		try {
			fin = new FileInputStream("studentObject.txt");
			objectIn = new ObjectInputStream(fin);
			for(int i = 0; i < list.size(); i++ ) {
				stu2 = (Student)objectIn.readObject();
				System.out.println(stu2);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
