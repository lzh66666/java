package nuc.ss.examination.util;

import java.util.HashSet;

import nuc.ss.examination.entry.SelectQuestion;

public interface ISelectQuestionFileReader {
	/**
	 * 获取全部选择题集合集合,保证题的无序性
	 * @return
	 */
	public HashSet<SelectQuestion> getSelectQuestions();
	
	
}
