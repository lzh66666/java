package 第七章.工厂方法模式.电视机;

public class HaierTVFactory implements TVFactory{

	@Override
	public TV produceTV(String brand) {
		// TODO Auto-generated method stub
		System.out.println("生产海尔电视中");
		return new HaierTV();
	}
}
