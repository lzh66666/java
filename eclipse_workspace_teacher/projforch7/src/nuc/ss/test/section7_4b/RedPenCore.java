package nuc.ss.test.section7_4b;

//具体产品（ConcreteProduct）之一：RedPenCore
public class RedPenCore extends PenCore {
    RedPenCore() {
    	super("红色");
    }
    
    public void writeWord(String s) {
       System.out.println("写出" + getColor() + "的字:" + s);
    }
}
