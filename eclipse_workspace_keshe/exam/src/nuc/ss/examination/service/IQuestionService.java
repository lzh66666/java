package nuc.ss.examination.service;

import java.util.ArrayList;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;

public interface IQuestionService {
	/**
	 * 
	 * @param count
	 * @return
	 */
	public ArrayList<Question> getPaper(int count);
	
	/**
	 * 大题分数的存储
	 * @param score
	 * @param user
	 */
	public void save(float score,User user);
	
	public void addQuestion(Question question);
}
