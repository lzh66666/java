package nuc.ss.singer;

public abstract class AbstractSinger {
	String name;
	String style;
	
	public AbstractSinger(String name, String style) {
		super();
		this.name = name;
		this.style = style;
	}
	
	public void introduce() {
		System.out.println("Hello£¨Œ“ «∏Ë ÷°£");
	}
	
	public abstract void sing();
	
}
