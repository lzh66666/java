package nuc.ss.examination.util;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerReader {
	/**
	 * ѧ������ı������Ķ�ȡ
	 * @param user
	 * @param complierArea
	 */
	public void read(User user,JTextArea complierArea,int count);
}
