package nuc.ss.test.interfacedemo.usb;

public class Phone implements USB{
	public void install(){
		System.out.println("安装手机驱动程序。");
	}
	public void work(){
		System.out.println("手机与电脑进行工作。");
	}
}
