
package nuc.ss.datastream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据输出流
 * @author 卢泽华
 * @version 2019 11 21 17:41
 *
 */

public class TestDataOutputStream {
	public static void main(String[] args) {
		try {
			FileOutputStream fout = new FileOutputStream("data.txt");
			DataOutputStream outData = new DataOutputStream(fout);
			int age = 20;
			outData.writeInt(age);
			outData.writeUTF("张三");
			fout.close();
			outData.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
