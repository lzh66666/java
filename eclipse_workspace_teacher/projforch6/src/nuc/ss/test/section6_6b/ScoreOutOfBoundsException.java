package nuc.ss.test.section6_6b;

class ScoreOutOfBoundsException extends RuntimeException{
	private String info;
	
	public ScoreOutOfBoundsException() {
		info = "�ɼ��Ƿ����Ϸ���ΧΪ��0-100";
	}

	public ScoreOutOfBoundsException(String message) {
		info = message;
	}
	
	@Override
	public String toString() {
		return "�Զ����쳣��" + info;
	}
	
}
