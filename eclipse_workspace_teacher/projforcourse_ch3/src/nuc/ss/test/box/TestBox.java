package nuc.ss.test.box;

public class TestBox {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1 = new Box(10);
		Box b2 = new Box(10,20,30);
		System.out.println("正方体体积："+b1.getVolume());
		System.out.println("长方体体积："+b2.getVolume());		
	}
}

