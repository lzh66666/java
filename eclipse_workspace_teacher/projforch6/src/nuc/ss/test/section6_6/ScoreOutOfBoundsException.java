package nuc.ss.test.section6_6;

class ScoreOutOfBoundsException extends RuntimeException{
	public ScoreOutOfBoundsException() {
		super("成绩非法！合法范围为：0-100");
		// TODO Auto-generated constructor stub
	}

	public ScoreOutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
