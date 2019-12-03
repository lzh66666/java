package nuc.ss.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * @author 卢泽华
 * @version 2019 11 21 17:00
 */

public class TestFileWriter {
	public static void main(String[] args) {
		char b[] = "你好,近来还忙么?".toCharArray();
		File f = new File("example.txt");
		try {
			FileWriter out = new FileWriter(f,true);
			out.write(b);
//			out.write(b,0,b.length);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
