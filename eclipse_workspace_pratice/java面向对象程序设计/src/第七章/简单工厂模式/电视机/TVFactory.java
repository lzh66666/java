package ������.�򵥹���ģʽ.���ӻ�;

public class TVFactory {
	public TV produceTV (String brand) {
		if(brand.equalsIgnoreCase("haier")) {
			System.out.println("��������������");
			return new HaierTV();
		}else if(brand.equalsIgnoreCase("hisense")) {
			System.out.println("�������ŵ�����");
			return new HisenseTV();
		}else {
			System.out.println("��Ʒ�Ƶĵ��ӻ����ڿ�����...");
			return null;
		}
		
	}
}
