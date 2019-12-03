package nuc.ss.test.section7_4b;

//具体产品（ConcreteProduct）之二：BluePenCore
public class BluePenCore extends PenCore {
    BluePenCore() {
    	super("蓝色");
    }
    
    public void writeWord(String s) {
    	System.out.println("写出" + getColor() + "的字:" + s);
    }
}
