package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IStudentQuestionScoreFileWriter {
	/**
	 * 老师判断大题之后的分数
	 * @param score
	 * @param user
	 */
	public void score(float score,User user);
}
