package nuc.ss.test.section6_6;

class Student {
	private String id;
	private String name;
	private float score;
	
	public Student(String id, String name, float score) throws ScoreOutOfBoundsException {
		super();
		this.id = id;
		this.name = name;
		setScore(score);
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getScore() {
		return score;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setScore(float score) throws ScoreOutOfBoundsException {
		if (score >= 0 && score <= 100) {
			this.score = score;
		}else {
			//throw new ScoreOutOfBoundsException();
			throw new ScoreOutOfBoundsException("�ɼ������Ϸ���Χ��0-100������");
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ�ţ�" + id + "\t������" + name + "\t�ɼ���" + score;
	}
	
	
	
	
	
}
