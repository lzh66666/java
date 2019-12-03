package nuc.ss.test.section7_4b;

public class BallPen {
	private PenCore core;
   
	public void usePenCore(PenCore core) {
		this.core = core;
	}
	
	public void write(String s) {
		core.writeWord(s);
	}
}
