package nuc.ss.examination.dao;

import java.util.ArrayList;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;

public interface IQuestionDao {
	/**
	 * ��������������Ծ�
	 * @param count  ���������
	 * @return ����������б�
	 */
	public ArrayList<Question> getPaper(int count);
	
	/**
	 * �洢ѧ���Ĵ���ɼ�,�óɼ�����ʦ�о�,��Ҫ���¼Ʒ�
	 * @param score
	 * @param user
	 */
	public void saveScore(float score,User user);
	/**
	 * ���Ӵ�������
	 * @param question
	 */
	public void addQuestion(Question question);
}
