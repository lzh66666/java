package 第七章.工厂方法模式.计算器;

public class CalculateProduceMul implements CalculateProduce{

	@Override
	public void cal(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println(a + "*" + b + "=" + (a*b));
	}

}
