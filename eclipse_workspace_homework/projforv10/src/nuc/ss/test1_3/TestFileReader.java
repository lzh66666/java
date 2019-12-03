package nuc.ss.test1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  ����P247�����ϰ��3��
 * @author ¬��
 * @version 2019 11 23 22:15
 *
 */
public class TestFileReader {
	public static void main(String[] args) {
		File file = new File("text.txt");
		char[] temp = new char[3];
		int n = 0;
		String string = null;
		try {
			FileReader fin = new FileReader(file);
			while((n = fin.read(temp)) != -1) {
				string = new String(temp,0,n);
				System.out.print(string);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}