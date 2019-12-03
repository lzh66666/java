package nuc.ss.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ����������
 * @author ¬��
 * @version 2019 11 21 17:28
 * 
 */

public class TestDataInputStream {
	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("data.txt");
			DataInputStream inData = new DataInputStream(fin);
			int age = inData.readInt();
			System.out.println(age);
			System.out.println(inData.readUTF());
			fin.close();
			inData.close();
		} catch (FileNotFoundException e) {
			System.out.println("�ļ��Ҳ���");
		} catch (IOException e) {
			System.out.println("IO���쳣");
		}
		
	}
}