package nuc.ss.examination.util;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerWriter {
	/**
	 * ѧ������ı�������д��
	 * @param user
	 * @param complierArea
	 */
	public void write(User user,JTextArea complierArea,int count);
}
