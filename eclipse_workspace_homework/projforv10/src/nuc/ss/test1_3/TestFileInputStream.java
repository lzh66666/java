package nuc.ss.test1_3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * ����P247�����ϰ��3��
 * @author ¬��
 * @version 2019 11 23 22:15
 * 
 */
public class TestFileInputStream {
	public static void main(String[] args) {
		File file = new File("text.txt");
		byte[] temp = new byte[4];
		int n = 0;
		String string = null;
		try {
			FileInputStream fin = new FileInputStream(file);
			while((n = fin.read(temp)) != -1) {
				string = new String(temp,0,n);
				System.out.print(string);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}