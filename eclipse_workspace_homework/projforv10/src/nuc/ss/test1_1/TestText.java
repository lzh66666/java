package nuc.ss.test1_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 书上P247页编程练习第1题
 * @author 卢泽华
 * @version 2019 11 23 11:57
 * 
 */

public class TestText {
	public static void main(String[] args) {
		File file = new File("text.txt");
		System.out.println("该文件的文件名是: " + file.getName());
		System.out.println("该文件的路径是: " + file.getAbsolutePath());
		System.out.println("该文件的大小是: " + file.length());
		System.out.print("该文件的内容是:");
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
