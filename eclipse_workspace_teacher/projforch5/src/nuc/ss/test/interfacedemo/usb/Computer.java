package nuc.ss.test.interfacedemo.usb;

public class Computer{
	public void plugin(USB usb){ // ����USB�ӿ�ʵ��
		usb.install();   // ���ýӿڷ���
		usb.work();      // ���ýӿڷ���
	}
}
