package test01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestReadFile {
	public static void main(String[] args) {
		String str = new TestReadFile().openFile();
		System.out.println(str);
	}
	
	String openFile() {
			try {
				System.out.println("aaa");
				FileInputStream fis = new FileInputStream("f:/File/test.txt");
				int a = fis.read();
				System.out.println("bbb");
				return "step1";
			} catch (FileNotFoundException e) {
				System.out.println("cathing!!!!");
				return "step2";
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return "step3";
			}finally {
				System.out.println("finally!!");
//				return "fff";
			}

	}
}
