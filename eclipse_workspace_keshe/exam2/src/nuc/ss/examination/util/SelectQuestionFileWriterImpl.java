package nuc.ss.examination.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.SelectQuestion;

public class SelectQuestionFileWriterImpl implements ISelectQuestionFileWriter{

	@Override
	public void addSelectQuestion(SelectQuestion selectQuestion) {
		BufferedWriter bWriter = null;
		
		try {
			bWriter = new BufferedWriter(new FileWriter(DatabaseConfig.SELECT_QUESTION_FILE_PATH,true));
			if(selectQuestion.getPicture() == null) {
				bWriter.write(selectQuestion.getTitle()+"#"+selectQuestion.getAnswer());
			}else {
				bWriter.write(selectQuestion.toString());
			}
			bWriter.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(bWriter != null) {
				try {
					bWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}