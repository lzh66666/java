package nuc.ss.test.section10_6_1b;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestBuffer {

	public static void main(String[] args) {
		
		try {
			//FileReader filein = new FileReader("f:\\testforch10\\score.txt");
			FileReader filein = new FileReader("f:\\testforch10\\student.dat");
			//FileReader filein = new FileReader("f:\\testforch10\\TestList.java");
			BufferedReader bin = new BufferedReader(filein);
			String tempstr;			
			while((tempstr = bin.readLine()) != null){
				System.out.println(tempstr);//输出文件内容
			}		
			filein.close();
			bin.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
