package nuc.ss.calculate;

public class CalculateFactoryMul implements CalculateFactory{

	@Override
	public CalculateProduce calculate(String type) {
		// TODO Auto-generated method stub
		return new CalculateProduceMul();
	}
	
}
