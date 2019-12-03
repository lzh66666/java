package nuc.ss.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���ֽ�����ɸ���ͼƬ�ĸ���
 * @author ¬��
 * @version 2019 11 21 12:02
 */

public class TestPictureCopy {
	public static void main(String[] args) {
		PictureCopy copy = new PictureCopy();
		String sourcepath = "productdisplay.png";
		String destintionpath = "producedisplay_copy.png";
		copy.pictureCopy(sourcepath, destintionpath);
	}
}

class PictureCopy{
	public void pictureCopy(String sourcepath,String destintionpath) {
		byte [] bin = new byte[16];
		try {
			FileInputStream fin = new FileInputStream(sourcepath);
			FileOutputStream fout = new FileOutputStream(destintionpath);
			while(fin.read(bin) != -1) {
				fout.write(bin);
			}
			fin.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ļ��������!");
	}
}