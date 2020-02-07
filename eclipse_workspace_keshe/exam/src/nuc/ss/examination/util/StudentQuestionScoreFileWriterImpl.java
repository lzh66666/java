package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

public class StudentQuestionScoreFileWriterImpl implements IStudentQuestionScoreFileWriter {
	
	@Override
	public void score(float score, User user) {
		BufferedWriter writer = null;
		BufferedReader reader = null;
		StringBuffer stringBuffer = new StringBuffer();
		try {
			reader = new BufferedReader(new FileReader(DatabaseConfig.STUDENT + "分数 .txt"));
			String string = reader.readLine();
			while (string != null) {
				String[] str = string.split("-");
				if(str[0].equals(user.getAccount())) {
					stringBuffer.append(str[0] + "-" + str[1] + "-" + str[2] + "-"+ str[3] + "-");
					stringBuffer.append(score + "\n");
				}else {
					stringBuffer.append(string + "\n");
				}
				string = reader.readLine();
			}
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.STUDENT + "分数 .txt"));
			writer.write(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
