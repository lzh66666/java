package nuc.ss.examination.service;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerService {
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
