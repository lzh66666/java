package nuc.ss.examination.service;

import java.util.ArrayList;

import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;

public interface ISelectQuestionService {
	/**
	 * ���ѡ���������б�
	 * @param count
	 * @return
	 */
	 public ArrayList<SelectQuestion> getSelectPaper(int count);
	 /**
	  * �洢ѡ�������
	  * @param score
	  * @param user
	  */
	 public void save(float score,String data,User user);
	 
	 /**
	  * ����ѡ����
	  * @param selectQuestion
	  * @return
	  */
	 public void addSelectQuestion(SelectQuestion selectQuestion);
}
