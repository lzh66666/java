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
		//����ѧ���б�Ҫ���浽�ļ���
		List<Student> list = new ArrayList<Student>();
		list.add(new Student(18001, "��һƼ", 18));	
		list.add(new Student(18002, "����С", 20));
		list.add(new Student(18003, "������", 20));		
		list.add(new Student(18004, "Ǯ����", 18));			
		list.add(new Student(18005, "Ѧ���", 19));
		
		//����ѧ����Ϣ���ļ�
		Iterator<Student> iter = list.iterator();
		try {
			FileOutputStream fileout = new FileOutputStream("f:\\testforch10\\student.dat");			
			DataOutputStream dataout = new DataOutputStream(fileout);			
			while(iter.hasNext()){
				Student stu = (Student)iter.next();//ȡ��list�е�ѧ������
				dataout.writeInt(stu.getId());//д��ѧ����id
				dataout.writeUTF(stu.getName());//д��ѧ��������
				dataout.writeInt(stu.getAge());//д��ѧ��������
			}				
			fileout.close();
			dataout.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//���ļ�����ѧ����Ϣ����ʾ
		FileInputStream filein;
		DataInputStream datain;
		try {
			filein = new FileInputStream("f:\\testforch10\\student.dat");
			datain = new DataInputStream(filein);
			for(int i = 0; i < 5; i++){
				System.out.println("��" + (i + 1) + "��ѧ������Ϣ�ǣ�" + 
			           "ѧ��=" + datain.readInt() + 
			           "; ����=" + datain.readUTF() + 
			           "; ����=" + datain.readInt());
			}
			filein.close();
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
