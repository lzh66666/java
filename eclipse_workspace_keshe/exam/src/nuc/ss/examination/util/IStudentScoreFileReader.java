package nuc.ss.examination.util;

import java.util.HashMap;

import nuc.ss.examination.entry.Score;

public interface IStudentScoreFileReader {
	/**
	 * 返回一个分数列表
	 * @return
	 */
	public HashMap<String, Score> score();
	
	/**
	 * 返回某个学生的分数
	 * @return
	 */
	public Score scorePerson(String acount);
}
