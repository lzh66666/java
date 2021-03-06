package nuc.ss.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 用字符流完成给定文件的测定
 * @author 卢泽华
 * @version 2019 11 21 20:31
 *
 */
public class TestTextCopy {
	public static void main(String[] args) {
		String sourcepath = "example.txt";
		String destintionpath = "example_copy1.txt";
		
		TextCopy copy = new TextCopy();
		copy.textCopy(sourcepath, destintionpath);
	}
}

class TextCopy{
	public void textCopy(String sourcepath,String destintionpath) {
		char [] temp = new char[30];
		try {
			FileReader fr = new FileReader(sourcepath);
			FileWriter fw = new FileWriter(destintionpath);
			while(fr.read(temp) != -1) {
				fw.write(temp);
			}
			fr.close();
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("文件拷贝完成");
	}
}
