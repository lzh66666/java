package nuc.ss.burrered;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 * ������
 * @author ¬��
 * @version 2019 11 21 20:56
 * 
 */
public class TestBuffer {
	public static void main(String[] args) {
		try {
			FileReader filein = new FileReader("score.txt");
			BufferedReader bin = new BufferedReader(filein);
			String tempstr;//��ʱ��,�ݴ��ļ�����
			while((tempstr = bin.readLine()) != null) {
				//����ļ�����
				System.out.println(tempstr);
			}
			filein.close();
			bin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}