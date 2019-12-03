package nuc.ss.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 完成数据的保存与读取
 * @author 卢泽华
 * @version 2019 11 21 17:13
 */

public class TestScore {
	public static void main(String[] args) {
		int [] score = {99,30,40,50};
		int n = 0;
		//保存数组值
		try {
			FileWriter fileout = new FileWriter("score.txt");
			for (int s : score) {
				fileout.write(Integer.toString(s));
				fileout.write(",");
			}
			fileout.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//读出并显示保存的成绩
		try {
			FileReader filein = new FileReader("score.txt");
			char[] temp = new char[13];
			while((n = filein.read(temp)) != -1) {
				String scoretemp = new String(temp,0,n);
				System.out.println(scoretemp);
			}
			filein.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
