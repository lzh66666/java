package nuc.ss.calculate;

public class CalculateFactoryAdd implements CalculateFactory{

	@Override
	public CalculateProduce calculate(String type) {
		// TODO Auto-generated method stub
		return new CalculateProduceAdd();
	}
	
}
