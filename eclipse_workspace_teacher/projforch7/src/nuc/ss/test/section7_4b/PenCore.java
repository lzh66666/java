package nuc.ss.test.section7_4b;

//�����Ʒ��Product��
public abstract class PenCore {
	private String color;
	
	public PenCore(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public abstract void writeWord(String s);
}
