package nuc.ss.examination.util;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerWriter {
	/**
	 * 学生大题的编译器的写入
	 * @param user
	 * @param complierArea
	 */
	public void write(User user,JTextArea complierArea,int count);
}
