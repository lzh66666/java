package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JTextArea;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

public class CompilerReaderImpl implements ICompilerReader{
	private BufferedReader in = null;
	private File file = null;
	@Override
	public void read(User user,JTextArea complierArea,int count) {
		try {
			file = new File(DatabaseConfig.STUDENT + user.getName() + "йт╬М .txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			int i = 1;
			in = new BufferedReader(new FileReader(file));
			String str = in.readLine();
			while (str != null) {
				if(str.equals("*")) {
					if(i == count) {
						while((str = in.readLine()) != null && !str.equals("*")){
							complierArea.append(str + "\n");
						}
					}
					i++;
				}
				str = in.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
