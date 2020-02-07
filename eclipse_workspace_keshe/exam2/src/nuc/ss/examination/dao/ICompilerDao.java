package nuc.ss.examination.dao;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;

public interface ICompilerDao {
	/**
	 * 编译器的读入操作
	 * @param compilerArea
	 * @param user
	 */
	public void read(JTextArea compilerArea,User user,int count);
	/**
	 * 编译器的写入操作
	 * @param compilerArea 
	 * @param user
	 */
	public void write(JTextArea compilerArea,User user,int count);
}
