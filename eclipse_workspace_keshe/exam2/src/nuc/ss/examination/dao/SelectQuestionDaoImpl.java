package nuc.ss.examination.dao;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.Random;

import nuc.ss.examination.entry.SelectQuestion;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.util.ISelectQuestionFileReader;
import nuc.ss.examination.util.ISelectQuestionFileWriter;
import nuc.ss.examination.util.IStudentScoreFileWriter;
import nuc.ss.examination.util.SelectQuestionFileReaderImpl;
import nuc.ss.examination.util.SelectQuestionFileWriterImpl;
import nuc.ss.examination.util.StudentScoreFileWriterImpl;
/**
 * 随机组合,重点(困扰半天)
 * 无序不可重复的HashSet<>()和有序可重复的ArrayList<>()直接的相互转换
 * @author 卢泽华
 * @version 2019 12 19 20:13
 * 
 */

public class SelectQuestionDaoImpl implements ISelectQuestionDao{
    private ISelectQuestionFileReader selectQuestionFileReader = new SelectQuestionFileReaderImpl();
    private ArrayList<SelectQuestion> selectQuestions = new ArrayList<SelectQuestion>(selectQuestionFileReader.getSelectQuestions());
    @Override
    public ArrayList<SelectQuestion> getSelectPaper(int count){
        HashSet<SelectQuestion> paperSelectQuestions = new HashSet<>();
        while(paperSelectQuestions.size() != count){
            Random r = new Random();
            int index = r.nextInt(selectQuestions.size());
            paperSelectQuestions.add(selectQuestions.get(index));
        }
        return new ArrayList<SelectQuestion>(paperSelectQuestions);
    }
    
    
    private IStudentScoreFileWriter  studentScoreFileWriter = new StudentScoreFileWriterImpl();
	@Override
	public void saveScore(float score,String data,User user) {
		studentScoreFileWriter.score(score,data,user);
	}
	
	private ISelectQuestionFileWriter selectQuestionFileWriter = new SelectQuestionFileWriterImpl();
	@Override
	public void addSelectQuestion(SelectQuestion selectQuestion) {
		selectQuestionFileWriter.addSelectQuestion(selectQuestion);	
	}
}
