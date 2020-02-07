package nuc.ss.examination.entry;

public class Question {
	private String title;

	public Question() {

	}

	public Question(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	//想要将Question集合存入HashSet集合中，set集合无序不重复的功能
    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof SelectQuestion){
            Question anotherQuestion = (Question)obj;
            String anotherTitle = anotherQuestion.getTitle();
            if(this.title.equals(anotherTitle)){
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return this.title.hashCode();
    }

	@Override
	public String toString() {
		return title;
	}
    
}
