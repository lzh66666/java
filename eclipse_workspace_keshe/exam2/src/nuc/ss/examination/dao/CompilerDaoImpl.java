package nuc.ss.examination.dao;

import javax.swing.JTextArea;

import nuc.ss.examination.entry.User;
import nuc.ss.examination.util.CompilerReaderImpl;
import nuc.ss.examination.util.CompilerWriterImpl;
import nuc.ss.examination.util.ICompilerReader;
import nuc.ss.examination.util.ICompilerWriter;

public class CompilerDaoImpl implements ICompilerDao{

	@Override
	public void read(JTextArea compilerArea, User user,int count) {
		ICompilerReader compilerReader = new CompilerReaderImpl();
		compilerReader.read(user, compilerArea,count);
	}

	@Override
	public void write(JTextArea compilerArea, User user,int count) {
		ICompilerWriter compilerWriter = new CompilerWriterImpl();
		compilerWriter.write(user, compilerArea,count);
	}

}
