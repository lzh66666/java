package nuc.ss.test1_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ����P247ҳ�����ϰ��1��
 * @author ¬��
 * @version 2019 11 23 11:57
 * 
 */

public class TestText {
	public static void main(String[] args) {
		File file = new File("text.txt");
		System.out.println("���ļ����ļ�����: " + file.getName());
		System.out.println("���ļ���·����: " + file.getAbsolutePath());
		System.out.println("���ļ��Ĵ�С��: " + file.length());
		System.out.print("���ļ���������:");
		byte[] temp = new byte[(byte)file.length()];
		try {
			FileInputStream fin = new FileInputStream(file);
			int l = fin.read(temp);
			String s = new String(temp,0,l);
			System.out.println(s);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
