package nuc.ss.test.section6_5e;

class Student {
	private String id;
	private String name;
	private float score;
	
	public Student(String id, String name, float score) throws Exception {
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

	public void setScore(float score) throws Exception {
		if (score >= 0 && score <= 100) {
			this.score = score;
		}else {
			throw new Exception("�ɼ��Ƿ����ɼ�Ӧ��0--100֮�䡣");
		}
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ѧ�ţ�" + id + "\t������" + name + "\t�ɼ���" + score;
	}
	
	
	
	
	
}
