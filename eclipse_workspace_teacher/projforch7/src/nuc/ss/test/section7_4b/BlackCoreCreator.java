package nuc.ss.test.section7_4b;

//���幹���ߣ�ConcreteCreator����BlackCoreCreator
public class BlackCoreCreator extends PenCoreCreator {
	public PenCore getPenCore() { //��д��������
		return new BlackPenCore();
	}
}

