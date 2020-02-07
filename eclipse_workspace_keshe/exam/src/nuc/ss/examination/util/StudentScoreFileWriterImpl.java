package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;

public class StudentScoreFileWriterImpl implements IStudentScoreFileWriter {
	private IStudentScoreFileReader studentScoreFileReader = new StudentScoreFileReaderImpl();

	@Override
	public void score(float score,String data, User user) {
		BufferedWriter writer = null;
		BufferedReader reader = null;
		StringBuffer stringBuffer;
		Score score2 = studentScoreFileReader.scorePerson(user.getAccount());
		try {
			stringBuffer = new StringBuffer();
			if (score2 == null) {
				stringBuffer.append(user.getAccount() + "-" + user.getName() + "-" + data + "-" + score + "\n");
			} else {
				reader = new BufferedReader(new FileReader(DatabaseConfig.STUDENT + "分数 .txt"));
				String string = reader.readLine();
				while (string != null) {
					String[] str = string.split("-");
					if (user.getAccount().equals(str[0])) {
						stringBuffer.append(user.getAccount() + "-" + user.getName() + "-" + data + "-" + score + "\n");
					} else {
						stringBuffer.append(string+"\n");
					}
					string = reader.readLine();
				}
			}
			
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.STUDENT + "分数 .txt"));
			writer.write(stringBuffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (writer != null) {
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
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
