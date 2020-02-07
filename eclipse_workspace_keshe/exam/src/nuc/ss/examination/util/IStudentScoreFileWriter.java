package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IStudentScoreFileWriter {
	/**
	 * 记录学生的选择题成绩
	 * @param score
	 * @param user
	 */
	public void score(float score,String data,User user);
}
