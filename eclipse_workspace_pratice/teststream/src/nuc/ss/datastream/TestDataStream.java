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
 * ѧ����Ϣ����(������)
 * @author ¬��
 * @version 2019 11 21 17:48
 * 
 */

public class TestDataStream {
	public static void main(String[] args) {
		//����ѧ���б�,Ҫ���浽�ļ�
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "��", 18));
		list.add(new Student(1002, "��", 20));
		list.add(new Student(1003, "��", 20));
		list.add(new Student(1004, "��", 18));
		list.add(new Student(1005, "Ѧ", 18));
		
		//����ѧ����Ϣ���ļ�
		FileOutputStream fileout;
		DataOutputStream dataout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		
		try {
			fileout = new FileOutputStream("student.txt");
			dataout = new DataOutputStream(fileout);
			while(iter.hasNext()) {
				stu = iter.next();//ȡlist�е�ѧ������
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
		
		//���ļ��ж���ѧ����Ϣ��ʾ
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