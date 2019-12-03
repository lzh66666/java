package nuc.ss.test.interfacedemo.usb;

public class Computer{
	public void plugin(USB usb){ // 接收USB接口实例
		usb.install();   // 调用接口方法
		usb.work();      // 调用接口方法
	}
}
