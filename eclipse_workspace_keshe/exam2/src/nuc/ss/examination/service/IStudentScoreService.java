package nuc.ss.examination.service;

import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;

public interface IStudentScoreService {
	/**
	 * 获得某个学生的分数
	 * @param user
	 * @return
	 */
	public Score getScore(User user);
	
	/**
	 * 管理员获得所有学生的分数
	 * @return
	 */
	public HashMap<String, Score> getAllScore();
	
	public List<Score> scores();
}
