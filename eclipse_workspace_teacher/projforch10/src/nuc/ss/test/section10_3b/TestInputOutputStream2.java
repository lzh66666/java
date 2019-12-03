package nuc.ss.test.section10_3b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestInputOutputStream2 {
	
	public static void main(String[] args) {
		
/*		for(int i=0; i<args.length; i++)
			System.out.println(args[i]); */
		
		if(args.length < 2) {
			System.out.println("必须输入原文件名和目标文件名！");
			System.exit(-1);
		}
		String sourcepath = args[0];
		String destinationpath = args[1];
		
		FileByteCopy2 copy=new FileByteCopy2();
		copy.fileByteCopy(sourcepath, destinationpath);
	}
}
class FileByteCopy2{
	/**用字节流完成给定文件的复制*/
	public void fileByteCopy(String sourcepath,String destinationpath ){		
		byte[] bin=new byte[16];	 
		FileInputStream fin;
		FileOutputStream fout;
		try {
			fin = new FileInputStream(sourcepath);		
			fout = new FileOutputStream(destinationpath);
			System.out.println("开始拷贝...");
			while(fin.read(bin)!=-1)
			{		
			   fout.write(bin);				
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
