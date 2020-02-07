package nuc.ss.examination.dao;

import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.entry.Score;
import nuc.ss.examination.util.IStudentScoreFileReader;
import nuc.ss.examination.util.StudentScoreFileReaderImpl;

public class StudentScoreDaoImpl implements IStudentScoreDao{
	
	private IStudentScoreFileReader studentScore = new StudentScoreFileReaderImpl();
	@Override
	public Score selectone(String account) {
		return studentScore.scorePerson(account);
	}
	@Override
	public HashMap<String, Score> selectAll() {
		return studentScore.score();
	}
	@Override
	public List<Score> scores() {
		return studentScore.scores();
	}
}
