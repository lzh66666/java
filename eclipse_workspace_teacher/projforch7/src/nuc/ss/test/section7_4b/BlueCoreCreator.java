package nuc.ss.test.section7_4b;

//���幹���ߣ�ConcreteCreator����BlueCoreCreator
public class BlueCoreCreator extends PenCoreCreator {
	public PenCore getPenCore() { //��д��������
		return new BluePenCore();
	}
}
