package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.Question;

public class QuestionFileReaderImpl implements IQuestionFileReader{
private HashSet<Question> questionBox = new HashSet<>();
    //获取全部集合
    public HashSet<Question> getQuestions(){
    	BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(DatabaseConfig.QUESTION_FILE_PATH));
            StringBuffer buffer = new StringBuffer("");
            String line = reader.readLine();
            while(line != null){
            	if(line.equals("*")) {
            		questionBox.add(new Question(buffer.toString()));
            		line = reader.readLine();
            		buffer.setLength(0);
            		continue;
            	}
                buffer.append(line);
                line = reader.readLine();
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
