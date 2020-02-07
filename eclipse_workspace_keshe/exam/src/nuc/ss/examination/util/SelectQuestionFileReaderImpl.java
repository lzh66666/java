package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.SelectQuestion;

public class SelectQuestionFileReaderImpl implements ISelectQuestionFileReader{
	private HashSet<SelectQuestion> questionBox = new HashSet<SelectQuestion>();
	
    public HashSet<SelectQuestion> getSelectQuestions(){
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(DatabaseConfig.SELECT_QUESTION_FILE_PATH));
            String question = reader.readLine();
            while(question != null){
                String[] values = question.split("#");
                String title = values[0];
                String answer = values[1];
                if(values.length == 2){//没有图片信息，只有题干和答案
                    questionBox.add(new SelectQuestion(title,answer));
                }else if(values.length == 3){//含有图片信息
                    questionBox.add(new SelectQuestion(title,answer,values[2]));
                }
                question = reader.readLine();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return questionBox;
    }
}
