package nuc.ss.test.section10_1b;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) {
		//�鿴���ػ���"f:\testforch10\TestList.java"�ļ��Ļ�������
/*		File file = new File("f:/testforch10/TestList.java");
		System.out.println("�ļ��������ǣ�" + file.getName());
		System.out.println("�ļ��Ƿ��д��" + file.canWrite());
		System.out.println("�ļ��ľ���·����" + file.getAbsolutePath());
		System.out.println("�ļ��ĸ�Ŀ¼�ǣ�" + file.getParent());
		System.out.println("�ļ��ĳ���Ϊ��" + file.length());
		System.out.println("�ļ��Ƿ���Ŀ¼��" + file.isDirectory());
*/		//�г�"F:\testforch10"Ŀ¼�µ������ļ���Ŀ¼
		System.out.println("=======================");
		System.out.println("F:\\testforch10�µ��ļ��б�");
		File dir = new File("F:/testforch10");
		String[] fileNames = dir.list();
/*		FileAccept fileAccept = new FileAccept();
	    fileAccept.setExtendName("java");
	    String[] fileNames = dir.list(fileAccept);*/
		for(int i = 0; i < fileNames.length; i++){
			System.out.println(fileNames[i]);
		}
		//���б��ػ��ϵļ��±���������Ŀ¼Ҫ���������ı�
/*		Runtime ec=Runtime.getRuntime();
		try {
			ec.exec("c:\\windows\\notepad.exe");
		} catch (IOException e) {
			e.printStackTrace();
		}*/

	}
}
