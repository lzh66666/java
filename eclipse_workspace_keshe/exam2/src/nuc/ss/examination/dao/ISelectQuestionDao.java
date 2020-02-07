package nuc.ss.examination.dao;

import java.util.ArrayList;

import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;

public interface ISelectQuestionDao {
	/**
	 * �������ѡ�����Ծ�
	 * @param count ���ѡ���������
	 * @return ���������б�
	 */
	public ArrayList<SelectQuestion> getSelectPaper(int count);
	
	/**
	 * �洢ѧ����ѡ����ɼ�,�óɼ��ǵ����о�,����Ҫ��ʦ����
	 * @param s
	 * @param user
	 */
	public void saveScore(float score,String data,User user);
	/**
	 * ����ѡ��������
	 * @param selectQuestion
	 */
	public void addSelectQuestion(SelectQuestion selectQuestion);
}
