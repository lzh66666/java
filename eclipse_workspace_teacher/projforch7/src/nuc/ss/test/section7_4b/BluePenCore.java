package nuc.ss.test.section7_4b;

//�����Ʒ��ConcreteProduct��֮����BluePenCore
public class BluePenCore extends PenCore {
    BluePenCore() {
    	super("��ɫ");
    }
    
    public void writeWord(String s) {
    	System.out.println("д��" + getColor() + "����:" + s);
    }
}
