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
		list.add(new Student(18001, "张剑飞", 18));	
		list.add(new Student(18002, "李隆基", 20));
		list.add(new Student(18003, "孙正贤", 20));		
		list.add(new Student(18004, "赵匡胤", 18));			
		list.add(new Student(18005, "孔祥熙", 22));
		//保存学生信息到文件
		PrintWriter printout;
		Iterator<Student> iter = list.iterator();
		Student stu;
		try {				
			printout = new PrintWriter("f:\\testforch10\\student.dat");
			
/*			File file = new File("f:\\testforch10\\student.dat");
			printout = new PrintWriter(file);*/
			
			while (iter.hasNext()) {
				stu = (Student)iter.next();//取出list中的学生对象
				printout.print(stu.getId());//写入学生的id
				printout.print(stu.getName());//写入学生的姓名
				printout.print(stu.getAge());//写入学生的年龄
				printout.print("\n"); // "\r\n"
			}				
			printout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		//用缓冲流读出保存的数据
		try {
			FileReader filein = new FileReader("f:\\testforch10\\student.dat");
			BufferedReader bin = new BufferedReader(filein);
			String tempstr;			
			while((tempstr = bin.readLine()) != null){
				System.out.println(tempstr);//输出文件内容
			}		
			filein.close();
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

