package 第七章.工厂方法模式.电视机;

public class HisenseTVFactory implements TVFactory{

	@Override
	public TV produceTV(String brand) {
		// TODO Auto-generated method stub
		System.out.println("生产海信电视中");
		return new HisenseTV();
	}
	
}
