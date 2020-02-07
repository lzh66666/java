package nuc.ss.examination.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import nuc.ss.examination.db.DatabaseConfig;
import nuc.ss.examination.entry.Score;

public class StudentScoreFileReaderImpl implements IStudentScoreFileReader{
	
	private static HashMap<String, Score> scoreBox = new HashMap<String, Score>();
	private static List<Score> scores = new ArrayList<Score>();
	{
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(DatabaseConfig.STUDENT + "·ÖÊý .txt"));
			String message = reader.readLine();
			while(message != null) {
				String[] values = message.split("-");
				if(values.length == 4) {
					scoreBox.put(values[0], new Score(values));
					scores.add(new Score(values));
				}else if(values.length == 5) {
					scoreBox.put(values[0], new Score(values[0],values[1],values[2],values[3],values[4]));
					scores.add(new Score(values[0],values[1],values[2],values[3],values[4]));
				}
				message = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	@Override
	public HashMap<String, Score> score() {
		return scoreBox;
	}

	@Override
	public Score scorePerson(String acount) {
		return scoreBox.get(acount);
	}

	@Override
	public List<Score> scores() {
		return scores;
	}

}
