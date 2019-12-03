package nuc.ss.test.section7_4b;

//具体构造者（ConcreteCreator）：BlackCoreCreator
public class BlackCoreCreator extends PenCoreCreator {
	public PenCore getPenCore() { //重写工厂方法
		return new BlackPenCore();
	}
}

