package nuc.ss.examination.service;

import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.entry.Score;
import nuc.ss.examination.entry.User;

public interface IStudentScoreService {
	/**
	 * ���ĳ��ѧ���ķ���
	 * @param user
	 * @return
	 */
	public Score getScore(User user);
	
	/**
	 * ����Ա�������ѧ���ķ���
	 * @return
	 */
	public HashMap<String, Score> getAllScore();
	
	public List<Score> scores();
}
