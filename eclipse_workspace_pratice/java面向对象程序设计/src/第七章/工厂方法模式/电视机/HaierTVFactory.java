package ������.��������ģʽ.���ӻ�;

public class HaierTVFactory implements TVFactory{

	@Override
	public TV produceTV(String brand) {
		// TODO Auto-generated method stub
		System.out.println("��������������");
		return new HaierTV();
	}
}
