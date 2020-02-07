package nuc.ss.examination.service;

import java.util.ArrayList;

import nuc.ss.examination.dao.IQuestionDao;
import nuc.ss.examination.dao.QuestionDaoImpl;
import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;

public class QuestionServiceImpl implements IQuestionService{
	IQuestionDao dao = new QuestionDaoImpl();
	
	@Override
	public ArrayList<Question> getPaper(int count) {
		return dao.getPaper(count);
	}

	@Override
	public void save(float score, User user) {
		dao.saveScore(score, user);
	}

	@Override
	public void addQuestion(Question question) {
		dao.addQuestion(question);
	}
}
