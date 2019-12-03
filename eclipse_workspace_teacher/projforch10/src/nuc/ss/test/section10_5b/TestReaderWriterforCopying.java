package nuc.ss.test.section10_5b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWriterforCopying {

	public static void main(String[] args) {
		FileCharCopy copy = new FileCharCopy();
		String sourcepath = "F:\\testforch10\\JPG\\nuc.jpg";
		String destinationpath = "F:\\testforch10\\JPG\\nuc_copy4.jpg";
/*		String sourcepath = "F:\\testforch10\\TestSet.java";
		String destinationpath = "F:\\testforch10\\TestSet_copy.java";
*/		copy.fileCharCopy(sourcepath, destinationpath);
	}

}

class FileCharCopy{
	/**用字节流完成给定文件的复制*/
	public void fileCharCopy(String sourcepath,String destinationpath ){		
		char[] charBuf = new char[10];	 
		FileReader fin;
		FileWriter fout;
		try {
			fin = new FileReader(sourcepath);		
			fout = new FileWriter(destinationpath);
			System.out.println("开始拷贝...");
			
			while(fin.read(charBuf)!=-1)
			{		
			   fout.write(charBuf);	
			   //System.out.print(charBuf);
			}
			
			fin.close();
			fout.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("文件拷贝完成!");
	}
}
