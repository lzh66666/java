package nuc.ss.examination.util;

import nuc.ss.examination.entry.User;

public interface IStudentScoreFileWriter {
	/**
	 * ��¼ѧ����ѡ����ɼ�
	 * @param score
	 * @param user
	 */
	public void score(float score,String data,User user);
	
	/**
	 * ��¼ѡ���
	 * @param data
	 * @param user
	 * @param str
	 */
	public void selectAnswer(String data,User user,String[] str);
}
