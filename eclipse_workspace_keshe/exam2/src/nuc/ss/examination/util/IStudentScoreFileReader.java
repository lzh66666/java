package nuc.ss.examination.util;

import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.entry.Score;

public interface IStudentScoreFileReader {
	/**
	 * ����һ�������б�
	 * @return
	 */
	public HashMap<String, Score> score();
	
	/**
	 * ����ĳ��ѧ���ķ���
	 * @return
	 */
	public Score scorePerson(String acount);
	/**
	 * 
	 * @return
	 */
	public List<Score> scores();
}
