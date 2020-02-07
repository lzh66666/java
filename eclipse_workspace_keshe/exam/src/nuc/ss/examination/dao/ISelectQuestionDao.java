package nuc.ss.examination.dao;

import java.util.ArrayList;

import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;

public interface ISelectQuestionDao {
	/**
	 * 生成随机选择题试卷
	 * @param count 随机选择题的数量
	 * @return 试题数组列表
	 */
	public ArrayList<SelectQuestion> getSelectPaper(int count);
	
	/**
	 * 存储学生的选择题成绩,该成绩是电脑判卷,不需要老师来判
	 * @param s
	 * @param user
	 */
	public void saveScore(float score,String data,User user);
	/**
	 * 增加选择题题型
	 * @param selectQuestion
	 */
	public void addSelectQuestion(SelectQuestion selectQuestion);
}
