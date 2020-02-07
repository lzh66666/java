package nuc.ss.examination.service;

import java.util.HashMap;

import nuc.ss.examination.dao.IStudentScoreDao;
import nuc.ss.examination.dao.StudentScoreDaoImpl;
import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;

public class StudentScoreServiceImpl implements IStudentScoreService{

	private IStudentScoreDao scoreDao = new StudentScoreDaoImpl();
	
	@Override
	public Score getScore(User user) {
		Score score = scoreDao.selectone(user.getAccount());
		if(score != null) {
			return score;
		}
		return null;
	}

	@Override
	public HashMap<String, Score> getAllScore() {
		HashMap<String, Score> map = scoreDao.selectAll();
		if(map != null) {
			return map;
		}
		return null;
	}

}
