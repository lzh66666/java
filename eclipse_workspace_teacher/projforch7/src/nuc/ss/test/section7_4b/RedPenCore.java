package nuc.ss.test.section7_4b;

//�����Ʒ��ConcreteProduct��֮һ��RedPenCore
public class RedPenCore extends PenCore {
    RedPenCore() {
    	super("��ɫ");
    }
    
    public void writeWord(String s) {
       System.out.println("д��" + getColor() + "����:" + s);
    }
}
