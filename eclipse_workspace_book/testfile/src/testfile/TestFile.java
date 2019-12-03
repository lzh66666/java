package testfile;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		File f = new File("f:/File/test.txt");
		File f2 = new File("f:/File");
		
		File f3 = new File(f2,"test1.txt");
		File f4 = new File(f2,"test2.txt");
		File f5 = new File("f:/File/aa/bb/ff");
		f5.mkdirs();
		
		try {
			f4.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		f4.delete();
		if(f.isFile()) {
			 System.out.println("是一个文件");
		 }
		 if(f2.isDirectory()) {
			 System.out.println("是一个目录");
		 }
		 
	}
}
