package nuc.ss.examination.util;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerReader {
	/**
	 * 学生大题的编译器的读取
	 * @param user
	 * @param complierArea
	 */
	public void read(User user,JTextArea complierArea,int count);
}
