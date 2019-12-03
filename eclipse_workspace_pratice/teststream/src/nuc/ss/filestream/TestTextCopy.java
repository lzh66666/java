package nuc.ss.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ֽ�����ɸ����ļ��ĸ���
 * @author ¬��
 * @version 2019 11 21 20:29
 */

public class TestTextCopy {
	public static void main(String[] args) {
		TextCopy copy = new TextCopy();
		String sourcepath = "example.txt";
		String destintionpath = "example_copy.txt";
		copy.textCopy(sourcepath, destintionpath);
	}
}

class TextCopy{
	public void textCopy(String sourcepath,String destintionpath) {
		byte [] bin = new byte[16];
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			fin = new FileInputStream(sourcepath);
			fout = new FileOutputStream(destintionpath);
			System.out.println("��ʼ����. . .");
			while(fin.read(bin) != -1) {
				fout.write(bin);
			}
			System.out.println("��ɿ���. . .");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			
			
		}
		System.out.println("�ļ��������!");
	}
}