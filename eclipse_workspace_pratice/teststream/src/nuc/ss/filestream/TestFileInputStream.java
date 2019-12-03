package nuc.ss.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 字节输入流
 * @author 卢泽华
 * @version 2019 11 21 10:44
 * 
 */

public class TestFileInputStream {
	public static void main(String[] args) {
		int b = 0;
		byte tom[] = new byte[18];
		File f = new File("example.txt");
		try {
			FileInputStream in = new FileInputStream(f);
			b = in.read(tom);
			String s = new String(tom,0,b);
			System.out.println(s);
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
