package nuc.ss.examination.dao;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerDao {
	/**
	 * �������Ķ������
	 * @param compilerArea
	 * @param user
	 */
	public void read(JTextArea compilerArea,User user,int count);
	/**
	 * ��������д�����
	 * @param compilerArea 
	 * @param user
	 */
	public void write(JTextArea compilerArea,User user,int count);
}
