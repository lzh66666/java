package nuc.ss.test.section7_4b;

//�����Ʒ��ConcreteProduct��֮����BlackPenCore
public class BlackPenCore extends PenCore {
    public BlackPenCore() {
    	super("��ɫ");
    }
    
    public void writeWord(String s) {
    	System.out.println("д��" + getColor() + "����:" + s);
    }
}
