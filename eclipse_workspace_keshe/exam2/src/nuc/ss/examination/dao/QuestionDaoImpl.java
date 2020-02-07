package nuc.ss.examination.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

import nuc.ss.examination.entry.Question;
import nuc.ss.examination.entry.User;
import nuc.ss.examination.util.IQuestionFileReader;
import nuc.ss.examination.util.IQuestionFileWriter;
import nuc.ss.examination.util.IStudentQuestionScoreFileWriter;
import nuc.ss.examination.util.QuestionFileReaderImpl;
import nuc.ss.examination.util.QuestionFileWriterImpl;
import nuc.ss.examination.util.StudentQuestionScoreFileWriterImpl;

/**
 * 与选择题类似
 * @author 卢泽华
 *
 */
public class QuestionDaoImpl implements IQuestionDao{
	private IQuestionFileReader questionFileReader = new QuestionFileReaderImpl();
	//将缓存中的集合临时改为list集合(有序可重复)
	private ArrayList<Question> questions = new ArrayList<Question>(questionFileReader.getQuestions());
	
	@Override
	public ArrayList<Question> getPaper(int count) {
		HashSet<Question> paperQuestions = new HashSet<>();//用来存储最终的试卷题目（无序无重复）
        while(paperQuestions.size() != count){
            Random r = new Random();
            int index = r.nextInt(questions.size());//随机数范围[0,集合长度)
            paperQuestions.add(questions.get(index));
        }
        return new ArrayList<Question>(paperQuestions);
	}
	
	
	private IStudentQuestionScoreFileWriter studentQuestionScoreFileWriter = new StudentQuestionScoreFileWriterImpl();
	
	@Override
	public void saveScore(float score, User user) {
		studentQuestionScoreFileWriter.score(score, user);
	}

	private IQuestionFileWriter questionFileWriter = new QuestionFileWriterImpl();
	@Override
	public void addQuestion(Question question) {
		questionFileWriter.addQuestion(question);
	}
	
	
}
