package nuc.ss.examination.util;

import java.util.HashSet;

import nuc.ss.examination.entry.Question;

public interface IQuestionFileReader {
	/**
	 * ��ȡ����
	 * @return
	 */
	 public HashSet<Question> getQuestions();
}
