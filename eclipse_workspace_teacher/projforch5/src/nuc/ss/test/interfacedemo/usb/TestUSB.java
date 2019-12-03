package nuc.ss.test.interfacedemo.usb;

public class TestUSB{
	public static void main(String args[]){
		Computer computer = new Computer();
		System.out.println("开始模拟USB设备的安装与工作...\n");
		computer.plugin(new Phone());  
		System.out.println();
		computer.plugin(new Print());  
		new Float(12.5f);
	}
}

