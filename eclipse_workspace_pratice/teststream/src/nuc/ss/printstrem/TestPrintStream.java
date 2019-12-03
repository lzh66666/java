package nuc.ss.printstrem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nuc.ss.datastream.Student;

/**
 * a��ӡ������ѧ������Ϣ
 * @author ¬��
 * @version 2019 11 21 19:12
 * 
 */

public class TestPrintStream {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "��", 18));
		list.add(new Student(1002, "��", 20));
		list.add(new Student(1003, "��", 20));
		list.add(new Student(1004, "��", 18));
		list.add(new Student(1005, "Ѧ", 18));
		
		Iterator<Student> iter = list.iterator();
		Student stu;
		FileWriter fileout;
		try {
			fileout = new FileWriter("printstudent.txt");
			PrintWriter printout = new PrintWriter(fileout);
			while(iter.hasNext()) {
				stu = iter.next();
				//����ѧ����id
				printout.print(stu.getId() + " ");
				//д��ѧ��������
				printout.print(stu.getName() + " ");
				//д��ѧ��������
				printout.print(stu.getAge());
				//д�뻻�з�
				printout.print("\r\n");
			}
			fileout.close();
			printout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader filein;
		try {
			filein = new FileReader("printstudent.txt");
			BufferedReader bin = new BufferedReader(filein);
			String tempstr;			
			while((tempstr = bin.readLine()) != null){
				System.out.println(tempstr);//����ļ�����
			}		
			filein.close();
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
