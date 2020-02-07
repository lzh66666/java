package nuc.ss.examination.dao;

import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.entry.Score;

public interface IStudentScoreDao {
	/**
	 * ѡ��ĳ��ѧ���ķ�����Ϣ
	 * @param account
	 * @return
	 */
	public Score selectone(String account);
	
	/**
	 * ����Ա�������ѧ���ĳɼ�
	 * @return
	 */
	public HashMap<String, Score> selectAll();
	/**
	 * 
	 * @return
	 */
	public List<Score> scores();
}