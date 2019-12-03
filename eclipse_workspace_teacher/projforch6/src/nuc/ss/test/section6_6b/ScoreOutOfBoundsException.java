package nuc.ss.test.section6_6b;

class ScoreOutOfBoundsException extends RuntimeException{
	private String info;
	
	public ScoreOutOfBoundsException() {
		info = "成绩非法！合法范围为：0-100";
	}

	public ScoreOutOfBoundsException(String message) {
		info = message;
	}
	
	@Override
	public String toString() {
		return "自定义异常：" + info;
	}
	
}
