package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

/**
 * 不知道为什么文件直接读取第二行，半天时间耗了时大概！！！！！！！！！
 * @author 卢泽华
 *
 */
public class CompilerWriterImpl implements ICompilerWriter {

	private BufferedWriter out = null;
	private FileWriter fWriter = null;
	private BufferedReader in = null;
	private FileReader fReader = null;
	private StringBuffer stringBuffer = null;
	private File file = null;

	@Override
	public void write(User user, JTextArea complierArea, int count) {
		try {
			int i = 1;
			
			file = new File(DatabaseConfig.STUDENT + user.getName() + "试卷 .txt");
			fReader = new FileReader(file);
			in = new BufferedReader(fReader);
			String str = in.readLine();
			stringBuffer = new StringBuffer();
			
			
			if (str == null) {
				stringBuffer.append("*\n" + complierArea.getText() + "\n");
				stringBuffer.append("*"+"\n"+"*"+"\n"+"*"+"\n"+"*"+"\n"+"*"+"\n"+ 
						"*"+"\n"+"*"+"\n"+"*"+"\n"+"*"+"\n"+"*"+"\n"+"*"+"\n"+
						"*"+"\n"+"*"+"\n"+"*"+"\n");
			}
			while (str != null) {
				if (str.equals("*")) {
					if (i == count) {
						stringBuffer.append("*\n" + complierArea.getText() + "\n");
						str = in.readLine();
					} 
					else {
						stringBuffer.append("*\n");
						str = in.readLine();
						while (str != null && !str.equals("*")) {
							stringBuffer.append(str + "\n");
							str = in.readLine();
						}
					}
					i++;
				}else {
					str = in.readLine();
				}
			}
			
			fWriter = new FileWriter(file);
			out = new BufferedWriter(fWriter);
			out.write(stringBuffer.toString());

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fWriter != null) {
				try {
					fWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if (fReader != null) {
				try {
					fReader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
