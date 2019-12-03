package nuc.ss.filestream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流
 * @author 卢泽华
 * @version 2019 11 21 11:53
 */
public class TestFileOutStream {
	public static void main(String[] args) {
		byte b[] = "你好,近来忙么?".getBytes();
		File f = new File("example.txt");
		try {
			FileOutputStream out = new FileOutputStream(f,true);
			out.write(b);
			out.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
