package nuc.ss.test.section10_6_2b;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import nuc.ss.test.section10_4b.Student;

public class TestPrintWriter2 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(18001, "�Ž���", 18));	
		list.add(new Student(18002, "��¡��", 20));
		list.add(new Student(18003, "������", 20));		
		list.add(new Student(18004, "�Կ�ط", 18));			
		list.add(new Student(18005, "������", 22));
		//����ѧ����Ϣ���ļ�
		PrintWriter printout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		try {				
			printout = new PrintWriter("f:\\testforch10\\student.dat");
			
/*			File file = new File("f:\\testforch10\\student.dat");
			printout = new PrintWriter(file);*/
			
			while (iter.hasNext()) {
				stu = (Student)iter.next();//ȡ��list�е�ѧ������
				printout.print(stu.getId());//д��ѧ����id
				printout.print(stu.getName());//д��ѧ��������
				printout.print(stu.getAge());//д��ѧ��������
				printout.print("\n"); // "\r\n"
			}				
			printout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//�û������������������
		try {
			FileReader filein = new FileReader("f:\\testforch10\\student.dat");
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

