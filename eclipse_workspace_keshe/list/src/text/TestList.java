package text;

import java.util.*;
import java.io.*;

import javax.swing.JFileChooser;

public class TestList {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args){
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			File file2 = null;
			byte[] b = new byte[(int) file.length()];
			FileInputStream in = null;
			FileOutputStream out = null;
			try {
				in=new FileInputStream(file);
				file2 = new File("db\\" + file.getName());
				if(!file2.exists()) {
					file2.createNewFile();
				}
				out = new FileOutputStream(file2);
				
				while (in.read(b) != -1) {
					out.write(b);
				}
				out.flush();
				in.close();
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
	}

}