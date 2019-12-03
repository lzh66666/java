package nuc.ss.test.section9_9;

class Student {
    private int num;
    private String name;
    private float score;
    
    public Student() {
    }
    
    public Student(int num, String name, float score){
      this.num = num;  
      this.name = name;  
      this.score = score;
    }
    
    public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String toString(){
      return "Ñ§ºÅ:" + num + " ; ÐÕÃû:" + name + " ; ³É¼¨:" + score;
    }
}

