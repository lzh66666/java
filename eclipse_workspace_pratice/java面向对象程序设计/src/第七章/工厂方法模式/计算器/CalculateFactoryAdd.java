package 第七章.工厂方法模式.计算器;

public class CalculateFactoryAdd implements CalculateFactory{

	@Override
	public CalculateProduce calculate(String type) {
		// TODO Auto-generated method stub
		return new CalculateProduceAdd();
	}
	
}
