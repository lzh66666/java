package 第七章.工厂方法模式.柱体积;

public class TestFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("圆柱的体积为：" + PillarFactory.getPillar("circle").getVolume());
		System.out.println("四棱柱的体积为：" + PillarFactory.getPillar("rectangle").getVolume());
	}

}
