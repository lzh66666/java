package nuc.ss.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ×Ö·ûÊäÈëÁ÷
 * @author Â¬Ôó»ª
 * @version 2019 11 21 16:49
 */

public class TestFileReader {
	public static void main(String[] args) {
		int b = 0;
		char tom[] = new char[20];
		File f = new File("example.txt");
		try {
			FileReader in = new FileReader(f);
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