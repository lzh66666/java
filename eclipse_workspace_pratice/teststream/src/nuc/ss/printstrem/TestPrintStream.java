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
 * a打印流保存学生的信息
 * @author 卢泽华
 * @version 2019 11 21 19:12
 * 
 */

public class TestPrintStream {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(1001, "赵", 18));
		list.add(new Student(1002, "李", 20));
		list.add(new Student(1003, "王", 20));
		list.add(new Student(1004, "张", 18));
		list.add(new Student(1005, "薛", 18));
		
		Iterator<Student> iter = list.iterator();
		Student stu;
		FileWriter fileout;
		try {
			fileout = new FileWriter("printstudent.txt");
			PrintWriter printout = new PrintWriter(fileout);
			while(iter.hasNext()) {
				stu = iter.next();
				//导入学生的id
				printout.print(stu.getId() + " ");
				//写入学生的姓名
				printout.print(stu.getName() + " ");
				//写入学生的年龄
				printout.print(stu.getAge());
				//写入换行符
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
				System.out.println(tempstr);//输出文件内容
			}		
			filein.close();
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
