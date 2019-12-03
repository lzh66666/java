package nuc.ss.test.interfacedemo.usb;

interface USB{ //����һ��USB�Ĳ�����׼
	public void install();
	public void work();
}

class Computer{
	public void plugin(USB usb){ // ����USB�ӿ�ʵ��
		usb.install();   // ���ýӿڷ���
		usb.work();      // ���ýӿڷ���
	}
}

class Phone implements USB{
	public void install(){
		System.out.println("��װ�ֻ���������");
	}
	public void work(){
		System.out.println("�ֻ�����Խ��й�����");
	}
}

class Print implements USB{
	public void install(){
		System.out.println("��װ��ӡ����������");
	}
	public void work(){
		System.out.println("�����ļ���ӡ��");
	}
}

public class TestInterface{
	public static void main(String args[]){
		Computer c = new Computer();
		c.plugin(new Phone());  // USB usb = new Phone();
		c.plugin(new Print());  // USB usb = new Print();
	}
}

