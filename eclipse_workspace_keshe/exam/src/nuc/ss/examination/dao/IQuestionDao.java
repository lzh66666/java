package nuc.ss.examination.dao;

import java.util.ArrayList;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;

public interface IQuestionDao {
	/**
	 * 生成随机大题题试卷
	 * @param count  大题的数量
	 * @return 大题的数组列表
	 */
	public ArrayList<Question> getPaper(int count);
	
	/**
	 * 存储学生的大题成绩,该成绩是老师判卷,需要重新计分
	 * @param score
	 * @param user
	 */
	public void saveScore(float score,User user);
	/**
	 * 增加大题题型
	 * @param question
	 */
	public void addQuestion(Question question);
}
