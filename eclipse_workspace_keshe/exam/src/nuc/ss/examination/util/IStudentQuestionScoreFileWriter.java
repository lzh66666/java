package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IStudentQuestionScoreFileWriter {
	/**
	 * ��ʦ�жϴ���֮��ķ���
	 * @param score
	 * @param user
	 */
	public void score(float score,User user);
}
