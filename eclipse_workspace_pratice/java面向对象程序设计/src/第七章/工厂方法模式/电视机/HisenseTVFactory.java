package ������.��������ģʽ.���ӻ�;

public class HisenseTVFactory implements TVFactory{

	@Override
	public TV produceTV(String brand) {
		// TODO Auto-generated method stub
		System.out.println("�������ŵ�����");
		return new HisenseTV();
	}
	
}
