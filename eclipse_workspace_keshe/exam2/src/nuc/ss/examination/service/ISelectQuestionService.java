package nuc.ss.examination.service;

import java.util.ArrayList;

import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;

public interface ISelectQuestionService {
	/**
	 * 获得选择题数组列表
	 * @param count
	 * @return
	 */
	 public ArrayList<SelectQuestion> getSelectPaper(int count);
	 /**
	  * 存储选择题分数
	  * @param score
	  * @param user
	  */
	 public void save(float score,String data,User user);
	 
	 /**
	  * 增加选择题
	  * @param selectQuestion
	  * @return
	  */
	 public void addSelectQuestion(SelectQuestion selectQuestion);
}
