package nuc.ss.test.section7_4b;

//���幹���ߣ�ConcreteCreator����RedCoreCreator
public class RedCoreCreator extends PenCoreCreator {
	public PenCore getPenCore() { //��д��������
		return new RedPenCore();
	}
}