package nuc.ss.test.section10_4b;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDataStream {

	public static void main(String[] args) {
		//已有学生列表，要保存到文件。
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(18001, "赵一萍", 18));	
		list.add(new Student(18002, "王二小", 20));
		list.add(new Student(18003, "孙三红", 20));		
		list.add(new Student(18004, "钱四杨", 18));			
		list.add(new Student(18005, "薛五奎", 19));
		
		//保存学生信息到文件
		Iterator<Student> iter = list.iterator();
		try {
			FileOutputStream fileout = new FileOutputStream("f:\\testforch10\\student.dat");			
			DataOutputStream dataout = new DataOutputStream(fileout);			
			while(iter.hasNext()){
				Student stu = (Student)iter.next();//取出list中的学生对象
				dataout.writeInt(stu.getId());//写入学生的id
				dataout.writeUTF(stu.getName());//写入学生的姓名
				dataout.writeInt(stu.getAge());//写入学生的年龄
			}				
			fileout.close();
			dataout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//从文件读出学生信息并显示
		FileInputStream filein;
		DataInputStream datain;
		try {
			filein = new FileInputStream("f:\\testforch10\\student.dat");
			datain = new DataInputStream(filein);
			for(int i = 0; i < 5; i++){
				System.out.println("第" + (i + 1) + "个学生的信息是：" + 
			           "学号=" + datain.readInt() + 
			           "; 姓名=" + datain.readUTF() + 
			           "; 年龄=" + datain.readInt());
			}
			filein.close();
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
