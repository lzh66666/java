package nuc.ss.test2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 复制文本,PPT第二题
 * @author 卢泽华
 * @version 2019 11 23 10:33
 */
public class TestTextCopy {
	public static void main(String[] args) {
		String source = "text.txt";
		String sourceCopyByByte = "text_byte_copy.txt";
		String sourceCopyByChar = "text_char_copy.txt";
		TextCopy copy = new TextCopy();
		copy.textCopyByByte(source, sourceCopyByByte);
		copy.textCopyByChar(source, sourceCopyByChar);
	}
}

class TextCopy{
	public void textCopyByByte(String source,String sourceCopyByByte) {
		byte [] temp = new byte[16];
		FileInputStream fin = null;
		FileOutputStream fout = null;
		try {
			System.out.println("字节流拷贝文件开始. . .");
			fin = new FileInputStream(source);
			fout = new FileOutputStream(sourceCopyByByte);
			while(fin.read(temp) != -1) {
				fout.write(temp);
			}
			System.out.println("字节流拷贝文件结束. . .");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fin != null) {
				try {
					fin.close();
				} catch (IOException e) {
					e.printStackTrace();
				}	
			}
			if(fout != null) {
				try {
					fout.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void textCopyByChar(String source,String sourceCopyByChar) {
		char [] temp = new char[16];
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			System.out.println("字符流拷贝文件开始. . .");
			fr = new FileReader(source);
			fw = new FileWriter(sourceCopyByChar);
			while(fr.read(temp) != -1) {
				fw.write(temp);
			}
			System.out.println("字符流拷贝文件结束. . .");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
