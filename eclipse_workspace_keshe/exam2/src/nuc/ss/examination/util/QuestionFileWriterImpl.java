package nuc.ss.examination.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.Question;

public class QuestionFileWriterImpl implements IQuestionFileWriter {

	@Override
	public void addQuestion(Question question) {
		BufferedWriter bWriter = null;

		try {
			bWriter = new BufferedWriter(new FileWriter(DatabaseConfig.QUESTION_FILE_PATH, true));
			bWriter.write(question.getTitle() + "\n*");
			bWriter.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bWriter != null) {
				try {
					bWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
