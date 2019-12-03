package nuc.ss.test.section10_5b;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestReaderWriter {

	public static void main(String[] args) {
		int[] score = {99, 30, 40, 50};
		int n = 0;		
		try {
			FileWriter fw = new FileWriter("F:\\testforch10\\score.txt");
			for(int s : score){
				fw.write(Integer.toString(s));//将整型转换为字符串				
				fw.write(",");
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileReader fr = new FileReader("F:\\testforch10\\score.txt");
			char[] temp = new char[10];
			while((n = fr.read(temp)) != -1){
				String scoretemp = new String(temp, 0, n);
				System.out.print(scoretemp);
			}		
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
