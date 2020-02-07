package nuc.ss.examination.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.User;

public class StudentScoreFileWriterImpl implements IStudentScoreFileWriter {

	@Override
	public void score(float score,String data, User user) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.STUDENT + "·ÖÊý .txt",true));
			writer.write(user.getAccount() + "-" + user.getName() + "-" + data + "-" + score);
			writer.newLine();
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
		}
	}

	@Override
	public void selectAnswer(String data, User user, String[] str) {
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(DatabaseConfig.STUDENT + "Ñ¡Ôñ .txt",true));
			writer.write(data + "-" + user.getAccount() + "-" + data + "-");
			int i = 0;
			for (i = 0; i < str.length-1; i++) {
				writer.write(str[i] + "-");
			}
			writer.write(str[i]);
			writer.newLine();
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
		}
	}

}
