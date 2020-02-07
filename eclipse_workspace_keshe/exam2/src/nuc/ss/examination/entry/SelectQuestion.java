package nuc.ss.examination.entry;

public class SelectQuestion {

    private String title;
    private String answer;
    private String picture;//存储图片路径

    public SelectQuestion(){}
    public SelectQuestion(String title,String answer){
        this.title = title;
        this.answer = answer;
    }
    public SelectQuestion(String title,String answer,String picture){
        this.title = title;
        this.answer = answer;
        this.picture = picture;
    }

    public String getAnswer() {
        return answer;
    }

    public String getTitle() {
        return title;
    }

    public String getPicture() {
        return picture;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
    
    //想要将SelectQuestion集合存入HashSet集合中，set集合无序不重复的功能
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof SelectQuestion){
            SelectQuestion anotherQuestion = (SelectQuestion)obj;
            String thisTitle = title.substring(0,title.indexOf("<br>"));
            String anotherTitle = anotherQuestion.getTitle().substring(0,anotherQuestion.getTitle().indexOf("<br>"));
            if(thisTitle.equals(anotherTitle)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return title.substring(0,title.indexOf("<br>")).hashCode();
    }
    
	@Override
	public String toString() {
		return title + "#" + answer + "#" + picture;
	}
    
    
}
