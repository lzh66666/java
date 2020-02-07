package nuc.ss.examination.entry;

public class Score {
	private String name;// 属性用来存储用户的姓名
	private String account;// 属性用来存储账号
	private float score;//存储学生的分数
	private String data;
	
	private float questionScore;
	
	public Score(String[] str) {
		this.account = str[0];
		this.name = str[1];
		this.data = str[2];
		this.score = Float.parseFloat(str[3]);
	}
	public Score(String account,String name,String data,String score,String questionScore) {
		this.account = account;
		this.name = name;
		this.data = data;
		this.score = Float.parseFloat(score);
		this.questionScore = Float.parseFloat(questionScore);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	
	public float getQuestionScore() {
		return questionScore;
	}
	public void setQuestionScore(float questionScore) {
		this.questionScore = questionScore;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return account + "-" +  name + "-" + data + "-" + score + "-" + questionScore;
	}
	
}
