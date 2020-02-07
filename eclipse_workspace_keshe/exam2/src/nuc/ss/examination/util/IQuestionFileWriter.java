package nuc.ss.examination.util;

import nuc.ss.examination.entry.Question;

public interface IQuestionFileWriter {
	/**
	 * 增加大题题型
	 * @param question
	 */
	public void addQuestion(Question question);
}
