package nuc.ss.test1;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		File file = new File("f:\\File\\test.txt");
		System.out.println(file.canRead());
		System.out.println(file.length());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getParent());
		System.out.println("文件是否是目录" + file.isDirectory());
		
		try {
			File dir = new File("F:/File/aa");
			String [] filenames = dir.list();
			for (String s : filenames) {
				System.out.println(s);
			}	
		} catch (NullPointerException e) {
			System.out.println("没有");
		}
	}
}
