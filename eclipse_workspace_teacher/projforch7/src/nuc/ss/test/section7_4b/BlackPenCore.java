package nuc.ss.test.section7_4b;

//具体产品（ConcreteProduct）之三：BlackPenCore
public class BlackPenCore extends PenCore {
    public BlackPenCore() {
    	super("黑色");
    }
    
    public void writeWord(String s) {
    	System.out.println("写出" + getColor() + "的字:" + s);
    }
}
