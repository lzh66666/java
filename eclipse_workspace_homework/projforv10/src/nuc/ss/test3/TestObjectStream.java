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
 * �ö���������Ͷ�ȡѧ������Ϣ
 * @author ¬��
 * @version 2019 11 23 11:17
 */

public class TestObjectStream {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(18001,"����",18));
		list.add(new Student(18002,"����",19));
		list.add(new Student(18003,"����",17));
		list.add(new Student(18004,"����",20));
		list.add(new Student(18005,"����",18));
		
		/**
		 * ��ɶ�ѧ����Ϣ�ı���
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
		 * ��ѧ������Ķ�ȡ
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