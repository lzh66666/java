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
import nuc.ss.examination.util.SelectQuestionWriterImpl;
import nuc.ss.examination.util.StudentScoreFileWriterImpl;
/**
 * ������,�ص�(���Ű���)
 * ���򲻿��ظ���HashSet<>()��������ظ���ArrayList<>()ֱ�ӵ��໥ת��
 * @author ¬��
 * @version 2019 12 19 20:13
 * 
 */
public class SelectQuestionDaoImpl implements ISelectQuestionDao{
	
    //��ȡ�������
    private ISelectQuestionFileReader selectQuestionFileReader = new SelectQuestionFileReaderImpl();
    //�������еļ�����ʱ��Ϊlist����(������ظ�)
    private ArrayList<SelectQuestion> selectQuestions = new ArrayList<SelectQuestion>(selectQuestionFileReader.getSelectQuestions());
    @Override
    public ArrayList<SelectQuestion> getSelectPaper(int count){
        HashSet<SelectQuestion> paperSelectQuestions = new HashSet<>();//�����洢���յ��Ծ���Ŀ���������ظ���
        while(paperSelectQuestions.size() != count){
            Random r = new Random();
            int index = r.nextInt(selectQuestions.size());//�������Χ[0,���ϳ���)
            paperSelectQuestions.add(selectQuestions.get(index));
        }
        return new ArrayList<SelectQuestion>(paperSelectQuestions);
    }
    
    
    private IStudentScoreFileWriter  studentScoreFileWriter = new StudentScoreFileWriterImpl();
	@Override
	public void saveScore(float score,String data,User user) {
		studentScoreFileWriter.score(score,data,user);
	}
	
	private ISelectQuestionFileWriter selectQuestionFileWriter = new SelectQuestionWriterImpl();
	@Override
	public void addSelectQuestion(SelectQuestion selectQuestion) {
		selectQuestionFileWriter.addSelectQuestion(selectQuestion);	
	}
}
