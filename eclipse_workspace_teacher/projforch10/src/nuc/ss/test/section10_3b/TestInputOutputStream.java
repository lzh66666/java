package nuc.ss.test.section10_3b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputOutputStream {
	public static void main(String[] args) {
/*		String sourcepath = "F:\\testforch10\\JPG\\nuc.jpg";
		String destinationpath = "F:\\testforch10\\JPG\\nuc_copy.jpg";*/
		String sourcepath = "F:\\testforch10\\TestList.java";
		String destinationpath = "F:\\testforch10\\TestList_copy.java";
		FileByteCopy copy=new FileByteCopy();
		copy.fileByteCopy(sourcepath, destinationpath);
	}
}
class FileByteCopy{
	/**���ֽ�����ɸ����ļ��ĸ���*/
	public void fileByteCopy(String sourcepath, String destinationpath ){		
		byte[] bin=new byte[16];	 
		FileInputStream fin;
		FileOutputStream fout;
		try {
			fin = new FileInputStream(sourcepath);		
			fout = new FileOutputStream(destinationpath);
			System.out.println("��ʼ����...");
			while(fin.read(bin)!=-1)
			{		
			   fout.write(bin);				
			}
			fin.close();
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�ļ��������!");
	}
}
