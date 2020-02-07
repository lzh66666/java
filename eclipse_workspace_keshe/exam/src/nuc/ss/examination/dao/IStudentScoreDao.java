package nuc.ss.examination.dao;

import java.util.HashMap;

import nuc.ss.examination.entry.Score;

public interface IStudentScoreDao {
	/**
	 * 选择某个学生的分数信息
	 * @param account
	 * @return
	 */
	public Score selectone(String account);
	
	/**
	 * 管理员获得所有学生的成绩
	 * @return
	 */
	public HashMap<String, Score> selectAll();
}
