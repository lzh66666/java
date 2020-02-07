package nuc.ss.examination.service;

import java.util.ArrayList;

import nuc.ss.examination.dao.ISelectQuestionDao;
import nuc.ss.examination.dao.SelectQuestionDaoImpl;
import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;

public class SelectQuestionServiceImpl implements ISelectQuestionService{
    ISelectQuestionDao dao = new SelectQuestionDaoImpl();

    public ArrayList<SelectQuestion> getSelectPaper(int count){
        return dao.getSelectPaper(count);
    }

	@Override
	public void save(float score,String data,User user) {
		dao.saveScore(score,data,user);
	}

	@Override
	public void addSelectQuestion(SelectQuestion selectQuestion) {
		dao.addSelectQuestion(selectQuestion);
	}
}
