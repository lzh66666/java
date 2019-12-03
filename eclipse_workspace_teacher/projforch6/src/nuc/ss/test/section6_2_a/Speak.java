package nuc.ss.test.section6_2_a;

public abstract class Speak {
	private String info;
	public Speak(String s) {
		info = s;
	}
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public abstract void speakHello();
}
