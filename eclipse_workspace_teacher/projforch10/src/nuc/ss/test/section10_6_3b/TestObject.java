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
		//����ѧ���б���Ҫ���浽�ļ���
		List<Student> list=new ArrayList<Student>();
		list.add(new Student(18001, "�Ž���", 18));	
		list.add(new Student(18002, "��¡��", 20));
		list.add(new Student(18003, "������", 20));		
		list.add(new Student(18004, "�Կ�ط", 18));			
		list.add(new Student(18005, "������", 22));
		//����ѧ����Ϣ���ļ�
		FileOutputStream fileout;
		ObjectOutputStream objectout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		try {
			fileout = new FileOutputStream("f:\\testforch10\\student.dat");			
			objectout = new ObjectOutputStream(fileout);			
			while (iter.hasNext()) {
				stu = (Student)iter.next(); // ȡ��list�е�ѧ������
				objectout.writeObject(stu); // ��ѧ������ֱ��д���ļ�
			}				
			fileout.close();
			objectout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//���ļ�����ѧ����Ϣ����ʾ
		FileInputStream filein;
		ObjectInputStream objectin;		
		try {
			filein = new FileInputStream("f:\\testforch10\\student.dat");
			objectin = new ObjectInputStream(filein);
			for (int i = 0; i < 5 ; i++) {
				stu = (Student)objectin.readObject();
				System.out.println("��" + (i + 1) +
						           "��ѧ������Ϣ�ǣ�" + stu.toString());
			}
			filein.close();
			objectin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
