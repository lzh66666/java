package nuc.ss.examination.util;

import java.util.HashSet;

import nuc.ss.examination.entry.SelectQuestion;

public interface ISelectQuestionFileReader {
	/**
	 * ��ȡȫ��ѡ���⼯�ϼ���,��֤���������
	 * @return
	 */
	public HashSet<SelectQuestion> getSelectQuestions();
	
	
}
