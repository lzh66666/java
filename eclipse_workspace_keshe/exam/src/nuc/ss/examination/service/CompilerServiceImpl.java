package nuc.ss.examination.service;

import javax.swing.JTextArea;

import nuc.ss.examination.dao.CompilerDaoImpl;
import nuc.ss.examination.dao.ICompilerDao;
import nuc.ss.examination.entry.User;

public class CompilerServiceImpl implements ICompilerService{
	
	ICompilerDao compilerDao = new CompilerDaoImpl();
	@Override
	public void read(JTextArea compilerArea, User user,int count) {
		compilerDao.read(compilerArea, user,count);
	}

	@Override
	public void write(JTextArea compilerArea, User user,int count) {
		compilerDao.write(compilerArea, user,count);
	}

}
