package nuc.ss.test.section10_1b;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		//查看本地机上"f:\testforch10\TestList.java"文件的基本属性
/*		File file = new File("f:/testforch10/TestList.java");
		System.out.println("文件的名字是：" + file.getName());
		System.out.println("文件是否可写：" + file.canWrite());
		System.out.println("文件的绝对路径：" + file.getAbsolutePath());
		System.out.println("文件的父目录是：" + file.getParent());
		System.out.println("文件的长度为：" + file.length());
		System.out.println("文件是否是目录：" + file.isDirectory());
*/		//列出"F:\testforch10"目录下的所有文件及目录
		System.out.println("=======================");
		System.out.println("F:\\testforch10下的文件列表：");
		File dir = new File("F:/testforch10");
		String[] fileNames = dir.list();
/*		FileAccept fileAccept = new FileAccept();
	    fileAccept.setExtendName("java");
	    String[] fileNames = dir.list(fileAccept);*/
		for(int i = 0; i < fileNames.length; i++){
			System.out.println(fileNames[i]);
		}
		//运行本地机上的记事本软件，软件目录要随具体情况改变
/*		Runtime ec=Runtime.getRuntime();
		try {
			ec.exec("c:\\windows\\notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}
}
