package test01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestReaderFile {
	public static void main(String[] args) {
		FileReader reader = null;
		try {
			reader = new FileReader("f:/File/test.txt");
			char c = (char)reader.read();
			char c2 = (char)reader.read();
			System.out.println(" "+c+c2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
